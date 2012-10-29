package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.JobDocumentsEntry;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetJobResult {
  private String status = null;
  private JobDocumentsEntry documents = null;
  private List<String> out_formats = new ArrayList<String>();
  private Boolean email_results = null;
  private Boolean url_only = null;
  private Long requested_time = null;
  private Double id = null;
  private String guid = null;
  private Long scheduled_time = null;
  private Double priority = null;
  private String name = null;
  private String callback_url = null;
  private String actions = null;
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  public JobDocumentsEntry getDocuments() {
    return documents;
  }
  public void setDocuments(JobDocumentsEntry documents) {
    this.documents = documents;
  }

  public List<String> getOut_formats() {
    return out_formats;
  }
  public void setOut_formats(List<String> out_formats) {
    this.out_formats = out_formats;
  }

  public Boolean getEmail_results() {
    return email_results;
  }
  public void setEmail_results(Boolean email_results) {
    this.email_results = email_results;
  }

  public Boolean getUrl_only() {
    return url_only;
  }
  public void setUrl_only(Boolean url_only) {
    this.url_only = url_only;
  }

  public Long getRequested_time() {
    return requested_time;
  }
  public void setRequested_time(Long requested_time) {
    this.requested_time = requested_time;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  public Long getScheduled_time() {
    return scheduled_time;
  }
  public void setScheduled_time(Long scheduled_time) {
    this.scheduled_time = scheduled_time;
  }

  public Double getPriority() {
    return priority;
  }
  public void setPriority(Double priority) {
    this.priority = priority;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getCallback_url() {
    return callback_url;
  }
  public void setCallback_url(String callback_url) {
    this.callback_url = callback_url;
  }

  public String getActions() {
    return actions;
  }
  public void setActions(String actions) {
    this.actions = actions;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJobResult {\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  documents: ").append(documents).append("\n");
    sb.append("  out_formats: ").append(out_formats).append("\n");
    sb.append("  email_results: ").append(email_results).append("\n");
    sb.append("  url_only: ").append(url_only).append("\n");
    sb.append("  requested_time: ").append(requested_time).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("  scheduled_time: ").append(scheduled_time).append("\n");
    sb.append("  priority: ").append(priority).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  callback_url: ").append(callback_url).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

