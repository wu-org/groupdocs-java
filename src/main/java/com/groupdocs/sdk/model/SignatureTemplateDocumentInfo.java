package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureTemplateDocumentInfo {
  private String templateId = null;
  private Integer fieldsCount = null;
  private Integer order = null;
  private String name = null;
  private Integer originalDocumentPagesCount = null;
  private String originalDocumentMD5 = null;
  private String documentId = null;
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public Integer getFieldsCount() {
    return fieldsCount;
  }
  public void setFieldsCount(Integer fieldsCount) {
    this.fieldsCount = fieldsCount;
  }

  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Integer getOriginalDocumentPagesCount() {
    return originalDocumentPagesCount;
  }
  public void setOriginalDocumentPagesCount(Integer originalDocumentPagesCount) {
    this.originalDocumentPagesCount = originalDocumentPagesCount;
  }

  public String getOriginalDocumentMD5() {
    return originalDocumentMD5;
  }
  public void setOriginalDocumentMD5(String originalDocumentMD5) {
    this.originalDocumentMD5 = originalDocumentMD5;
  }

  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureTemplateDocumentInfo {\n");
    sb.append("  templateId: ").append(templateId).append("\n");
    sb.append("  fieldsCount: ").append(fieldsCount).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  originalDocumentPagesCount: ").append(originalDocumentPagesCount).append("\n");
    sb.append("  originalDocumentMD5: ").append(originalDocumentMD5).append("\n");
    sb.append("  documentId: ").append(documentId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

