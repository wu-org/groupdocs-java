package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.SubscriptionPlanInfo;
import com.groupdocs.sdk.model.ProductMetrics;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetSubscriptionPlanResult {
  private SubscriptionPlanInfo subscription = null;
  private List<ProductMetrics> metrics = new ArrayList<ProductMetrics>();
  public SubscriptionPlanInfo getSubscription() {
    return subscription;
  }
  public void setSubscription(SubscriptionPlanInfo subscription) {
    this.subscription = subscription;
  }

  public List<ProductMetrics> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<ProductMetrics> metrics) {
    this.metrics = metrics;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSubscriptionPlanResult {\n");
    sb.append("  subscription: ").append(subscription).append("\n");
    sb.append("  metrics: ").append(metrics).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

