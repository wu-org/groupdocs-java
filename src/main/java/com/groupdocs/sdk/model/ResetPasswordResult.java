package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class ResetPasswordResult {
  private String user_name = null;
  public String getUser_name() {
    return user_name;
  }
  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordResult {\n");
    sb.append("  user_name: ").append(user_name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

