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


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.CheckBaseTags;
import com.influxdb.client.domain.DashboardQuery;
import com.influxdb.client.domain.Label;
import com.influxdb.client.domain.TaskStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * CheckBase
 */

public class CheckBase {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID;

  public static final String SERIALIZED_NAME_AUTHORIZATION_I_D = "authorizationID";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_I_D)
  private String authorizationID;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private DashboardQuery query = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskStatusType status = null;

  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  private String every;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private String offset;

  public static final String SERIALIZED_NAME_CRON = "cron";
  @SerializedName(SERIALIZED_NAME_CRON)
  private String cron;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<CheckBaseTags> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE_TEMPLATE = "statusMessageTemplate";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE_TEMPLATE)
  private String statusMessageTemplate;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Label> labels = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public CheckBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CheckBase orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * the ID of the organization that owns this check.
   * @return orgID
  **/
  @ApiModelProperty(required = true, value = "the ID of the organization that owns this check.")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

   /**
   * The ID of the authorization used to create this check.
   * @return authorizationID
  **/
  @ApiModelProperty(value = "The ID of the authorization used to create this check.")
  public String getAuthorizationID() {
    return authorizationID;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public CheckBase query(DashboardQuery query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(required = true, value = "")
  public DashboardQuery getQuery() {
    return query;
  }

  public void setQuery(DashboardQuery query) {
    this.query = query;
  }

  public CheckBase status(TaskStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public TaskStatusType getStatus() {
    return status;
  }

  public void setStatus(TaskStatusType status) {
    this.status = status;
  }

  public CheckBase every(String every) {
    this.every = every;
    return this;
  }

   /**
   * Check repetition interval
   * @return every
  **/
  @ApiModelProperty(value = "Check repetition interval")
  public String getEvery() {
    return every;
  }

  public void setEvery(String every) {
    this.every = every;
  }

  public CheckBase offset(String offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Duration to delay after the schedule, before executing check.
   * @return offset
  **/
  @ApiModelProperty(value = "Duration to delay after the schedule, before executing check.")
  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }

  public CheckBase cron(String cron) {
    this.cron = cron;
    return this;
  }

   /**
   * Check repetition interval in the form &#39;* * * * * *&#39;;
   * @return cron
  **/
  @ApiModelProperty(value = "Check repetition interval in the form '* * * * * *';")
  public String getCron() {
    return cron;
  }

  public void setCron(String cron) {
    this.cron = cron;
  }

  public CheckBase tags(List<CheckBaseTags> tags) {
    this.tags = tags;
    return this;
  }

  public CheckBase addTagsItem(CheckBaseTags tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * tags to write to each status
   * @return tags
  **/
  @ApiModelProperty(value = "tags to write to each status")
  public List<CheckBaseTags> getTags() {
    return tags;
  }

  public void setTags(List<CheckBaseTags> tags) {
    this.tags = tags;
  }

  public CheckBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the check
   * @return description
  **/
  @ApiModelProperty(value = "An optional description of the check")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CheckBase statusMessageTemplate(String statusMessageTemplate) {
    this.statusMessageTemplate = statusMessageTemplate;
    return this;
  }

   /**
   * template that is used to generate and write a status message
   * @return statusMessageTemplate
  **/
  @ApiModelProperty(value = "template that is used to generate and write a status message")
  public String getStatusMessageTemplate() {
    return statusMessageTemplate;
  }

  public void setStatusMessageTemplate(String statusMessageTemplate) {
    this.statusMessageTemplate = statusMessageTemplate;
  }

  public CheckBase labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public CheckBase addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckBase checkBase = (CheckBase) o;
    return Objects.equals(this.id, checkBase.id) &&
        Objects.equals(this.name, checkBase.name) &&
        Objects.equals(this.orgID, checkBase.orgID) &&
        Objects.equals(this.authorizationID, checkBase.authorizationID) &&
        Objects.equals(this.createdAt, checkBase.createdAt) &&
        Objects.equals(this.updatedAt, checkBase.updatedAt) &&
        Objects.equals(this.query, checkBase.query) &&
        Objects.equals(this.status, checkBase.status) &&
        Objects.equals(this.every, checkBase.every) &&
        Objects.equals(this.offset, checkBase.offset) &&
        Objects.equals(this.cron, checkBase.cron) &&
        Objects.equals(this.tags, checkBase.tags) &&
        Objects.equals(this.description, checkBase.description) &&
        Objects.equals(this.statusMessageTemplate, checkBase.statusMessageTemplate) &&
        Objects.equals(this.labels, checkBase.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orgID, authorizationID, createdAt, updatedAt, query, status, every, offset, cron, tags, description, statusMessageTemplate, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckBase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    authorizationID: ").append(toIndentedString(authorizationID)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    statusMessageTemplate: ").append(toIndentedString(statusMessageTemplate)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

