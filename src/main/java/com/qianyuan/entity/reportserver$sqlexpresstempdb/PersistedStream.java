package com.qianyuan.entity.reportserver$sqlexpresstempdb;


public class PersistedStream {

  private String sessionId;
  private long index;
  private String content;
  private String name;
  private String mimeType;
  private String extension;
  private String encoding;
  private String error;
  private long refCount;
  private java.sql.Timestamp expirationDate;


  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public long getIndex() {
    return index;
  }

  public void setIndex(long index) {
    this.index = index;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public long getRefCount() {
    return refCount;
  }

  public void setRefCount(long refCount) {
    this.refCount = refCount;
  }


  public java.sql.Timestamp getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(java.sql.Timestamp expirationDate) {
    this.expirationDate = expirationDate;
  }

}
