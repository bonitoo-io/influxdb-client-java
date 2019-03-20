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
 * OnboardingRequest
 */
@javax.annotation.Generated(value = "org.influxdata.codegen.InfluxJavaGenerator", date = "2019-03-20T15:07:36.004852+01:00[Europe/Prague]")
public class OnboardingRequest {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password = null;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private String org = null;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket = null;

  public static final String SERIALIZED_NAME_RETENTION_PERIOD_HRS = "retentionPeriodHrs";
  @SerializedName(SERIALIZED_NAME_RETENTION_PERIOD_HRS)
  private Integer retentionPeriodHrs = null;

  public OnboardingRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public OnboardingRequest password(String password) {
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

  public OnboardingRequest org(String org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrg() {
    return org;
  }

  public void setOrg(String org) {
    this.org = org;
  }

  public OnboardingRequest bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public OnboardingRequest retentionPeriodHrs(Integer retentionPeriodHrs) {
    this.retentionPeriodHrs = retentionPeriodHrs;
    return this;
  }

   /**
   * Get retentionPeriodHrs
   * @return retentionPeriodHrs
  **/
  @ApiModelProperty(value = "")
  public Integer getRetentionPeriodHrs() {
    return retentionPeriodHrs;
  }

  public void setRetentionPeriodHrs(Integer retentionPeriodHrs) {
    this.retentionPeriodHrs = retentionPeriodHrs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingRequest onboardingRequest = (OnboardingRequest) o;
    return Objects.equals(this.username, onboardingRequest.username) &&
        Objects.equals(this.password, onboardingRequest.password) &&
        Objects.equals(this.org, onboardingRequest.org) &&
        Objects.equals(this.bucket, onboardingRequest.bucket) &&
        Objects.equals(this.retentionPeriodHrs, onboardingRequest.retentionPeriodHrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, org, bucket, retentionPeriodHrs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    retentionPeriodHrs: ").append(toIndentedString(retentionPeriodHrs)).append("\n");
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

