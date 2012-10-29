package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureTemplateSettings {
  private Integer ownerShouldSign = null;
  private Double stepExpireTime = null;
  private String emailBody = null;
  private Double envelopeExpireTime = null;
  private Integer orderedSignature = null;
  private Double reminderTime = null;
  private String emailSubject = null;
  public Integer getOwnerShouldSign() {
    return ownerShouldSign;
  }
  public void setOwnerShouldSign(Integer ownerShouldSign) {
    this.ownerShouldSign = ownerShouldSign;
  }

  public Double getStepExpireTime() {
    return stepExpireTime;
  }
  public void setStepExpireTime(Double stepExpireTime) {
    this.stepExpireTime = stepExpireTime;
  }

  public String getEmailBody() {
    return emailBody;
  }
  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  public Double getEnvelopeExpireTime() {
    return envelopeExpireTime;
  }
  public void setEnvelopeExpireTime(Double envelopeExpireTime) {
    this.envelopeExpireTime = envelopeExpireTime;
  }

  public Integer getOrderedSignature() {
    return orderedSignature;
  }
  public void setOrderedSignature(Integer orderedSignature) {
    this.orderedSignature = orderedSignature;
  }

  public Double getReminderTime() {
    return reminderTime;
  }
  public void setReminderTime(Double reminderTime) {
    this.reminderTime = reminderTime;
  }

  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureTemplateSettings {\n");
    sb.append("  ownerShouldSign: ").append(ownerShouldSign).append("\n");
    sb.append("  stepExpireTime: ").append(stepExpireTime).append("\n");
    sb.append("  emailBody: ").append(emailBody).append("\n");
    sb.append("  envelopeExpireTime: ").append(envelopeExpireTime).append("\n");
    sb.append("  orderedSignature: ").append(orderedSignature).append("\n");
    sb.append("  reminderTime: ").append(reminderTime).append("\n");
    sb.append("  emailSubject: ").append(emailSubject).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

