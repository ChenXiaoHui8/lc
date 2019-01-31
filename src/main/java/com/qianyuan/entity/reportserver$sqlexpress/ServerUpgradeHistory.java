package com.qianyuan.entity.reportserver$sqlexpress;


public class ServerUpgradeHistory {

  private long upgradeId;
  private String serverVersion;
  private String user;
  private java.sql.Timestamp dateTime;


  public long getUpgradeId() {
    return upgradeId;
  }

  public void setUpgradeId(long upgradeId) {
    this.upgradeId = upgradeId;
  }


  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
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
