package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class CreateFolderResult {
  private Double id = null;
  private String path = null;
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFolderResult {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  path: ").append(path).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
