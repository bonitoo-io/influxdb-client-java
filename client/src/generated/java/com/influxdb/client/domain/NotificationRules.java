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
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.Links;
import com.influxdb.client.domain.NotificationRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * NotificationRules
 */

public class NotificationRules {
  public static final String SERIALIZED_NAME_NOTIFICATION_RULES = "notificationRules";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_RULES)
  @JsonAdapter(NotificationRulesNotificationRulesAdapter.class)
  private List<NotificationRule> notificationRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Links links = null;

  public NotificationRules notificationRules(List<NotificationRule> notificationRules) {
    this.notificationRules = notificationRules;
    return this;
  }

  public NotificationRules addNotificationRulesItem(NotificationRule notificationRulesItem) {
    if (this.notificationRules == null) {
      this.notificationRules = new ArrayList<>();
    }
    this.notificationRules.add(notificationRulesItem);
    return this;
  }

   /**
   * Get notificationRules
   * @return notificationRules
  **/
  @ApiModelProperty(value = "")
  public List<NotificationRule> getNotificationRules() {
    return notificationRules;
  }

  public void setNotificationRules(List<NotificationRule> notificationRules) {
    this.notificationRules = notificationRules;
  }

  public NotificationRules links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
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
    NotificationRules notificationRules = (NotificationRules) o;
    return Objects.equals(this.notificationRules, notificationRules.notificationRules) &&
        Objects.equals(this.links, notificationRules.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationRules, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRules {\n");
    sb.append("    notificationRules: ").append(toIndentedString(notificationRules)).append("\n");
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

  public class NotificationRulesNotificationRulesAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {

    public NotificationRulesNotificationRulesAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      List<String> discriminator = Arrays.asList("type");

      List<Object> results = new ArrayList<>();

      for (JsonElement arrayItem: json.getAsJsonArray()){
        JsonObject jsonObject = arrayItem.getAsJsonObject();

        String[] types = discriminator.stream().map(d -> jsonObject.get(d).getAsString()).toArray(String[]::new);

        results.add(deserialize(types, jsonObject, context));
      }

      return results;
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String[] types, final JsonElement json, final JsonDeserializationContext context) {

      if (Arrays.equals(new String[]{ "slack" }, types)) {
        return context.deserialize(json, SlackNotificationRule.class);
      }
      if (Arrays.equals(new String[]{ "smtp" }, types)) {
        return context.deserialize(json, SMTPNotificationRule.class);
      }
      if (Arrays.equals(new String[]{ "pagerduty" }, types)) {
        return context.deserialize(json, PagerDutyNotificationRule.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
}

