package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.StorageProviderInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetStorageProvidersResult {
  private List<StorageProviderInfo> providers = new ArrayList<StorageProviderInfo>();
  public List<StorageProviderInfo> getProviders() {
    return providers;
  }
  public void setProviders(List<StorageProviderInfo> providers) {
    this.providers = providers;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStorageProvidersResult {\n");
    sb.append("  providers: ").append(providers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
