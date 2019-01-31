package com.qianyuan.entity.reportserver$sqlexpress;


public class Batch {

  private String batchId;
  private java.sql.Timestamp addedOn;
  private String action;
  private String item;
  private String parent;
  private String param;
  private String boolParam;
  private String content;
  private String properties;


  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }


  public java.sql.Timestamp getAddedOn() {
    return addedOn;
  }

  public void setAddedOn(java.sql.Timestamp addedOn) {
    this.addedOn = addedOn;
  }


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }


  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }


  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }


  public String getBoolParam() {
    return boolParam;
  }

  public void setBoolParam(String boolParam) {
    this.boolParam = boolParam;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

}
