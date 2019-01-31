package com.qianyuan.entity.reportserver$sqlexpress;


public class RunningJobs {

  private String jobId;
  private java.sql.Timestamp startDate;
  private String computerName;
  private String requestName;
  private String requestPath;
  private String userId;
  private String description;
  private long timeout;
  private long jobAction;
  private long jobType;
  private long jobStatus;


  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public String getComputerName() {
    return computerName;
  }

  public void setComputerName(String computerName) {
    this.computerName = computerName;
  }


  public String getRequestName() {
    return requestName;
  }

  public void setRequestName(String requestName) {
    this.requestName = requestName;
  }


  public String getRequestPath() {
    return requestPath;
  }

  public void setRequestPath(String requestPath) {
    this.requestPath = requestPath;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getTimeout() {
    return timeout;
  }

  public void setTimeout(long timeout) {
    this.timeout = timeout;
  }


  public long getJobAction() {
    return jobAction;
  }

  public void setJobAction(long jobAction) {
    this.jobAction = jobAction;
  }


  public long getJobType() {
    return jobType;
  }

  public void setJobType(long jobType) {
    this.jobType = jobType;
  }


  public long getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(long jobStatus) {
    this.jobStatus = jobStatus;
  }

}
