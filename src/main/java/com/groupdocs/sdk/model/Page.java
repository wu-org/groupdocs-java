package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class Page {
  private Double w = null;
  private Integer id = null;
  private Double h = null;
  public Double getW() {
    return w;
  }
  public void setW(Double w) {
    this.w = w;
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public Double getH() {
    return h;
  }
  public void setH(Double h) {
    this.h = h;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    sb.append("  w: ").append(w).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  h: ").append(h).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

