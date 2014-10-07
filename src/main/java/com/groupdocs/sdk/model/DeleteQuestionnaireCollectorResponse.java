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

import com.groupdocs.sdk.model.DeleteQuestionnaireCollectorResult;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class DeleteQuestionnaireCollectorResponse {
  private DeleteQuestionnaireCollectorResult result = null;
  private String status = null;
  private String error_message = null;
  private Long composedOn = null;
  public DeleteQuestionnaireCollectorResult getResult() {
    return result;
  }
  public void setResult(DeleteQuestionnaireCollectorResult result) {
    this.result = result;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  public String getError_message() {
    return error_message;
  }
  public void setError_message(String error_message) {
    this.error_message = error_message;
  }

  public Long getComposedOn() {
    return composedOn;
  }
  public void setComposedOn(Long composedOn) {
    this.composedOn = composedOn;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteQuestionnaireCollectorResponse {\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  error_message: ").append(error_message).append("\n");
    sb.append("  composedOn: ").append(composedOn).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

