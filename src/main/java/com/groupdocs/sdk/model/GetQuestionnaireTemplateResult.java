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
import com.groupdocs.sdk.model.TemplateEditorField;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetQuestionnaireTemplateResult {
  private String documentId = null;
  private List<TemplateEditorField> templateEditorFields = new ArrayList<TemplateEditorField>();
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public List<TemplateEditorField> getTemplateEditorFields() {
    return templateEditorFields;
  }
  public void setTemplateEditorFields(List<TemplateEditorField> templateEditorFields) {
    this.templateEditorFields = templateEditorFields;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuestionnaireTemplateResult {\n");
    sb.append("  documentId: ").append(documentId).append("\n");
    sb.append("  templateEditorFields: ").append(templateEditorFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

