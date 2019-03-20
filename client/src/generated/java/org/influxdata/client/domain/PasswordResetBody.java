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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * PasswordResetBody
 */
@javax.annotation.Generated(value = "org.influxdata.codegen.InfluxJavaGenerator", date = "2019-03-20T15:07:36.004852+01:00[Europe/Prague]")
public class PasswordResetBody {
  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password = null;

  public PasswordResetBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "")
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
    PasswordResetBody passwordResetBody = (PasswordResetBody) o;
    return Objects.equals(this.password, passwordResetBody.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordResetBody {\n");
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

