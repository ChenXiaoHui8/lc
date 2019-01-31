package com.qianyuan.entity.reportserver$sqlexpress;


public class Roles {

  private String roleId;
  private String roleName;
  private String description;
  private String taskMask;
  private long roleFlags;


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getTaskMask() {
    return taskMask;
  }

  public void setTaskMask(String taskMask) {
    this.taskMask = taskMask;
  }


  public long getRoleFlags() {
    return roleFlags;
  }

  public void setRoleFlags(long roleFlags) {
    this.roleFlags = roleFlags;
  }

}
