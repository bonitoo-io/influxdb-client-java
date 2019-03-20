/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.influxdata.client.domain;

import java.util.Objects;
import java.util.Arrays;
import java.util.List;
import org.influxdata.client.domain.TelegrafPluginConfig;
import org.influxdata.client.domain.TelegrafPluginInputDockerConfig;
import org.influxdata.client.domain.TelegrafPluginInputFileConfig;
import org.influxdata.client.domain.TelegrafPluginInputKubernetesConfig;
import org.influxdata.client.domain.TelegrafPluginInputLogParserConfig;
import org.influxdata.client.domain.TelegrafPluginInputProcstatConfig;
import org.influxdata.client.domain.TelegrafPluginInputPrometheusConfig;
import org.influxdata.client.domain.TelegrafPluginInputRedisConfig;
import org.influxdata.client.domain.TelegrafPluginInputSyslogConfig;
import org.influxdata.client.domain.TelegrafPluginOutputFileConfig;
import org.influxdata.client.domain.TelegrafPluginOutputFileConfigFiles;
import org.influxdata.client.domain.TelegrafPluginOutputInfluxDBV2Config;

/**
 * TelegrafRequestConfig
 */
@javax.annotation.Generated(value = "org.influxdata.codegen.InfluxJavaGenerator", date = "2019-03-20T14:55:38.715334+01:00[Europe/Prague]")
public class TelegrafRequestConfig {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelegrafRequestConfig {\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
