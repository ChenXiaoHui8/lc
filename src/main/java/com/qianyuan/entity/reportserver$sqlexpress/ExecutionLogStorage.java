package com.qianyuan.entity.reportserver$sqlexpress;


public class ExecutionLogStorage {

  private long logEntryId;
  private String instanceName;
  private String reportId;
  private String userName;
  private String executionId;
  private long requestType;
  private String format;
  private String parameters;
  private long reportAction;
  private java.sql.Timestamp timeStart;
  private java.sql.Timestamp timeEnd;
  private long timeDataRetrieval;
  private long timeProcessing;
  private long timeRendering;
  private long source;
  private String status;
  private long byteCount;
  private long rowCount;
  private String additionalInfo;


  public long getLogEntryId() {
    return logEntryId;
  }

  public void setLogEntryId(long logEntryId) {
    this.logEntryId = logEntryId;
  }


  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }


  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public long getRequestType() {
    return requestType;
  }

  public void setRequestType(long requestType) {
    this.requestType = requestType;
  }


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }


  public long getReportAction() {
    return reportAction;
  }

  public void setReportAction(long reportAction) {
    this.reportAction = reportAction;
  }


  public java.sql.Timestamp getTimeStart() {
    return timeStart;
  }

  public void setTimeStart(java.sql.Timestamp timeStart) {
    this.timeStart = timeStart;
  }


  public java.sql.Timestamp getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(java.sql.Timestamp timeEnd) {
    this.timeEnd = timeEnd;
  }


  public long getTimeDataRetrieval() {
    return timeDataRetrieval;
  }

  public void setTimeDataRetrieval(long timeDataRetrieval) {
    this.timeDataRetrieval = timeDataRetrieval;
  }


  public long getTimeProcessing() {
    return timeProcessing;
  }

  public void setTimeProcessing(long timeProcessing) {
    this.timeProcessing = timeProcessing;
  }


  public long getTimeRendering() {
    return timeRendering;
  }

  public void setTimeRendering(long timeRendering) {
    this.timeRendering = timeRendering;
  }


  public long getSource() {
    return source;
  }

  public void setSource(long source) {
    this.source = source;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getByteCount() {
    return byteCount;
  }

  public void setByteCount(long byteCount) {
    this.byteCount = byteCount;
  }


  public long getRowCount() {
    return rowCount;
  }

  public void setRowCount(long rowCount) {
    this.rowCount = rowCount;
  }


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

}
