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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * TelegrafPluginInputRedisConfig
 */
@javax.annotation.Generated(value = "org.influxdata.codegen.InfluxJavaGenerator", date = "2019-03-20T15:07:36.004852+01:00[Europe/Prague]")
public class TelegrafPluginInputRedisConfig {
  public static final String SERIALIZED_NAME_SERVERS = "servers";
  @SerializedName(SERIALIZED_NAME_SERVERS)
  private List<String> servers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password = null;

  public TelegrafPluginInputRedisConfig servers(List<String> servers) {
    this.servers = servers;
    return this;
  }

  public TelegrafPluginInputRedisConfig addServersItem(String serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @ApiModelProperty(value = "")
  public List<String> getServers() {
    return servers;
  }

  public void setServers(List<String> servers) {
    this.servers = servers;
  }

  public TelegrafPluginInputRedisConfig password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelegrafPluginInputRedisConfig telegrafPluginInputRedisConfig = (TelegrafPluginInputRedisConfig) o;
    return Objects.equals(this.servers, telegrafPluginInputRedisConfig.servers) &&
        Objects.equals(this.password, telegrafPluginInputRedisConfig.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servers, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelegrafPluginInputRedisConfig {\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

