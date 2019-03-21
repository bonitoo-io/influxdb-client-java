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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * optional set of contraints on the resources the query can consume
 */
@ApiModel(description = "optional set of contraints on the resources the query can consume")
@javax.annotation.Generated(value = "org.influxdata.codegen.InfluxJavaGenerator", date = "2019-03-21T11:26:21.429+01:00[Europe/Prague]")
public class QuerySpecificationResources {
  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Object priority = null;

  public static final String SERIALIZED_NAME_CONCURRENCY_QUOTA = "concurrency_quota";
  @SerializedName(SERIALIZED_NAME_CONCURRENCY_QUOTA)
  private Integer concurrencyQuota = 0;

  public static final String SERIALIZED_NAME_MEMORY_BYTES_QUOTA = "memory_bytes_quota";
  @SerializedName(SERIALIZED_NAME_MEMORY_BYTES_QUOTA)
  private Integer memoryBytesQuota = 0;

  public QuerySpecificationResources priority(Object priority) {
    this.priority = priority;
    return this;
  }

   /**
   * priority of the query
   * @return priority
  **/
  @ApiModelProperty(value = "priority of the query")
  public Object getPriority() {
    return priority;
  }

  public void setPriority(Object priority) {
    this.priority = priority;
  }

  public QuerySpecificationResources concurrencyQuota(Integer concurrencyQuota) {
    this.concurrencyQuota = concurrencyQuota;
    return this;
  }

   /**
   * number of concurrent workers allowed to process this query; 0 indicates the planner can pick the optimal concurrency.
   * @return concurrencyQuota
  **/
  @ApiModelProperty(value = "number of concurrent workers allowed to process this query; 0 indicates the planner can pick the optimal concurrency.")
  public Integer getConcurrencyQuota() {
    return concurrencyQuota;
  }

  public void setConcurrencyQuota(Integer concurrencyQuota) {
    this.concurrencyQuota = concurrencyQuota;
  }

  public QuerySpecificationResources memoryBytesQuota(Integer memoryBytesQuota) {
    this.memoryBytesQuota = memoryBytesQuota;
    return this;
  }

   /**
   * number of bytes of RAM this query may consume; 0 means unlimited.
   * @return memoryBytesQuota
  **/
  @ApiModelProperty(value = "number of bytes of RAM this query may consume; 0 means unlimited.")
  public Integer getMemoryBytesQuota() {
    return memoryBytesQuota;
  }

  public void setMemoryBytesQuota(Integer memoryBytesQuota) {
    this.memoryBytesQuota = memoryBytesQuota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySpecificationResources querySpecificationResources = (QuerySpecificationResources) o;
    return Objects.equals(this.priority, querySpecificationResources.priority) &&
        Objects.equals(this.concurrencyQuota, querySpecificationResources.concurrencyQuota) &&
        Objects.equals(this.memoryBytesQuota, querySpecificationResources.memoryBytesQuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, concurrencyQuota, memoryBytesQuota);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySpecificationResources {\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    concurrencyQuota: ").append(toIndentedString(concurrencyQuota)).append("\n");
    sb.append("    memoryBytesQuota: ").append(toIndentedString(memoryBytesQuota)).append("\n");
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

