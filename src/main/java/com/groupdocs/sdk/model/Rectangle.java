package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class Rectangle {
  private Double Height = null;
  private Double Width = null;
  private Double Y = null;
  private Double X = null;
  public Double getHeight() {
    return Height;
  }
  public void setHeight(Double Height) {
    this.Height = Height;
  }

  public Double getWidth() {
    return Width;
  }
  public void setWidth(Double Width) {
    this.Width = Width;
  }

  public Double getY() {
    return Y;
  }
  public void setY(Double Y) {
    this.Y = Y;
  }

  public Double getX() {
    return X;
  }
  public void setX(Double X) {
    this.X = X;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rectangle {\n");
    sb.append("  Height: ").append(Height).append("\n");
    sb.append("  Width: ").append(Width).append("\n");
    sb.append("  Y: ").append(Y).append("\n");
    sb.append("  X: ").append(X).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

