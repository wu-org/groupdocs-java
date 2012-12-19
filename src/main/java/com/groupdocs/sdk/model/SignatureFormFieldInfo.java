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

import java.util.*;
import com.groupdocs.sdk.model.SignatureFormFieldLocationInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureFormFieldInfo {
  private String id = null;
  private String formGuid = null;
  private String participantGuid = null;
  private String name = null;
  private Boolean mandatory = null;
  private String regularExpression = null;
  private String data = null;
  private String fillTimeStamp = null;
  private List<SignatureFormFieldLocationInfo> locations = new ArrayList<SignatureFormFieldLocationInfo>();
  private Integer fieldType = null;
  private String acceptableValues = null;
  private String defaultValue = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getFormGuid() {
    return formGuid;
  }
  public void setFormGuid(String formGuid) {
    this.formGuid = formGuid;
  }

  public String getParticipantGuid() {
    return participantGuid;
  }
  public void setParticipantGuid(String participantGuid) {
    this.participantGuid = participantGuid;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Boolean getMandatory() {
    return mandatory;
  }
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public String getRegularExpression() {
    return regularExpression;
  }
  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }

  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  public String getFillTimeStamp() {
    return fillTimeStamp;
  }
  public void setFillTimeStamp(String fillTimeStamp) {
    this.fillTimeStamp = fillTimeStamp;
  }

  public List<SignatureFormFieldLocationInfo> getLocations() {
    return locations;
  }
  public void setLocations(List<SignatureFormFieldLocationInfo> locations) {
    this.locations = locations;
  }

  public Integer getFieldType() {
    return fieldType;
  }
  public void setFieldType(Integer fieldType) {
    this.fieldType = fieldType;
  }

  public String getAcceptableValues() {
    return acceptableValues;
  }
  public void setAcceptableValues(String acceptableValues) {
    this.acceptableValues = acceptableValues;
  }

  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFormFieldInfo {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  formGuid: ").append(formGuid).append("\n");
    sb.append("  participantGuid: ").append(participantGuid).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  mandatory: ").append(mandatory).append("\n");
    sb.append("  regularExpression: ").append(regularExpression).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  fillTimeStamp: ").append(fillTimeStamp).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  fieldType: ").append(fieldType).append("\n");
    sb.append("  acceptableValues: ").append(acceptableValues).append("\n");
    sb.append("  defaultValue: ").append(defaultValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

