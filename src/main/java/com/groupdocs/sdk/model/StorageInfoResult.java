package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class StorageInfoResult {
  private Long total_space = null;
  private Long avail_space = null;
  private Integer avail_credits = null;
  private Integer doc_credits = null;
  public Long getTotal_space() {
    return total_space;
  }
  public void setTotal_space(Long total_space) {
    this.total_space = total_space;
  }

  public Long getAvail_space() {
    return avail_space;
  }
  public void setAvail_space(Long avail_space) {
    this.avail_space = avail_space;
  }

  public Integer getAvail_credits() {
    return avail_credits;
  }
  public void setAvail_credits(Integer avail_credits) {
    this.avail_credits = avail_credits;
  }

  public Integer getDoc_credits() {
    return doc_credits;
  }
  public void setDoc_credits(Integer doc_credits) {
    this.doc_credits = doc_credits;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageInfoResult {\n");
    sb.append("  total_space: ").append(total_space).append("\n");
    sb.append("  avail_space: ").append(avail_space).append("\n");
    sb.append("  avail_credits: ").append(avail_credits).append("\n");
    sb.append("  doc_credits: ").append(doc_credits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

