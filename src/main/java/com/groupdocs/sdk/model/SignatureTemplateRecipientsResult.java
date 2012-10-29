package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.SignatureTemplateRecipientInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureTemplateRecipientsResult {
  private String templateId = null;
  private List<SignatureTemplateRecipientInfo> recipients = new ArrayList<SignatureTemplateRecipientInfo>();
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public List<SignatureTemplateRecipientInfo> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<SignatureTemplateRecipientInfo> recipients) {
    this.recipients = recipients;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureTemplateRecipientsResult {\n");
    sb.append("  templateId: ").append(templateId).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

