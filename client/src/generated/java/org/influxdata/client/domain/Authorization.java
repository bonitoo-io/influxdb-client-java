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
import java.util.ArrayList;
import java.util.List;
import org.influxdata.client.domain.AuthorizationLinks;
import org.influxdata.client.domain.Permission;

/**
 * Authorization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-12T14:39:51.939+01:00[Europe/Prague]")
public class Authorization {
  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID = null;

  /**
   * if inactive the token is inactive and requests using the token will be rejected.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.ACTIVE;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<Permission> permissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token = null;

  public static final String SERIALIZED_NAME_USER_I_D = "userID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private String userID = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user = null;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private String org = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private AuthorizationLinks links = null;

  public Authorization orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * ID of org that authorization is scoped to.
   * @return orgID
  **/
  @ApiModelProperty(required = true, value = "ID of org that authorization is scoped to.")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public Authorization status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * if inactive the token is inactive and requests using the token will be rejected.
   * @return status
  **/
  @ApiModelProperty(value = "if inactive the token is inactive and requests using the token will be rejected.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Authorization description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the token.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the token.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Authorization permissions(List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Authorization addPermissionsItem(Permission permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * List of permissions for an auth.  An auth must have at least one Permission.
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "List of permissions for an auth.  An auth must have at least one Permission.")
  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

   /**
   * Passed via the Authorization Header and Token Authentication type.
   * @return token
  **/
  @ApiModelProperty(value = "Passed via the Authorization Header and Token Authentication type.")
  public String getToken() {
    return token;
  }

   /**
   * ID of user that created and owns the token.
   * @return userID
  **/
  @ApiModelProperty(value = "ID of user that created and owns the token.")
  public String getUserID() {
    return userID;
  }

   /**
   * Name of user that created and owns the token.
   * @return user
  **/
  @ApiModelProperty(value = "Name of user that created and owns the token.")
  public String getUser() {
    return user;
  }

   /**
   * Name of the org token is scoped to.
   * @return org
  **/
  @ApiModelProperty(value = "Name of the org token is scoped to.")
  public String getOrg() {
    return org;
  }

  public Authorization links(AuthorizationLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public AuthorizationLinks getLinks() {
    return links;
  }

  public void setLinks(AuthorizationLinks links) {
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
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.orgID, authorization.orgID) &&
        Objects.equals(this.status, authorization.status) &&
        Objects.equals(this.description, authorization.description) &&
        Objects.equals(this.permissions, authorization.permissions) &&
        Objects.equals(this.id, authorization.id) &&
        Objects.equals(this.token, authorization.token) &&
        Objects.equals(this.userID, authorization.userID) &&
        Objects.equals(this.user, authorization.user) &&
        Objects.equals(this.org, authorization.org) &&
        Objects.equals(this.links, authorization.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgID, status, description, permissions, id, token, userID, user, org, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization {\n");
    
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
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

