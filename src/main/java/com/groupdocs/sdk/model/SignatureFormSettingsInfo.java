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
public class SignatureFormSettingsInfo {
  private String name = null;
  private String fieldsInFinalFileName = null;
  private Boolean canParticipantDownloadForm = null;
  private String waterMarkText = null;
  private String waterMarkImage = null;
  private Boolean notifyOwnerOnSign  = null;
  private Boolean attachSignedDocument = null;
  private String notifyOtherOnSign  = null;
  private Boolean canParticipantPrintForm = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getFieldsInFinalFileName() {
    return fieldsInFinalFileName;
  }
  public void setFieldsInFinalFileName(String fieldsInFinalFileName) {
    this.fieldsInFinalFileName = fieldsInFinalFileName;
  }

  public Boolean getCanParticipantDownloadForm() {
    return canParticipantDownloadForm;
  }
  public void setCanParticipantDownloadForm(Boolean canParticipantDownloadForm) {
    this.canParticipantDownloadForm = canParticipantDownloadForm;
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

  public Boolean getNotifyOwnerOnSign () {
    return notifyOwnerOnSign ;
  }
  public void setNotifyOwnerOnSign (Boolean notifyOwnerOnSign ) {
    this.notifyOwnerOnSign  = notifyOwnerOnSign ;
  }

  public Boolean getAttachSignedDocument() {
    return attachSignedDocument;
  }
  public void setAttachSignedDocument(Boolean attachSignedDocument) {
    this.attachSignedDocument = attachSignedDocument;
  }

  public String getNotifyOtherOnSign () {
    return notifyOtherOnSign ;
  }
  public void setNotifyOtherOnSign (String notifyOtherOnSign ) {
    this.notifyOtherOnSign  = notifyOtherOnSign ;
  }

  public Boolean getCanParticipantPrintForm() {
    return canParticipantPrintForm;
  }
  public void setCanParticipantPrintForm(Boolean canParticipantPrintForm) {
    this.canParticipantPrintForm = canParticipantPrintForm;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFormSettingsInfo {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  fieldsInFinalFileName: ").append(fieldsInFinalFileName).append("\n");
    sb.append("  canParticipantDownloadForm: ").append(canParticipantDownloadForm).append("\n");
    sb.append("  waterMarkText: ").append(waterMarkText).append("\n");
    sb.append("  waterMarkImage: ").append(waterMarkImage).append("\n");
    sb.append("  notifyOwnerOnSign : ").append(notifyOwnerOnSign ).append("\n");
    sb.append("  attachSignedDocument: ").append(attachSignedDocument).append("\n");
    sb.append("  notifyOtherOnSign : ").append(notifyOtherOnSign ).append("\n");
    sb.append("  canParticipantPrintForm: ").append(canParticipantPrintForm).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

