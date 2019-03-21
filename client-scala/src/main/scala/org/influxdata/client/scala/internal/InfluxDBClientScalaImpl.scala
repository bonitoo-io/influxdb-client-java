/**
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.influxdata.client.scala.internal

import akka.stream.OverflowStrategy
import javax.annotation.Nonnull
import org.influxdata.LogLevel
import org.influxdata.client.InfluxDBClientOptions
import org.influxdata.client.domain.Check
import org.influxdata.client.internal.{AbstractInfluxDBClient, InfluxDBService}
import org.influxdata.client.scala.{InfluxDBClientScala, QueryScalaApi}
import org.influxdata.client.service.QueryService

/**
 * @author Jakub Bednar (bednar@github) (08/02/2019 09:26)
 */
class InfluxDBClientScalaImpl(@Nonnull options: InfluxDBClientOptions,
                              @Nonnull val bufferSize: Int,
                              @Nonnull val overflowStrategy: OverflowStrategy) extends AbstractInfluxDBClient(options, classOf[InfluxDBService]) with InfluxDBClientScala {
  /**
   * Get the Query client.
   *
   * @return the new client instance for the Query API
   */
  override def getQueryScalaApi(): QueryScalaApi = new QueryScalaApiImpl(retrofit.create(classOf[QueryService]), bufferSize, overflowStrategy)

  /**
   * Get the health of an instance.
   *
   * @return health of an instance
   */
  override def health: Check = health(healthService.healthGet(null))

  /**
   * Gets the [[LogLevel]] that is used for logging requests and responses.
   *
   * @return the [[LogLevel]] that is used for logging requests and responses
   */
  override def getLogLevel: LogLevel = getLogLevel(loggingInterceptor)

  /**
   * Sets the log level for the request and response information.
   *
   * @param logLevel the log level to set.
   * @return the [[InfluxDBClientScala]] instance to be able to use it in a fluent manner.
   */
  override def setLogLevel(logLevel: LogLevel): InfluxDBClientScala = {
    setLogLevel(loggingInterceptor, logLevel)
    this
  }

  /**
   * Enable Gzip compress for http request body.
   *
   * Currently only the "Write" endpoint supports the Gzip compression.
   *
   * @return the [[InfluxDBClientScala]] instance to be able to use it in a fluent manner.
   */
  override def enableGzip(): InfluxDBClientScala = {
    gzipInterceptor.enableGzip()
    this
  }

  /**
   * Disable Gzip compress for http request body.
   *
   * @return the [[InfluxDBClientScala]] instance to be able to use it in a fluent manner.
   */
  override def disableGzip(): InfluxDBClientScala = {
    gzipInterceptor.disableGzip()
    this
  }

  /**
   * Returns whether Gzip compress for http request body is enabled.
   *
   * @return true if gzip is enabled.
   */
  override def isGzipEnabled: Boolean = gzipInterceptor.isEnabledGzip
}
