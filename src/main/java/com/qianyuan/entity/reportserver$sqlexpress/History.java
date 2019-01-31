package com.qianyuan.entity.reportserver$sqlexpress;


public class History {

  private String historyId;
  private String reportId;
  private String snapshotDataId;
  private java.sql.Timestamp snapshotDate;


  public String getHistoryId() {
    return historyId;
  }

  public void setHistoryId(String historyId) {
    this.historyId = historyId;
  }


  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public String getSnapshotDataId() {
    return snapshotDataId;
  }

  public void setSnapshotDataId(String snapshotDataId) {
    this.snapshotDataId = snapshotDataId;
  }


  public java.sql.Timestamp getSnapshotDate() {
    return snapshotDate;
  }

  public void setSnapshotDate(java.sql.Timestamp snapshotDate) {
    this.snapshotDate = snapshotDate;
  }

}
