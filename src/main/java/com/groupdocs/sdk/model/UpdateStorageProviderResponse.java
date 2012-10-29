package com.groupdocs.sdk.model;

import com.groupdocs.sdk.model.UpdateStorageProviderResult;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class UpdateStorageProviderResponse {
  private UpdateStorageProviderResult result = null;
  private String status = null;
  private String error_message = null;
  public UpdateStorageProviderResult getResult() {
    return result;
  }
  public void setResult(UpdateStorageProviderResult result) {
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

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStorageProviderResponse {\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  error_message: ").append(error_message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

