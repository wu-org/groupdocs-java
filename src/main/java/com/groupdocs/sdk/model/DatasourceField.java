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
import com.groupdocs.sdk.model.Dimension;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class DatasourceField {
  private String name = null;
  private List<String> values = new ArrayList<String>();
  private String contentType = null;
  private String type = null;
  private List<DatasourceField> nested_fields = new ArrayList<DatasourceField>();
  private String regionName = null;
  private Dimension dimension = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public List<DatasourceField> getNested_fields() {
    return nested_fields;
  }
  public void setNested_fields(List<DatasourceField> nested_fields) {
    this.nested_fields = nested_fields;
  }

  public String getRegionName() {
    return regionName;
  }
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public Dimension getDimension() {
    return dimension;
  }
  public void setDimension(Dimension dimension) {
    this.dimension = dimension;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasourceField {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  values: ").append(values).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  nested_fields: ").append(nested_fields).append("\n");
    sb.append("  regionName: ").append(regionName).append("\n");
    sb.append("  dimension: ").append(dimension).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

