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
import java.time.OffsetDateTime;

/**
 * RunManually
 */
@javax.annotation.Generated(value = "org.influxdata.codegen.InfluxJavaGenerator", date = "2019-03-20T14:55:38.715334+01:00[Europe/Prague]")
public class RunManually {
  public static final String SERIALIZED_NAME_SCHEDULED_FOR = "scheduledFor";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_FOR)
  private OffsetDateTime scheduledFor = null;

  public RunManually scheduledFor(OffsetDateTime scheduledFor) {
    this.scheduledFor = scheduledFor;
    return this;
  }

   /**
   * Time used for run&#39;s \&quot;now\&quot; option, RFC3339.  Default is the server&#39;s now time.
   * @return scheduledFor
  **/
  @ApiModelProperty(value = "Time used for run's \"now\" option, RFC3339.  Default is the server's now time.")
  public OffsetDateTime getScheduledFor() {
    return scheduledFor;
  }

  public void setScheduledFor(OffsetDateTime scheduledFor) {
    this.scheduledFor = scheduledFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunManually runManually = (RunManually) o;
    return Objects.equals(this.scheduledFor, runManually.scheduledFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledFor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunManually {\n");
    sb.append("    scheduledFor: ").append(toIndentedString(scheduledFor)).append("\n");
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
