package com.qianyuan.entity.lcxtpt;


public class GUser {

  private long id;
  private long roleId;
  private String userName;
  private String niceName;
  private String password;
  private String pwdKey;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getNiceName() {
    return niceName;
  }

  public void setNiceName(String niceName) {
    this.niceName = niceName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getPwdKey() {
    return pwdKey;
  }

  public void setPwdKey(String pwdKey) {
    this.pwdKey = pwdKey;
  }

}
