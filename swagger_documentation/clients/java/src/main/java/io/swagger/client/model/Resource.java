/*
 * Figshare API
 * Figshare apiv2. Using Swagger 2.0
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Resource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class Resource {
  @SerializedName("id")
  private String id = "";

  @SerializedName("title")
  private String title = "";

  @SerializedName("doi")
  private String doi = "";

  @SerializedName("link")
  private String link = "";

  @SerializedName("status")
  private String status = "";

  @SerializedName("version")
  private Long version = 0l;

  public Resource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of resource item
   * @return id
  **/
  @ApiModelProperty(example = "aaaa23512", value = "ID of resource item")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Resource title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of resource item
   * @return title
  **/
  @ApiModelProperty(example = "Test title", value = "Title of resource item")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Resource doi(String doi) {
    this.doi = doi;
    return this;
  }

   /**
   * DOI of resource item
   * @return doi
  **/
  @ApiModelProperty(value = "DOI of resource item")
  public String getDoi() {
    return doi;
  }

  public void setDoi(String doi) {
    this.doi = doi;
  }

  public Resource link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Link of resource item
   * @return link
  **/
  @ApiModelProperty(example = "https://docs.figshare.com", value = "Link of resource item")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Resource status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of resource item
   * @return status
  **/
  @ApiModelProperty(example = "frozen", value = "Status of resource item")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Resource version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Version of resource item
   * @return version
  **/
  @ApiModelProperty(example = "1", value = "Version of resource item")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.id, resource.id) &&
        Objects.equals(this.title, resource.title) &&
        Objects.equals(this.doi, resource.doi) &&
        Objects.equals(this.link, resource.link) &&
        Objects.equals(this.status, resource.status) &&
        Objects.equals(this.version, resource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, doi, link, status, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    doi: ").append(toIndentedString(doi)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

