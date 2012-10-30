package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.SignatureContactInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureContactsResult {
  private Integer count = null;
  private List<SignatureContactInfo> contacts = new ArrayList<SignatureContactInfo>();
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  public List<SignatureContactInfo> getContacts() {
    return contacts;
  }
  public void setContacts(List<SignatureContactInfo> contacts) {
    this.contacts = contacts;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureContactsResult {\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  contacts: ").append(contacts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
