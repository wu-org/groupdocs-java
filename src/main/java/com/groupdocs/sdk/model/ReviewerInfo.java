package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class ReviewerInfo {
  private String guid = null;
  private Double id = null;
  private Integer color = null;
  private String primary_email = null;
  private Integer access_rights = null;
  private String firstname = null;
  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public Integer getColor() {
    return color;
  }
  public void setColor(Integer color) {
    this.color = color;
  }

  public String getPrimary_email() {
    return primary_email;
  }
  public void setPrimary_email(String primary_email) {
    this.primary_email = primary_email;
  }

  public Integer getAccess_rights() {
    return access_rights;
  }
  public void setAccess_rights(Integer access_rights) {
    this.access_rights = access_rights;
  }

  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewerInfo {\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("  primary_email: ").append(primary_email).append("\n");
    sb.append("  access_rights: ").append(access_rights).append("\n");
    sb.append("  firstname: ").append(firstname).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

