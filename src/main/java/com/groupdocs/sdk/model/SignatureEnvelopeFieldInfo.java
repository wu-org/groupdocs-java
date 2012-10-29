package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.SignatureEnvelopeFieldLocationInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureEnvelopeFieldInfo {
  private String regularExpression = null;
  private Integer fieldType = null;
  private Boolean mandatory = null;
  private List<Integer> data = new ArrayList<Integer>();
  private Integer graphSizeH = null;
  private String id = null;
  private String acceptableValues = null;
  private String recipientId = null;
  private Double order = null;
  private List<SignatureEnvelopeFieldLocationInfo> locations = new ArrayList<SignatureEnvelopeFieldLocationInfo>();
  private Double signatureFieldId = null;
  private String envelopeId = null;
  private String name = null;
  private String fillTimeStamp = null;
  private String getDataFrom = null;
  private String defaultValue = null;
  private Integer graphSizeW = null;
  private String tooltip = null;
  public String getRegularExpression() {
    return regularExpression;
  }
  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }

  public Integer getFieldType() {
    return fieldType;
  }
  public void setFieldType(Integer fieldType) {
    this.fieldType = fieldType;
  }

  public Boolean getMandatory() {
    return mandatory;
  }
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public List<Integer> getData() {
    return data;
  }
  public void setData(List<Integer> data) {
    this.data = data;
  }

  public Integer getGraphSizeH() {
    return graphSizeH;
  }
  public void setGraphSizeH(Integer graphSizeH) {
    this.graphSizeH = graphSizeH;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getAcceptableValues() {
    return acceptableValues;
  }
  public void setAcceptableValues(String acceptableValues) {
    this.acceptableValues = acceptableValues;
  }

  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public Double getOrder() {
    return order;
  }
  public void setOrder(Double order) {
    this.order = order;
  }

  public List<SignatureEnvelopeFieldLocationInfo> getLocations() {
    return locations;
  }
  public void setLocations(List<SignatureEnvelopeFieldLocationInfo> locations) {
    this.locations = locations;
  }

  public Double getSignatureFieldId() {
    return signatureFieldId;
  }
  public void setSignatureFieldId(Double signatureFieldId) {
    this.signatureFieldId = signatureFieldId;
  }

  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getFillTimeStamp() {
    return fillTimeStamp;
  }
  public void setFillTimeStamp(String fillTimeStamp) {
    this.fillTimeStamp = fillTimeStamp;
  }

  public String getGetDataFrom() {
    return getDataFrom;
  }
  public void setGetDataFrom(String getDataFrom) {
    this.getDataFrom = getDataFrom;
  }

  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Integer getGraphSizeW() {
    return graphSizeW;
  }
  public void setGraphSizeW(Integer graphSizeW) {
    this.graphSizeW = graphSizeW;
  }

  public String getTooltip() {
    return tooltip;
  }
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEnvelopeFieldInfo {\n");
    sb.append("  regularExpression: ").append(regularExpression).append("\n");
    sb.append("  fieldType: ").append(fieldType).append("\n");
    sb.append("  mandatory: ").append(mandatory).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  graphSizeH: ").append(graphSizeH).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  acceptableValues: ").append(acceptableValues).append("\n");
    sb.append("  recipientId: ").append(recipientId).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  signatureFieldId: ").append(signatureFieldId).append("\n");
    sb.append("  envelopeId: ").append(envelopeId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  fillTimeStamp: ").append(fillTimeStamp).append("\n");
    sb.append("  getDataFrom: ").append(getDataFrom).append("\n");
    sb.append("  defaultValue: ").append(defaultValue).append("\n");
    sb.append("  graphSizeW: ").append(graphSizeW).append("\n");
    sb.append("  tooltip: ").append(tooltip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

