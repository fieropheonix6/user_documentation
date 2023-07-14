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
 * Author
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class Author {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("url_name")
  private String urlName = null;

  @SerializedName("orcid_id")
  private String orcidId = null;

  public Author id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Author id
   * @return id
  **/
  @ApiModelProperty(example = "97657", required = true, value = "Author id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Author fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Author full name
   * @return fullName
  **/
  @ApiModelProperty(example = "John Doe", required = true, value = "Author full name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Author isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * True if author has published items
   * @return isActive
  **/
  @ApiModelProperty(example = "false", required = true, value = "True if author has published items")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Author urlName(String urlName) {
    this.urlName = urlName;
    return this;
  }

   /**
   * Author url name
   * @return urlName
  **/
  @ApiModelProperty(example = "John_Doe", required = true, value = "Author url name")
  public String getUrlName() {
    return urlName;
  }

  public void setUrlName(String urlName) {
    this.urlName = urlName;
  }

  public Author orcidId(String orcidId) {
    this.orcidId = orcidId;
    return this;
  }

   /**
   * Author Orcid
   * @return orcidId
  **/
  @ApiModelProperty(example = "1234-5678-9123-1234", required = true, value = "Author Orcid")
  public String getOrcidId() {
    return orcidId;
  }

  public void setOrcidId(String orcidId) {
    this.orcidId = orcidId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.id, author.id) &&
        Objects.equals(this.fullName, author.fullName) &&
        Objects.equals(this.isActive, author.isActive) &&
        Objects.equals(this.urlName, author.urlName) &&
        Objects.equals(this.orcidId, author.orcidId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName, isActive, urlName, orcidId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    urlName: ").append(toIndentedString(urlName)).append("\n");
    sb.append("    orcidId: ").append(toIndentedString(orcidId)).append("\n");
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

