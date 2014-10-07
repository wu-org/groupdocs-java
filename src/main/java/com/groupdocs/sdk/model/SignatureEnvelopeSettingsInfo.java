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

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureEnvelopeSettingsInfo {
  private Boolean ownerShouldSign = null;
  private Boolean orderedSignature = null;
  private Double reminderTime = null;
  private Double stepExpireTime = null;
  private Double envelopeExpireTime = null;
  private String emailSubject = null;
  private String emailBody = null;
  private Boolean isDemo = null;
  private String waterMarkText = null;
  private String waterMarkImage = null;
  private Boolean attachSignedDocument = null;
  private Boolean includeViewLink = null;
  private Boolean canBeCommented = null;
  private Boolean inPersonSign = null;
  private Boolean enableTypedSignature = null;
  private Boolean enableUploadedSignature = null;
  private Boolean requireUserAuthForSign = null;
  private Boolean requestUserAuthByPhoto = null;
  private Boolean showRecipientCommentInSignedDocument = null;
  private String tags = null;
  public Boolean getOwnerShouldSign() {
    return ownerShouldSign;
  }
  public void setOwnerShouldSign(Boolean ownerShouldSign) {
    this.ownerShouldSign = ownerShouldSign;
  }

  public Boolean getOrderedSignature() {
    return orderedSignature;
  }
  public void setOrderedSignature(Boolean orderedSignature) {
    this.orderedSignature = orderedSignature;
  }

  public Double getReminderTime() {
    return reminderTime;
  }
  public void setReminderTime(Double reminderTime) {
    this.reminderTime = reminderTime;
  }

  public Double getStepExpireTime() {
    return stepExpireTime;
  }
  public void setStepExpireTime(Double stepExpireTime) {
    this.stepExpireTime = stepExpireTime;
  }

  public Double getEnvelopeExpireTime() {
    return envelopeExpireTime;
  }
  public void setEnvelopeExpireTime(Double envelopeExpireTime) {
    this.envelopeExpireTime = envelopeExpireTime;
  }

  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public String getEmailBody() {
    return emailBody;
  }
  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  public Boolean getIsDemo() {
    return isDemo;
  }
  public void setIsDemo(Boolean isDemo) {
    this.isDemo = isDemo;
  }

  public String getWaterMarkText() {
    return waterMarkText;
  }
  public void setWaterMarkText(String waterMarkText) {
    this.waterMarkText = waterMarkText;
  }

  public String getWaterMarkImage() {
    return waterMarkImage;
  }
  public void setWaterMarkImage(String waterMarkImage) {
    this.waterMarkImage = waterMarkImage;
  }

  public Boolean getAttachSignedDocument() {
    return attachSignedDocument;
  }
  public void setAttachSignedDocument(Boolean attachSignedDocument) {
    this.attachSignedDocument = attachSignedDocument;
  }

  public Boolean getIncludeViewLink() {
    return includeViewLink;
  }
  public void setIncludeViewLink(Boolean includeViewLink) {
    this.includeViewLink = includeViewLink;
  }

  public Boolean getCanBeCommented() {
    return canBeCommented;
  }
  public void setCanBeCommented(Boolean canBeCommented) {
    this.canBeCommented = canBeCommented;
  }

  public Boolean getInPersonSign() {
    return inPersonSign;
  }
  public void setInPersonSign(Boolean inPersonSign) {
    this.inPersonSign = inPersonSign;
  }

  public Boolean getEnableTypedSignature() {
    return enableTypedSignature;
  }
  public void setEnableTypedSignature(Boolean enableTypedSignature) {
    this.enableTypedSignature = enableTypedSignature;
  }

  public Boolean getEnableUploadedSignature() {
    return enableUploadedSignature;
  }
  public void setEnableUploadedSignature(Boolean enableUploadedSignature) {
    this.enableUploadedSignature = enableUploadedSignature;
  }

  public Boolean getRequireUserAuthForSign() {
    return requireUserAuthForSign;
  }
  public void setRequireUserAuthForSign(Boolean requireUserAuthForSign) {
    this.requireUserAuthForSign = requireUserAuthForSign;
  }

  public Boolean getRequestUserAuthByPhoto() {
    return requestUserAuthByPhoto;
  }
  public void setRequestUserAuthByPhoto(Boolean requestUserAuthByPhoto) {
    this.requestUserAuthByPhoto = requestUserAuthByPhoto;
  }

  public Boolean getShowRecipientCommentInSignedDocument() {
    return showRecipientCommentInSignedDocument;
  }
  public void setShowRecipientCommentInSignedDocument(Boolean showRecipientCommentInSignedDocument) {
    this.showRecipientCommentInSignedDocument = showRecipientCommentInSignedDocument;
  }

  public String getTags() {
    return tags;
  }
  public void setTags(String tags) {
    this.tags = tags;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEnvelopeSettingsInfo {\n");
    sb.append("  ownerShouldSign: ").append(ownerShouldSign).append("\n");
    sb.append("  orderedSignature: ").append(orderedSignature).append("\n");
    sb.append("  reminderTime: ").append(reminderTime).append("\n");
    sb.append("  stepExpireTime: ").append(stepExpireTime).append("\n");
    sb.append("  envelopeExpireTime: ").append(envelopeExpireTime).append("\n");
    sb.append("  emailSubject: ").append(emailSubject).append("\n");
    sb.append("  emailBody: ").append(emailBody).append("\n");
    sb.append("  isDemo: ").append(isDemo).append("\n");
    sb.append("  waterMarkText: ").append(waterMarkText).append("\n");
    sb.append("  waterMarkImage: ").append(waterMarkImage).append("\n");
    sb.append("  attachSignedDocument: ").append(attachSignedDocument).append("\n");
    sb.append("  includeViewLink: ").append(includeViewLink).append("\n");
    sb.append("  canBeCommented: ").append(canBeCommented).append("\n");
    sb.append("  inPersonSign: ").append(inPersonSign).append("\n");
    sb.append("  enableTypedSignature: ").append(enableTypedSignature).append("\n");
    sb.append("  enableUploadedSignature: ").append(enableUploadedSignature).append("\n");
    sb.append("  requireUserAuthForSign: ").append(requireUserAuthForSign).append("\n");
    sb.append("  requestUserAuthByPhoto: ").append(requestUserAuthByPhoto).append("\n");
    sb.append("  showRecipientCommentInSignedDocument: ").append(showRecipientCommentInSignedDocument).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

