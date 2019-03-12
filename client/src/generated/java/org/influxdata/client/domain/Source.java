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
import org.influxdata.client.domain.SourceLinks;

/**
 * Source
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-12T14:34:00.193+01:00[Europe/Prague]")
public class Source {
  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SourceLinks links = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID = null;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    V1("v1"),
    
    V2("v2"),
    
    SELF("self");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_INSECURE_SKIP_VERIFY = "insecureSkipVerify";
  @SerializedName(SERIALIZED_NAME_INSECURE_SKIP_VERIFY)
  private Boolean insecureSkipVerify = null;

  public static final String SERIALIZED_NAME_TELEGRAF = "telegraf";
  @SerializedName(SERIALIZED_NAME_TELEGRAF)
  private String telegraf = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token = null;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password = null;

  public static final String SERIALIZED_NAME_SHARED_SECRET = "sharedSecret";
  @SerializedName(SERIALIZED_NAME_SHARED_SECRET)
  private String sharedSecret = null;

  public static final String SERIALIZED_NAME_META_URL = "metaUrl";
  @SerializedName(SERIALIZED_NAME_META_URL)
  private String metaUrl = null;

  public static final String SERIALIZED_NAME_DEFAULT_R_P = "defaultRP";
  @SerializedName(SERIALIZED_NAME_DEFAULT_R_P)
  private String defaultRP = null;

  /**
   * Gets or Sets languages
   */
  @JsonAdapter(LanguagesEnum.Adapter.class)
  public enum LanguagesEnum {
    FLUX("flux"),
    
    INFLUXQL("influxql"),
    
    SPEC("spec");

    private String value;

    LanguagesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguagesEnum fromValue(String text) {
      for (LanguagesEnum b : LanguagesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LanguagesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguagesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguagesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LanguagesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<LanguagesEnum> languages = null;

  public Source links(SourceLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public SourceLinks getLinks() {
    return links;
  }

  public void setLinks(SourceLinks links) {
    this.links = links;
  }

  public Source id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Source orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * Get orgID
   * @return orgID
  **/
  @ApiModelProperty(value = "")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public Source _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public Source name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Source type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Source url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Source insecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
    return this;
  }

   /**
   * Get insecureSkipVerify
   * @return insecureSkipVerify
  **/
  @ApiModelProperty(value = "")
  public Boolean isInsecureSkipVerify() {
    return insecureSkipVerify;
  }

  public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
  }

  public Source telegraf(String telegraf) {
    this.telegraf = telegraf;
    return this;
  }

   /**
   * Get telegraf
   * @return telegraf
  **/
  @ApiModelProperty(value = "")
  public String getTelegraf() {
    return telegraf;
  }

  public void setTelegraf(String telegraf) {
    this.telegraf = telegraf;
  }

  public Source token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Source username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Source password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Source sharedSecret(String sharedSecret) {
    this.sharedSecret = sharedSecret;
    return this;
  }

   /**
   * Get sharedSecret
   * @return sharedSecret
  **/
  @ApiModelProperty(value = "")
  public String getSharedSecret() {
    return sharedSecret;
  }

  public void setSharedSecret(String sharedSecret) {
    this.sharedSecret = sharedSecret;
  }

  public Source metaUrl(String metaUrl) {
    this.metaUrl = metaUrl;
    return this;
  }

   /**
   * Get metaUrl
   * @return metaUrl
  **/
  @ApiModelProperty(value = "")
  public String getMetaUrl() {
    return metaUrl;
  }

  public void setMetaUrl(String metaUrl) {
    this.metaUrl = metaUrl;
  }

  public Source defaultRP(String defaultRP) {
    this.defaultRP = defaultRP;
    return this;
  }

   /**
   * Get defaultRP
   * @return defaultRP
  **/
  @ApiModelProperty(value = "")
  public String getDefaultRP() {
    return defaultRP;
  }

  public void setDefaultRP(String defaultRP) {
    this.defaultRP = defaultRP;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(value = "")
  public List<LanguagesEnum> getLanguages() {
    return languages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.links, source.links) &&
        Objects.equals(this.id, source.id) &&
        Objects.equals(this.orgID, source.orgID) &&
        Objects.equals(this._default, source._default) &&
        Objects.equals(this.name, source.name) &&
        Objects.equals(this.type, source.type) &&
        Objects.equals(this.url, source.url) &&
        Objects.equals(this.insecureSkipVerify, source.insecureSkipVerify) &&
        Objects.equals(this.telegraf, source.telegraf) &&
        Objects.equals(this.token, source.token) &&
        Objects.equals(this.username, source.username) &&
        Objects.equals(this.password, source.password) &&
        Objects.equals(this.sharedSecret, source.sharedSecret) &&
        Objects.equals(this.metaUrl, source.metaUrl) &&
        Objects.equals(this.defaultRP, source.defaultRP) &&
        Objects.equals(this.languages, source.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, orgID, _default, name, type, url, insecureSkipVerify, telegraf, token, username, password, sharedSecret, metaUrl, defaultRP, languages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
    sb.append("    telegraf: ").append(toIndentedString(telegraf)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sharedSecret: ").append(toIndentedString(sharedSecret)).append("\n");
    sb.append("    metaUrl: ").append(toIndentedString(metaUrl)).append("\n");
    sb.append("    defaultRP: ").append(toIndentedString(defaultRP)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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

