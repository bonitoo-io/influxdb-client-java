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
import com.influxdb.client.domain.Label;
import com.influxdb.client.domain.NotificationRuleBaseLinks;
import com.influxdb.client.domain.StatusRule;
import com.influxdb.client.domain.TagRule;
import com.influxdb.client.domain.TaskStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * NotificationRuleBase
 */

public class NotificationRuleBase extends PostNotificationRule {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ENDPOINT_I_D = "endpointID";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_I_D)
  private String endpointID;

  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID;

  public static final String SERIALIZED_NAME_OWNER_I_D = "ownerID";
  @SerializedName(SERIALIZED_NAME_OWNER_I_D)
  private String ownerID;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskStatusType status = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLEEP_UNTIL = "sleepUntil";
  @SerializedName(SERIALIZED_NAME_SLEEP_UNTIL)
  private String sleepUntil;

  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  private String every;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private String offset;

  public static final String SERIALIZED_NAME_RUNBOOK_LINK = "runbookLink";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_LINK)
  private String runbookLink;

  public static final String SERIALIZED_NAME_LIMIT_EVERY = "limitEvery";
  @SerializedName(SERIALIZED_NAME_LIMIT_EVERY)
  private Integer limitEvery;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_TAG_RULES = "tagRules";
  @SerializedName(SERIALIZED_NAME_TAG_RULES)
  private List<TagRule> tagRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS_RULES = "statusRules";
  @SerializedName(SERIALIZED_NAME_STATUS_RULES)
  private List<StatusRule> statusRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Label> labels = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private NotificationRuleBaseLinks links = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public NotificationRuleBase endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

   /**
   * Get endpointID
   * @return endpointID
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }

  public NotificationRuleBase orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * The ID of the organization that owns this notification rule.
   * @return orgID
  **/
  @ApiModelProperty(required = true, value = "The ID of the organization that owns this notification rule.")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

   /**
   * The ID of creator used to create this notification rule.
   * @return ownerID
  **/
  @ApiModelProperty(value = "The ID of creator used to create this notification rule.")
  public String getOwnerID() {
    return ownerID;
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

  public NotificationRuleBase status(TaskStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public TaskStatusType getStatus() {
    return status;
  }

  public void setStatus(TaskStatusType status) {
    this.status = status;
  }

  public NotificationRuleBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human-readable name describing the notification rule.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Human-readable name describing the notification rule.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationRuleBase sleepUntil(String sleepUntil) {
    this.sleepUntil = sleepUntil;
    return this;
  }

   /**
   * Get sleepUntil
   * @return sleepUntil
  **/
  @ApiModelProperty(value = "")
  public String getSleepUntil() {
    return sleepUntil;
  }

  public void setSleepUntil(String sleepUntil) {
    this.sleepUntil = sleepUntil;
  }

  public NotificationRuleBase every(String every) {
    this.every = every;
    return this;
  }

   /**
   * The notification repetition interval.
   * @return every
  **/
  @ApiModelProperty(value = "The notification repetition interval.")
  public String getEvery() {
    return every;
  }

  public void setEvery(String every) {
    this.every = every;
  }

  public NotificationRuleBase offset(String offset) {
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

  public NotificationRuleBase runbookLink(String runbookLink) {
    this.runbookLink = runbookLink;
    return this;
  }

   /**
   * Get runbookLink
   * @return runbookLink
  **/
  @ApiModelProperty(value = "")
  public String getRunbookLink() {
    return runbookLink;
  }

  public void setRunbookLink(String runbookLink) {
    this.runbookLink = runbookLink;
  }

  public NotificationRuleBase limitEvery(Integer limitEvery) {
    this.limitEvery = limitEvery;
    return this;
  }

   /**
   * Don&#39;t notify me more than &lt;limit&gt; times every &lt;limitEvery&gt; seconds. If set, limit cannot be empty.
   * @return limitEvery
  **/
  @ApiModelProperty(value = "Don't notify me more than <limit> times every <limitEvery> seconds. If set, limit cannot be empty.")
  public Integer getLimitEvery() {
    return limitEvery;
  }

  public void setLimitEvery(Integer limitEvery) {
    this.limitEvery = limitEvery;
  }

  public NotificationRuleBase limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Don&#39;t notify me more than &lt;limit&gt; times every &lt;limitEvery&gt; seconds. If set, limitEvery cannot be empty.
   * @return limit
  **/
  @ApiModelProperty(value = "Don't notify me more than <limit> times every <limitEvery> seconds. If set, limitEvery cannot be empty.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public NotificationRuleBase tagRules(List<TagRule> tagRules) {
    this.tagRules = tagRules;
    return this;
  }

  public NotificationRuleBase addTagRulesItem(TagRule tagRulesItem) {
    this.tagRules.add(tagRulesItem);
    return this;
  }

   /**
   * List of tag rules the notification rule attempts to match.
   * @return tagRules
  **/
  @ApiModelProperty(required = true, value = "List of tag rules the notification rule attempts to match.")
  public List<TagRule> getTagRules() {
    return tagRules;
  }

  public void setTagRules(List<TagRule> tagRules) {
    this.tagRules = tagRules;
  }

  public NotificationRuleBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the notification rule.
   * @return description
  **/
  @ApiModelProperty(value = "An optional description of the notification rule.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotificationRuleBase statusRules(List<StatusRule> statusRules) {
    this.statusRules = statusRules;
    return this;
  }

  public NotificationRuleBase addStatusRulesItem(StatusRule statusRulesItem) {
    this.statusRules.add(statusRulesItem);
    return this;
  }

   /**
   * List of status rules the notification rule attempts to match.
   * @return statusRules
  **/
  @ApiModelProperty(required = true, value = "List of status rules the notification rule attempts to match.")
  public List<StatusRule> getStatusRules() {
    return statusRules;
  }

  public void setStatusRules(List<StatusRule> statusRules) {
    this.statusRules = statusRules;
  }

  public NotificationRuleBase labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public NotificationRuleBase addLabelsItem(Label labelsItem) {
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

  public NotificationRuleBase links(NotificationRuleBaseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public NotificationRuleBaseLinks getLinks() {
    return links;
  }

  public void setLinks(NotificationRuleBaseLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRuleBase notificationRuleBase = (NotificationRuleBase) o;
    return Objects.equals(this.id, notificationRuleBase.id) &&
        Objects.equals(this.endpointID, notificationRuleBase.endpointID) &&
        Objects.equals(this.orgID, notificationRuleBase.orgID) &&
        Objects.equals(this.ownerID, notificationRuleBase.ownerID) &&
        Objects.equals(this.createdAt, notificationRuleBase.createdAt) &&
        Objects.equals(this.updatedAt, notificationRuleBase.updatedAt) &&
        Objects.equals(this.status, notificationRuleBase.status) &&
        Objects.equals(this.name, notificationRuleBase.name) &&
        Objects.equals(this.sleepUntil, notificationRuleBase.sleepUntil) &&
        Objects.equals(this.every, notificationRuleBase.every) &&
        Objects.equals(this.offset, notificationRuleBase.offset) &&
        Objects.equals(this.runbookLink, notificationRuleBase.runbookLink) &&
        Objects.equals(this.limitEvery, notificationRuleBase.limitEvery) &&
        Objects.equals(this.limit, notificationRuleBase.limit) &&
        Objects.equals(this.tagRules, notificationRuleBase.tagRules) &&
        Objects.equals(this.description, notificationRuleBase.description) &&
        Objects.equals(this.statusRules, notificationRuleBase.statusRules) &&
        Objects.equals(this.labels, notificationRuleBase.labels) &&
        Objects.equals(this.links, notificationRuleBase.links) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, endpointID, orgID, ownerID, createdAt, updatedAt, status, name, sleepUntil, every, offset, runbookLink, limitEvery, limit, tagRules, description, statusRules, labels, links, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRuleBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sleepUntil: ").append(toIndentedString(sleepUntil)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    runbookLink: ").append(toIndentedString(runbookLink)).append("\n");
    sb.append("    limitEvery: ").append(toIndentedString(limitEvery)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    tagRules: ").append(toIndentedString(tagRules)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    statusRules: ").append(toIndentedString(statusRules)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

