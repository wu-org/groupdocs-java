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

import com.groupdocs.sdk.model.QuestionnaireCollectorStyle;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetQuestionnaireCollectorStyleResult {
  private Double collector_style_id = null;
  private Double collectorId = null;
  private QuestionnaireCollectorStyle style = null;
  public Double getCollector_style_id() {
    return collector_style_id;
  }
  public void setCollector_style_id(Double collector_style_id) {
    this.collector_style_id = collector_style_id;
  }

  public Double getCollectorId() {
    return collectorId;
  }
  public void setCollectorId(Double collectorId) {
    this.collectorId = collectorId;
  }

  public QuestionnaireCollectorStyle getStyle() {
    return style;
  }
  public void setStyle(QuestionnaireCollectorStyle style) {
    this.style = style;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuestionnaireCollectorStyleResult {\n");
    sb.append("  collector_style_id: ").append(collector_style_id).append("\n");
    sb.append("  collectorId: ").append(collectorId).append("\n");
    sb.append("  style: ").append(style).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

