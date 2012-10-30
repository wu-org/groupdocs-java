package com.groupdocs.sdk.model;

import java.util.Date;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureEnvelopeRecipientInfo {
  private String lastName = null;
  private Double delegatedRecipientId = null;
  private Integer status = null;
  private Date statusDateTime = null;
  private String statusMessage = null;
  private String id = null;
  private String signatureBrowser = null;
  private Integer order = null;
  private String email = null;
  private Double userId = null;
  private String signatureLocation = null;
  private String signatureFingerprint = null;
  private String firstName = null;
  private String signatureHost = null;
  private String userGuid = null;
  private Double roleId = null;
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Double getDelegatedRecipientId() {
    return delegatedRecipientId;
  }
  public void setDelegatedRecipientId(Double delegatedRecipientId) {
    this.delegatedRecipientId = delegatedRecipientId;
  }

  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  public Date getStatusDateTime() {
    return statusDateTime;
  }
  public void setStatusDateTime(Date statusDateTime) {
    this.statusDateTime = statusDateTime;
  }

  public String getStatusMessage() {
    return statusMessage;
  }
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getSignatureBrowser() {
    return signatureBrowser;
  }
  public void setSignatureBrowser(String signatureBrowser) {
    this.signatureBrowser = signatureBrowser;
  }

  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public Double getUserId() {
    return userId;
  }
  public void setUserId(Double userId) {
    this.userId = userId;
  }

  public String getSignatureLocation() {
    return signatureLocation;
  }
  public void setSignatureLocation(String signatureLocation) {
    this.signatureLocation = signatureLocation;
  }

  public String getSignatureFingerprint() {
    return signatureFingerprint;
  }
  public void setSignatureFingerprint(String signatureFingerprint) {
    this.signatureFingerprint = signatureFingerprint;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSignatureHost() {
    return signatureHost;
  }
  public void setSignatureHost(String signatureHost) {
    this.signatureHost = signatureHost;
  }

  public String getUserGuid() {
    return userGuid;
  }
  public void setUserGuid(String userGuid) {
    this.userGuid = userGuid;
  }

  public Double getRoleId() {
    return roleId;
  }
  public void setRoleId(Double roleId) {
    this.roleId = roleId;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEnvelopeRecipientInfo {\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  delegatedRecipientId: ").append(delegatedRecipientId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  statusDateTime: ").append(statusDateTime).append("\n");
    sb.append("  statusMessage: ").append(statusMessage).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  signatureBrowser: ").append(signatureBrowser).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  signatureLocation: ").append(signatureLocation).append("\n");
    sb.append("  signatureFingerprint: ").append(signatureFingerprint).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  signatureHost: ").append(signatureHost).append("\n");
    sb.append("  userGuid: ").append(userGuid).append("\n");
    sb.append("  roleId: ").append(roleId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
