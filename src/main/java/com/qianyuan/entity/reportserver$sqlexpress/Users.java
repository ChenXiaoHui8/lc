package com.qianyuan.entity.reportserver$sqlexpress;


public class Users {

  private String userId;
  private String sid;
  private long userType;
  private long authType;
  private String userName;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  public long getUserType() {
    return userType;
  }

  public void setUserType(long userType) {
    this.userType = userType;
  }


  public long getAuthType() {
    return authType;
  }

  public void setAuthType(long authType) {
    this.authType = authType;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

}
