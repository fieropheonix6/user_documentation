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
import java.util.ArrayList;
import java.util.List;

/**
 * ArticlesCreator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class ArticlesCreator {
  @SerializedName("articles")
  private List<Long> articles = new ArrayList<Long>();

  public ArticlesCreator articles(List<Long> articles) {
    this.articles = articles;
    return this;
  }

  public ArticlesCreator addArticlesItem(Long articlesItem) {
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * List of article ids
   * @return articles
  **/
  @ApiModelProperty(example = "[2000003,2000004]", required = true, value = "List of article ids")
  public List<Long> getArticles() {
    return articles;
  }

  public void setArticles(List<Long> articles) {
    this.articles = articles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticlesCreator articlesCreator = (ArticlesCreator) o;
    return Objects.equals(this.articles, articlesCreator.articles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticlesCreator {\n");
    
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
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

