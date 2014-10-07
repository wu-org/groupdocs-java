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

import com.groupdocs.sdk.model.QuestionnaireCollectorStyleFont;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class QuestionnaireCollectorStyle {
  private String collectorId = null;
  private QuestionnaireCollectorStyleFont title = null;
  private QuestionnaireCollectorStyleFont questionTitle = null;
  private QuestionnaireCollectorStyleFont baseFont = null;
  public String getCollectorId() {
    return collectorId;
  }
  public void setCollectorId(String collectorId) {
    this.collectorId = collectorId;
  }

  public QuestionnaireCollectorStyleFont getTitle() {
    return title;
  }
  public void setTitle(QuestionnaireCollectorStyleFont title) {
    this.title = title;
  }

  public QuestionnaireCollectorStyleFont getQuestionTitle() {
    return questionTitle;
  }
  public void setQuestionTitle(QuestionnaireCollectorStyleFont questionTitle) {
    this.questionTitle = questionTitle;
  }

  public QuestionnaireCollectorStyleFont getBaseFont() {
    return baseFont;
  }
  public void setBaseFont(QuestionnaireCollectorStyleFont baseFont) {
    this.baseFont = baseFont;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionnaireCollectorStyle {\n");
    sb.append("  collectorId: ").append(collectorId).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  questionTitle: ").append(questionTitle).append("\n");
    sb.append("  baseFont: ").append(baseFont).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

