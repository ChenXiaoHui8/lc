package com.qianyuan.entity.reportserver$sqlexpress;


public class ServerParametersInstance {

  private String serverParametersId;
  private String parentId;
  private String path;
  private java.sql.Timestamp createDate;
  private java.sql.Timestamp modifiedDate;
  private long timeout;
  private java.sql.Timestamp expiration;
  private String parametersValues;


  public String getServerParametersId() {
    return serverParametersId;
  }

  public void setServerParametersId(String serverParametersId) {
    this.serverParametersId = serverParametersId;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public java.sql.Timestamp getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(java.sql.Timestamp modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public long getTimeout() {
    return timeout;
  }

  public void setTimeout(long timeout) {
    this.timeout = timeout;
  }


  public java.sql.Timestamp getExpiration() {
    return expiration;
  }

  public void setExpiration(java.sql.Timestamp expiration) {
    this.expiration = expiration;
  }


  public String getParametersValues() {
    return parametersValues;
  }

  public void setParametersValues(String parametersValues) {
    this.parametersValues = parametersValues;
  }

}
