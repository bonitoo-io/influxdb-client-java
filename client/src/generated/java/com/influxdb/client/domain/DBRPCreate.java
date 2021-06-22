/*
 * Influx OSS API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

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
 * DBRPCreate
 */

public class DBRPCreate {
  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private String org;

  public static final String SERIALIZED_NAME_BUCKET_I_D = "bucketID";
  @SerializedName(SERIALIZED_NAME_BUCKET_I_D)
  private String bucketID;

  public static final String SERIALIZED_NAME_DATABASE = "database";
  @SerializedName(SERIALIZED_NAME_DATABASE)
  private String database;

  public static final String SERIALIZED_NAME_RETENTION_POLICY = "retention_policy";
  @SerializedName(SERIALIZED_NAME_RETENTION_POLICY)
  private String retentionPolicy;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public DBRPCreate orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * the organization ID that owns this mapping.
   * @return orgID
  **/
  @ApiModelProperty(value = "the organization ID that owns this mapping.")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public DBRPCreate org(String org) {
    this.org = org;
    return this;
  }

   /**
   * the organization that owns this mapping.
   * @return org
  **/
  @ApiModelProperty(value = "the organization that owns this mapping.")
  public String getOrg() {
    return org;
  }

  public void setOrg(String org) {
    this.org = org;
  }

  public DBRPCreate bucketID(String bucketID) {
    this.bucketID = bucketID;
    return this;
  }

   /**
   * the bucket ID used as target for the translation.
   * @return bucketID
  **/
  @ApiModelProperty(required = true, value = "the bucket ID used as target for the translation.")
  public String getBucketID() {
    return bucketID;
  }

  public void setBucketID(String bucketID) {
    this.bucketID = bucketID;
  }

  public DBRPCreate database(String database) {
    this.database = database;
    return this;
  }

   /**
   * InfluxDB v1 database
   * @return database
  **/
  @ApiModelProperty(required = true, value = "InfluxDB v1 database")
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public DBRPCreate retentionPolicy(String retentionPolicy) {
    this.retentionPolicy = retentionPolicy;
    return this;
  }

   /**
   * InfluxDB v1 retention policy
   * @return retentionPolicy
  **/
  @ApiModelProperty(required = true, value = "InfluxDB v1 retention policy")
  public String getRetentionPolicy() {
    return retentionPolicy;
  }

  public void setRetentionPolicy(String retentionPolicy) {
    this.retentionPolicy = retentionPolicy;
  }

  public DBRPCreate _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Specify if this mapping represents the default retention policy for the database specificed.
   * @return _default
  **/
  @ApiModelProperty(value = "Specify if this mapping represents the default retention policy for the database specificed.")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBRPCreate dbRPCreate = (DBRPCreate) o;
    return Objects.equals(this.orgID, dbRPCreate.orgID) &&
        Objects.equals(this.org, dbRPCreate.org) &&
        Objects.equals(this.bucketID, dbRPCreate.bucketID) &&
        Objects.equals(this.database, dbRPCreate.database) &&
        Objects.equals(this.retentionPolicy, dbRPCreate.retentionPolicy) &&
        Objects.equals(this._default, dbRPCreate._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgID, org, bucketID, database, retentionPolicy, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBRPCreate {\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    bucketID: ").append(toIndentedString(bucketID)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

