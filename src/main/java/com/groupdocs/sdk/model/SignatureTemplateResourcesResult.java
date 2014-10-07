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
import com.groupdocs.sdk.model.SignatureTemplateDocumentInfo;
import com.groupdocs.sdk.model.SignatureTemplateRecipientInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureTemplateResourcesResult {
  private List<SignatureTemplateDocumentInfo> documents = new ArrayList<SignatureTemplateDocumentInfo>();
  private List<SignatureTemplateRecipientInfo> recipients = new ArrayList<SignatureTemplateRecipientInfo>();
  private List<String> tags = new ArrayList<String>();
  public List<SignatureTemplateDocumentInfo> getDocuments() {
    return documents;
  }
  public void setDocuments(List<SignatureTemplateDocumentInfo> documents) {
    this.documents = documents;
  }

  public List<SignatureTemplateRecipientInfo> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<SignatureTemplateRecipientInfo> recipients) {
    this.recipients = recipients;
  }

  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureTemplateResourcesResult {\n");
    sb.append("  documents: ").append(documents).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

