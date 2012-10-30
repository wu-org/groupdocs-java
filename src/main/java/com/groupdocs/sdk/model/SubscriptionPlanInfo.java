package com.groupdocs.sdk.model;

import java.util.Date;
import com.groupdocs.sdk.model.BillingAddressInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SubscriptionPlanInfo {
  private Integer userCount = null;
  private Date expirationDate = null;
  private String firstNameOnCard = null;
  private BillingAddressInfo address = null;
  private String lastNameOnCard = null;
  private String name = null;
  private String cvv = null;
  private String number = null;
  private Integer productId = null;
  public Integer getUserCount() {
    return userCount;
  }
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getFirstNameOnCard() {
    return firstNameOnCard;
  }
  public void setFirstNameOnCard(String firstNameOnCard) {
    this.firstNameOnCard = firstNameOnCard;
  }

  public BillingAddressInfo getAddress() {
    return address;
  }
  public void setAddress(BillingAddressInfo address) {
    this.address = address;
  }

  public String getLastNameOnCard() {
    return lastNameOnCard;
  }
  public void setLastNameOnCard(String lastNameOnCard) {
    this.lastNameOnCard = lastNameOnCard;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  public Integer getProductId() {
    return productId;
  }
  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlanInfo {\n");
    sb.append("  userCount: ").append(userCount).append("\n");
    sb.append("  expirationDate: ").append(expirationDate).append("\n");
    sb.append("  firstNameOnCard: ").append(firstNameOnCard).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  lastNameOnCard: ").append(lastNameOnCard).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  cvv: ").append(cvv).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
