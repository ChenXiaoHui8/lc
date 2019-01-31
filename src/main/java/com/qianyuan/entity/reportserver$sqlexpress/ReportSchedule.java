package com.qianyuan.entity.reportserver$sqlexpress;


public class ReportSchedule {

  private String scheduleId;
  private String reportId;
  private String subscriptionId;
  private long reportAction;


  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }


  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public long getReportAction() {
    return reportAction;
  }

  public void setReportAction(long reportAction) {
    this.reportAction = reportAction;
  }

}
