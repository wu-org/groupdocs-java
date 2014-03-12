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

import com.groupdocs.sdk.model.Rectangle;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class DocumentHyperlink {
  private Integer page = null;
  private Integer toPage = null;
  private String url = null;
  private Rectangle rect = null;
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getToPage() {
    return toPage;
  }
  public void setToPage(Integer toPage) {
    this.toPage = toPage;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  public Rectangle getRect() {
    return rect;
  }
  public void setRect(Rectangle rect) {
    this.rect = rect;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentHyperlink {\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  toPage: ").append(toPage).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  rect: ").append(rect).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

