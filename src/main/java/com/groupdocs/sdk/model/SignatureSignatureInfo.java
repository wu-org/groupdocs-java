/**
 *  Copyright 2012 GroupDocs.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.groupdocs.sdk.model;

import java.util.Date;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureSignatureInfo {
  private String id = null;
  private String userGuid = null;
  private Double recipientId = null;
  private String name = null;
  private String companyName = null;
  private String position = null;
  private String firstName = null;
  private String lastName = null;
  private String fullName = null;
  private String textInitials = null;
  private Double signatureImageFileId = null;
  private Double initialsImageFileId = null;
  private String signatureImageUrl = null;
  private String initialsImageUrl = null;
  private Date createdTimeStamp = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getUserGuid() {
    return userGuid;
  }
  public void setUserGuid(String userGuid) {
    this.userGuid = userGuid;
  }

  public Double getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(Double recipientId) {
    this.recipientId = recipientId;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getTextInitials() {
    return textInitials;
  }
  public void setTextInitials(String textInitials) {
    this.textInitials = textInitials;
  }

  public Double getSignatureImageFileId() {
    return signatureImageFileId;
  }
  public void setSignatureImageFileId(Double signatureImageFileId) {
    this.signatureImageFileId = signatureImageFileId;
  }

  public Double getInitialsImageFileId() {
    return initialsImageFileId;
  }
  public void setInitialsImageFileId(Double initialsImageFileId) {
    this.initialsImageFileId = initialsImageFileId;
  }

  public String getSignatureImageUrl() {
    return signatureImageUrl;
  }
  public void setSignatureImageUrl(String signatureImageUrl) {
    this.signatureImageUrl = signatureImageUrl;
  }

  public String getInitialsImageUrl() {
    return initialsImageUrl;
  }
  public void setInitialsImageUrl(String initialsImageUrl) {
    this.initialsImageUrl = initialsImageUrl;
  }

  public Date getCreatedTimeStamp() {
    return createdTimeStamp;
  }
  public void setCreatedTimeStamp(Date createdTimeStamp) {
    this.createdTimeStamp = createdTimeStamp;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureSignatureInfo {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  userGuid: ").append(userGuid).append("\n");
    sb.append("  recipientId: ").append(recipientId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  companyName: ").append(companyName).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("  textInitials: ").append(textInitials).append("\n");
    sb.append("  signatureImageFileId: ").append(signatureImageFileId).append("\n");
    sb.append("  initialsImageFileId: ").append(initialsImageFileId).append("\n");
    sb.append("  signatureImageUrl: ").append(signatureImageUrl).append("\n");
    sb.append("  initialsImageUrl: ").append(initialsImageUrl).append("\n");
    sb.append("  createdTimeStamp: ").append(createdTimeStamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

