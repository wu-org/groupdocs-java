package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.SignatureEnvelopeAuditLogInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureEnvelopeAuditLogsResult {
  private List<SignatureEnvelopeAuditLogInfo> logs = new ArrayList<SignatureEnvelopeAuditLogInfo>();
  private String envelopeId = null;
  public List<SignatureEnvelopeAuditLogInfo> getLogs() {
    return logs;
  }
  public void setLogs(List<SignatureEnvelopeAuditLogInfo> logs) {
    this.logs = logs;
  }

  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEnvelopeAuditLogsResult {\n");
    sb.append("  logs: ").append(logs).append("\n");
    sb.append("  envelopeId: ").append(envelopeId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

