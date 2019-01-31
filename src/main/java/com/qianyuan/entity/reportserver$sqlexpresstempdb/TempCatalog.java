package com.qianyuan.entity.reportserver$sqlexpresstempdb;


public class TempCatalog {

  private String editSessionId;
  private String tempCatalogId;
  private String contextPath;
  private String name;
  private String content;
  private String description;
  private String intermediate;
  private String intermediateIsPermanent;
  private String property;
  private String parameter;
  private String ownerId;
  private java.sql.Timestamp creationTime;
  private java.sql.Timestamp expirationTime;
  private String dataCacheHash;


  public String getEditSessionId() {
    return editSessionId;
  }

  public void setEditSessionId(String editSessionId) {
    this.editSessionId = editSessionId;
  }


  public String getTempCatalogId() {
    return tempCatalogId;
  }

  public void setTempCatalogId(String tempCatalogId) {
    this.tempCatalogId = tempCatalogId;
  }


  public String getContextPath() {
    return contextPath;
  }

  public void setContextPath(String contextPath) {
    this.contextPath = contextPath;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getIntermediate() {
    return intermediate;
  }

  public void setIntermediate(String intermediate) {
    this.intermediate = intermediate;
  }


  public String getIntermediateIsPermanent() {
    return intermediateIsPermanent;
  }

  public void setIntermediateIsPermanent(String intermediateIsPermanent) {
    this.intermediateIsPermanent = intermediateIsPermanent;
  }


  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }


  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public java.sql.Timestamp getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(java.sql.Timestamp creationTime) {
    this.creationTime = creationTime;
  }


  public java.sql.Timestamp getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(java.sql.Timestamp expirationTime) {
    this.expirationTime = expirationTime;
  }


  public String getDataCacheHash() {
    return dataCacheHash;
  }

  public void setDataCacheHash(String dataCacheHash) {
    this.dataCacheHash = dataCacheHash;
  }

}
