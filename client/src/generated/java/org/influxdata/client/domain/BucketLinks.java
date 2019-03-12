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
 * BucketLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-12T14:39:51.939+01:00[Europe/Prague]")
public class BucketLinks {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private String labels = null;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private String logs = null;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private String members = null;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private String org = null;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private String owners = null;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self = null;

  public static final String SERIALIZED_NAME_WRITE = "write";
  @SerializedName(SERIALIZED_NAME_WRITE)
  private String write = null;

  public BucketLinks labels(String labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public String getLabels() {
    return labels;
  }

  public void setLabels(String labels) {
    this.labels = labels;
  }

  public BucketLinks logs(String logs) {
    this.logs = logs;
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @ApiModelProperty(value = "")
  public String getLogs() {
    return logs;
  }

  public void setLogs(String logs) {
    this.logs = logs;
  }

  public BucketLinks members(String members) {
    this.members = members;
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(value = "")
  public String getMembers() {
    return members;
  }

  public void setMembers(String members) {
    this.members = members;
  }

  public BucketLinks org(String org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @ApiModelProperty(value = "")
  public String getOrg() {
    return org;
  }

  public void setOrg(String org) {
    this.org = org;
  }

  public BucketLinks owners(String owners) {
    this.owners = owners;
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @ApiModelProperty(value = "")
  public String getOwners() {
    return owners;
  }

  public void setOwners(String owners) {
    this.owners = owners;
  }

  public BucketLinks self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public BucketLinks write(String write) {
    this.write = write;
    return this;
  }

   /**
   * Get write
   * @return write
  **/
  @ApiModelProperty(value = "")
  public String getWrite() {
    return write;
  }

  public void setWrite(String write) {
    this.write = write;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BucketLinks bucketLinks = (BucketLinks) o;
    return Objects.equals(this.labels, bucketLinks.labels) &&
        Objects.equals(this.logs, bucketLinks.logs) &&
        Objects.equals(this.members, bucketLinks.members) &&
        Objects.equals(this.org, bucketLinks.org) &&
        Objects.equals(this.owners, bucketLinks.owners) &&
        Objects.equals(this.self, bucketLinks.self) &&
        Objects.equals(this.write, bucketLinks.write);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, logs, members, org, owners, self, write);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketLinks {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
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

