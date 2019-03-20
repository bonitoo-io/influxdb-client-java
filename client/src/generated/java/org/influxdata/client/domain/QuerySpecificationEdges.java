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
 * QuerySpecificationEdges
 */
@javax.annotation.Generated(value = "org.influxdata.codegen.InfluxJavaGenerator", date = "2019-03-20T15:07:36.004852+01:00[Europe/Prague]")
public class QuerySpecificationEdges {
  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent = null;

  public static final String SERIALIZED_NAME_CHILD = "child";
  @SerializedName(SERIALIZED_NAME_CHILD)
  private String child = null;

  public QuerySpecificationEdges parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * id of parent node of child within graph of opertions
   * @return parent
  **/
  @ApiModelProperty(value = "id of parent node of child within graph of opertions")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public QuerySpecificationEdges child(String child) {
    this.child = child;
    return this;
  }

   /**
   * id of child node of parent within the graph of operations
   * @return child
  **/
  @ApiModelProperty(value = "id of child node of parent within the graph of operations")
  public String getChild() {
    return child;
  }

  public void setChild(String child) {
    this.child = child;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuerySpecificationEdges querySpecificationEdges = (QuerySpecificationEdges) o;
    return Objects.equals(this.parent, querySpecificationEdges.parent) &&
        Objects.equals(this.child, querySpecificationEdges.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, child);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuerySpecificationEdges {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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

