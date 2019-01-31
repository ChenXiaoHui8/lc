package com.qianyuan.entity.reportserver$sqlexpresstempdb;


public class ExecutionCache {

  private String executionCacheId;
  private String reportId;
  private long expirationFlags;
  private java.sql.Timestamp absoluteExpiration;
  private long relativeExpiration;
  private String snapshotDataId;
  private java.sql.Timestamp lastUsedTime;
  private long paramsHash;


  public String getExecutionCacheId() {
    return executionCacheId;
  }

  public void setExecutionCacheId(String executionCacheId) {
    this.executionCacheId = executionCacheId;
  }


  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public long getExpirationFlags() {
    return expirationFlags;
  }

  public void setExpirationFlags(long expirationFlags) {
    this.expirationFlags = expirationFlags;
  }


  public java.sql.Timestamp getAbsoluteExpiration() {
    return absoluteExpiration;
  }

  public void setAbsoluteExpiration(java.sql.Timestamp absoluteExpiration) {
    this.absoluteExpiration = absoluteExpiration;
  }


  public long getRelativeExpiration() {
    return relativeExpiration;
  }

  public void setRelativeExpiration(long relativeExpiration) {
    this.relativeExpiration = relativeExpiration;
  }


  public String getSnapshotDataId() {
    return snapshotDataId;
  }

  public void setSnapshotDataId(String snapshotDataId) {
    this.snapshotDataId = snapshotDataId;
  }


  public java.sql.Timestamp getLastUsedTime() {
    return lastUsedTime;
  }

  public void setLastUsedTime(java.sql.Timestamp lastUsedTime) {
    this.lastUsedTime = lastUsedTime;
  }


  public long getParamsHash() {
    return paramsHash;
  }

  public void setParamsHash(long paramsHash) {
    this.paramsHash = paramsHash;
  }

}
