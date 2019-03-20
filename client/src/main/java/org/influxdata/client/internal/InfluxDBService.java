/*
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
package org.influxdata.client.internal;

import javax.annotation.Nonnull;

import org.influxdata.client.domain.Check;

import io.reactivex.Maybe;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @author Jakub Bednar (bednar@github) (05/09/2018 13:30)
 */
public interface InfluxDBService {

    //
    // Health
    //
    @GET("/health")
    @Nonnull
    @Headers("Content-Type: application/json")
    Call<Check> health();

    //
    // Ready
    //
    @GET("/ready")
    @Nonnull
    @Headers("Content-Type: application/json")
    Call<Check> ready();

    // Write
    //
    @POST("/api/v2/write")
    @Nonnull
    Maybe<Response<Void>> writePoints(@Query("org") final String orgID,
                                      @Query("bucket") final String bucket,
                                      @Query("precision") final String precision,
                                      @Body final RequestBody points);
}