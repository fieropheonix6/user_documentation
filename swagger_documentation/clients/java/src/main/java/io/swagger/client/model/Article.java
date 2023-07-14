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
import io.swagger.client.model.Timeline;
import java.io.IOException;

/**
 * Article
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class Article {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("doi")
  private String doi = null;

  @SerializedName("handle")
  private String handle = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("url_public_html")
  private String urlPublicHtml = null;

  @SerializedName("url_public_api")
  private String urlPublicApi = null;

  @SerializedName("url_private_html")
  private String urlPrivateHtml = null;

  @SerializedName("url_private_api")
  private String urlPrivateApi = null;

  @SerializedName("timeline")
  private Timeline timeline = null;

  @SerializedName("thumb")
  private String thumb = null;

  @SerializedName("defined_type")
  private Long definedType = null;

  @SerializedName("defined_type_name")
  private String definedTypeName = null;

  public Article id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for article
   * @return id
  **/
  @ApiModelProperty(example = "1434614", required = true, value = "Unique identifier for article")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Article title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of article
   * @return title
  **/
  @ApiModelProperty(example = "Test article title", required = true, value = "Title of article")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Article doi(String doi) {
    this.doi = doi;
    return this;
  }

   /**
   * DOI
   * @return doi
  **/
  @ApiModelProperty(example = "10.6084/m9.figshare.1434614", required = true, value = "DOI")
  public String getDoi() {
    return doi;
  }

  public void setDoi(String doi) {
    this.doi = doi;
  }

  public Article handle(String handle) {
    this.handle = handle;
    return this;
  }

   /**
   * Handle
   * @return handle
  **/
  @ApiModelProperty(example = "111184/figshare.1234", required = true, value = "Handle")
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public Article url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Api endpoint for article
   * @return url
  **/
  @ApiModelProperty(example = "http://api.figshare.com/articles/1434614", required = true, value = "Api endpoint for article")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Article urlPublicHtml(String urlPublicHtml) {
    this.urlPublicHtml = urlPublicHtml;
    return this;
  }

   /**
   * Public site endpoint for article
   * @return urlPublicHtml
  **/
  @ApiModelProperty(example = "https://figshare.com/articles/media/Test_article_title/1434614", required = true, value = "Public site endpoint for article")
  public String getUrlPublicHtml() {
    return urlPublicHtml;
  }

  public void setUrlPublicHtml(String urlPublicHtml) {
    this.urlPublicHtml = urlPublicHtml;
  }

  public Article urlPublicApi(String urlPublicApi) {
    this.urlPublicApi = urlPublicApi;
    return this;
  }

   /**
   * Public Api endpoint for article
   * @return urlPublicApi
  **/
  @ApiModelProperty(example = "https://api.figshare.com/articles/1434614", required = true, value = "Public Api endpoint for article")
  public String getUrlPublicApi() {
    return urlPublicApi;
  }

  public void setUrlPublicApi(String urlPublicApi) {
    this.urlPublicApi = urlPublicApi;
  }

  public Article urlPrivateHtml(String urlPrivateHtml) {
    this.urlPrivateHtml = urlPrivateHtml;
    return this;
  }

   /**
   * Private site endpoint for article
   * @return urlPrivateHtml
  **/
  @ApiModelProperty(example = "https://figshare.com/account/articles/1434614", required = true, value = "Private site endpoint for article")
  public String getUrlPrivateHtml() {
    return urlPrivateHtml;
  }

  public void setUrlPrivateHtml(String urlPrivateHtml) {
    this.urlPrivateHtml = urlPrivateHtml;
  }

  public Article urlPrivateApi(String urlPrivateApi) {
    this.urlPrivateApi = urlPrivateApi;
    return this;
  }

   /**
   * Private Api endpoint for article
   * @return urlPrivateApi
  **/
  @ApiModelProperty(example = "https://api.figshare.com/account/articles/1434614", required = true, value = "Private Api endpoint for article")
  public String getUrlPrivateApi() {
    return urlPrivateApi;
  }

  public void setUrlPrivateApi(String urlPrivateApi) {
    this.urlPrivateApi = urlPrivateApi;
  }

  public Article timeline(Timeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Various timeline dates
   * @return timeline
  **/
  @ApiModelProperty(required = true, value = "Various timeline dates")
  public Timeline getTimeline() {
    return timeline;
  }

  public void setTimeline(Timeline timeline) {
    this.timeline = timeline;
  }

  public Article thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

   /**
   * Thumbnail image
   * @return thumb
  **/
  @ApiModelProperty(example = "https://ndownloader.figshare.com/files/123456789/preview/12345678/thumb.png", required = true, value = "Thumbnail image")
  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public Article definedType(Long definedType) {
    this.definedType = definedType;
    return this;
  }

   /**
   * Type of article identifier
   * @return definedType
  **/
  @ApiModelProperty(example = "3", required = true, value = "Type of article identifier")
  public Long getDefinedType() {
    return definedType;
  }

  public void setDefinedType(Long definedType) {
    this.definedType = definedType;
  }

  public Article definedTypeName(String definedTypeName) {
    this.definedTypeName = definedTypeName;
    return this;
  }

   /**
   * Name of the article type identifier
   * @return definedTypeName
  **/
  @ApiModelProperty(example = "media", required = true, value = "Name of the article type identifier")
  public String getDefinedTypeName() {
    return definedTypeName;
  }

  public void setDefinedTypeName(String definedTypeName) {
    this.definedTypeName = definedTypeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this.id, article.id) &&
        Objects.equals(this.title, article.title) &&
        Objects.equals(this.doi, article.doi) &&
        Objects.equals(this.handle, article.handle) &&
        Objects.equals(this.url, article.url) &&
        Objects.equals(this.urlPublicHtml, article.urlPublicHtml) &&
        Objects.equals(this.urlPublicApi, article.urlPublicApi) &&
        Objects.equals(this.urlPrivateHtml, article.urlPrivateHtml) &&
        Objects.equals(this.urlPrivateApi, article.urlPrivateApi) &&
        Objects.equals(this.timeline, article.timeline) &&
        Objects.equals(this.thumb, article.thumb) &&
        Objects.equals(this.definedType, article.definedType) &&
        Objects.equals(this.definedTypeName, article.definedTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, doi, handle, url, urlPublicHtml, urlPublicApi, urlPrivateHtml, urlPrivateApi, timeline, thumb, definedType, definedTypeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    doi: ").append(toIndentedString(doi)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlPublicHtml: ").append(toIndentedString(urlPublicHtml)).append("\n");
    sb.append("    urlPublicApi: ").append(toIndentedString(urlPublicApi)).append("\n");
    sb.append("    urlPrivateHtml: ").append(toIndentedString(urlPrivateHtml)).append("\n");
    sb.append("    urlPrivateApi: ").append(toIndentedString(urlPrivateApi)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    definedType: ").append(toIndentedString(definedType)).append("\n");
    sb.append("    definedTypeName: ").append(toIndentedString(definedTypeName)).append("\n");
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

