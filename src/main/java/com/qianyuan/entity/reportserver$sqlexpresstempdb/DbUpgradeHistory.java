package com.qianyuan.entity.reportserver$sqlexpresstempdb;


public class DbUpgradeHistory {

  private long upgradeId;
  private String dbVersion;
  private String user;
  private java.sql.Timestamp dateTime;


  public long getUpgradeId() {
    return upgradeId;
  }

  public void setUpgradeId(long upgradeId) {
    this.upgradeId = upgradeId;
  }


  public String getDbVersion() {
    return dbVersion;
  }

  public void setDbVersion(String dbVersion) {
    this.dbVersion = dbVersion;
  }


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  public java.sql.Timestamp getDateTime() {
    return dateTime;
  }

  public void setDateTime(java.sql.Timestamp dateTime) {
    this.dateTime = dateTime;
  }

}
