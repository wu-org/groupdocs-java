package com.groupdocs.sdk.model;

import com.groupdocs.sdk.model.GetDatasourcesResult;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetDatasourcesResponse {
  private GetDatasourcesResult result = null;
  private String status = null;
  private String error_message = null;
  public GetDatasourcesResult getResult() {
    return result;
  }
  public void setResult(GetDatasourcesResult result) {
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
    sb.append("class GetDatasourcesResponse {\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  error_message: ").append(error_message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

