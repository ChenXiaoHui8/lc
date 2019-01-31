package com.qianyuan.entity.reportserver$sqlexpresstempdb;


public class SessionLock {

  private String sessionId;
  private long lockVersion;


  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public long getLockVersion() {
    return lockVersion;
  }

  public void setLockVersion(long lockVersion) {
    this.lockVersion = lockVersion;
  }

}
