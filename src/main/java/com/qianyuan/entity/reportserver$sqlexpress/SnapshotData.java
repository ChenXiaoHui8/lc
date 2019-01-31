package com.qianyuan.entity.reportserver$sqlexpress;


public class SnapshotData {

  private String snapshotDataId;
  private java.sql.Timestamp createdDate;
  private long paramsHash;
  private String queryParams;
  private String effectiveParams;
  private String description;
  private String dependsOnUser;
  private long permanentRefcount;
  private long transientRefcount;
  private java.sql.Timestamp expirationDate;
  private long pageCount;
  private String hasDocMap;
  private long paginationMode;
  private long processingFlags;


  public String getSnapshotDataId() {
    return snapshotDataId;
  }

  public void setSnapshotDataId(String snapshotDataId) {
    this.snapshotDataId = snapshotDataId;
  }


  public java.sql.Timestamp getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(java.sql.Timestamp createdDate) {
    this.createdDate = createdDate;
  }


  public long getParamsHash() {
    return paramsHash;
  }

  public void setParamsHash(long paramsHash) {
    this.paramsHash = paramsHash;
  }


  public String getQueryParams() {
    return queryParams;
  }

  public void setQueryParams(String queryParams) {
    this.queryParams = queryParams;
  }


  public String getEffectiveParams() {
    return effectiveParams;
  }

  public void setEffectiveParams(String effectiveParams) {
    this.effectiveParams = effectiveParams;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getDependsOnUser() {
    return dependsOnUser;
  }

  public void setDependsOnUser(String dependsOnUser) {
    this.dependsOnUser = dependsOnUser;
  }


  public long getPermanentRefcount() {
    return permanentRefcount;
  }

  public void setPermanentRefcount(long permanentRefcount) {
    this.permanentRefcount = permanentRefcount;
  }


  public long getTransientRefcount() {
    return transientRefcount;
  }

  public void setTransientRefcount(long transientRefcount) {
    this.transientRefcount = transientRefcount;
  }


  public java.sql.Timestamp getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(java.sql.Timestamp expirationDate) {
    this.expirationDate = expirationDate;
  }


  public long getPageCount() {
    return pageCount;
  }

  public void setPageCount(long pageCount) {
    this.pageCount = pageCount;
  }


  public String getHasDocMap() {
    return hasDocMap;
  }

  public void setHasDocMap(String hasDocMap) {
    this.hasDocMap = hasDocMap;
  }


  public long getPaginationMode() {
    return paginationMode;
  }

  public void setPaginationMode(long paginationMode) {
    this.paginationMode = paginationMode;
  }


  public long getProcessingFlags() {
    return processingFlags;
  }

  public void setProcessingFlags(long processingFlags) {
    this.processingFlags = processingFlags;
  }

}
