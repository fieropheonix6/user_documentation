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
 * AccountUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class AccountUpdate {
  @SerializedName("group_id")
  private Long groupId = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  public AccountUpdate groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Not applicable to regular users. This field is reserved to institutions/publishers with access to assign to specific groups
   * @return groupId
  **/
  @ApiModelProperty(required = true, value = "Not applicable to regular users. This field is reserved to institutions/publishers with access to assign to specific groups")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public AccountUpdate isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Is account active
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "Is account active")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdate accountUpdate = (AccountUpdate) o;
    return Objects.equals(this.groupId, accountUpdate.groupId) &&
        Objects.equals(this.isActive, accountUpdate.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdate {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

