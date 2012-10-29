package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureFormSettings {
  private Boolean canParticipantDownloadForm = null;
  private String templateGuid = null;
  private String name = null;
  private String fieldsInFinalFileName = null;
  public Boolean getCanParticipantDownloadForm() {
    return canParticipantDownloadForm;
  }
  public void setCanParticipantDownloadForm(Boolean canParticipantDownloadForm) {
    this.canParticipantDownloadForm = canParticipantDownloadForm;
  }

  public String getTemplateGuid() {
    return templateGuid;
  }
  public void setTemplateGuid(String templateGuid) {
    this.templateGuid = templateGuid;
  }

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

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFormSettings {\n");
    sb.append("  canParticipantDownloadForm: ").append(canParticipantDownloadForm).append("\n");
    sb.append("  templateGuid: ").append(templateGuid).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  fieldsInFinalFileName: ").append(fieldsInFinalFileName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

