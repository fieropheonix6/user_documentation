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
 * ShortAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class ShortAccount {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("institution_id")
  private Long institutionId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("active")
  private Long active = null;

  @SerializedName("institution_user_id")
  private String institutionUserId = null;

  @SerializedName("quota")
  private Long quota = null;

  @SerializedName("used_quota")
  private Long usedQuota = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("orcid_id")
  private String orcidId = null;

  public ShortAccount id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Account id
   * @return id
  **/
  @ApiModelProperty(example = "1495682", required = true, value = "Account id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShortAccount firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name
   * @return firstName
  **/
  @ApiModelProperty(example = "Doe", required = true, value = "First Name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ShortAccount lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name
   * @return lastName
  **/
  @ApiModelProperty(example = "John", required = true, value = "Last Name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ShortAccount institutionId(Long institutionId) {
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Account institution
   * @return institutionId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Account institution")
  public Long getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(Long institutionId) {
    this.institutionId = institutionId;
  }

  public ShortAccount email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email
   * @return email
  **/
  @ApiModelProperty(example = "user@domain.com", required = true, value = "User email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ShortAccount active(Long active) {
    this.active = active;
    return this;
  }

   /**
   * Account activity status
   * @return active
  **/
  @ApiModelProperty(example = "0", required = true, value = "Account activity status")
  public Long getActive() {
    return active;
  }

  public void setActive(Long active) {
    this.active = active;
  }

  public ShortAccount institutionUserId(String institutionUserId) {
    this.institutionUserId = institutionUserId;
    return this;
  }

   /**
   * Account institution user id
   * @return institutionUserId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Account institution user id")
  public String getInstitutionUserId() {
    return institutionUserId;
  }

  public void setInstitutionUserId(String institutionUserId) {
    this.institutionUserId = institutionUserId;
  }

  public ShortAccount quota(Long quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Total storage available to account, in bytes
   * @return quota
  **/
  @ApiModelProperty(example = "1074000000", required = true, value = "Total storage available to account, in bytes")
  public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public ShortAccount usedQuota(Long usedQuota) {
    this.usedQuota = usedQuota;
    return this;
  }

   /**
   * Storage used by the account, in bytes
   * @return usedQuota
  **/
  @ApiModelProperty(example = "1074000000", required = true, value = "Storage used by the account, in bytes")
  public Long getUsedQuota() {
    return usedQuota;
  }

  public void setUsedQuota(Long usedQuota) {
    this.usedQuota = usedQuota;
  }

  public ShortAccount userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User id associated with account, useful for example for adding the account as an author to an item
   * @return userId
  **/
  @ApiModelProperty(example = "1000001", required = true, value = "User id associated with account, useful for example for adding the account as an author to an item")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public ShortAccount orcidId(String orcidId) {
    this.orcidId = orcidId;
    return this;
  }

   /**
   * ORCID iD associated to account
   * @return orcidId
  **/
  @ApiModelProperty(example = "0000-0001-2345-6789", required = true, value = "ORCID iD associated to account")
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
    ShortAccount shortAccount = (ShortAccount) o;
    return Objects.equals(this.id, shortAccount.id) &&
        Objects.equals(this.firstName, shortAccount.firstName) &&
        Objects.equals(this.lastName, shortAccount.lastName) &&
        Objects.equals(this.institutionId, shortAccount.institutionId) &&
        Objects.equals(this.email, shortAccount.email) &&
        Objects.equals(this.active, shortAccount.active) &&
        Objects.equals(this.institutionUserId, shortAccount.institutionUserId) &&
        Objects.equals(this.quota, shortAccount.quota) &&
        Objects.equals(this.usedQuota, shortAccount.usedQuota) &&
        Objects.equals(this.userId, shortAccount.userId) &&
        Objects.equals(this.orcidId, shortAccount.orcidId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, institutionId, email, active, institutionUserId, quota, usedQuota, userId, orcidId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    institutionUserId: ").append(toIndentedString(institutionUserId)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

