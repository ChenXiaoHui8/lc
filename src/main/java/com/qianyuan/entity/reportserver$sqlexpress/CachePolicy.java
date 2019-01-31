package com.qianyuan.entity.reportserver$sqlexpress;


public class CachePolicy {

  private String cachePolicyId;
  private String reportId;
  private long expirationFlags;
  private long cacheExpiration;


  public String getCachePolicyId() {
    return cachePolicyId;
  }

  public void setCachePolicyId(String cachePolicyId) {
    this.cachePolicyId = cachePolicyId;
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


  public long getCacheExpiration() {
    return cacheExpiration;
  }

  public void setCacheExpiration(long cacheExpiration) {
    this.cacheExpiration = cacheExpiration;
  }

}
