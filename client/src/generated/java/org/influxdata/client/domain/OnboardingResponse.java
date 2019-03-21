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
import org.influxdata.client.domain.Authorization;
import org.influxdata.client.domain.Bucket;
import org.influxdata.client.domain.Organization;
import org.influxdata.client.domain.User;

/**
 * OnboardingResponse
 */
@javax.annotation.Generated(value = "org.influxdata.codegen.InfluxJavaGenerator", date = "2019-03-21T11:26:21.429+01:00[Europe/Prague]")
public class OnboardingResponse {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user = null;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private Organization org = null;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private Bucket bucket = null;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private Authorization auth = null;

  public OnboardingResponse user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public OnboardingResponse org(Organization org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @ApiModelProperty(value = "")
  public Organization getOrg() {
    return org;
  }

  public void setOrg(Organization org) {
    this.org = org;
  }

  public OnboardingResponse bucket(Bucket bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @ApiModelProperty(value = "")
  public Bucket getBucket() {
    return bucket;
  }

  public void setBucket(Bucket bucket) {
    this.bucket = bucket;
  }

  public OnboardingResponse auth(Authorization auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(value = "")
  public Authorization getAuth() {
    return auth;
  }

  public void setAuth(Authorization auth) {
    this.auth = auth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingResponse onboardingResponse = (OnboardingResponse) o;
    return Objects.equals(this.user, onboardingResponse.user) &&
        Objects.equals(this.org, onboardingResponse.org) &&
        Objects.equals(this.bucket, onboardingResponse.bucket) &&
        Objects.equals(this.auth, onboardingResponse.auth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, org, bucket, auth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingResponse {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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

