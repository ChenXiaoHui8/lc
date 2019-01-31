package com.qianyuan.entity.reportserver$sqlexpress;


public class Event {

  private String eventId;
  private String eventType;
  private String eventData;
  private java.sql.Timestamp timeEntered;
  private java.sql.Timestamp processStart;
  private java.sql.Timestamp processHeartbeat;
  private String batchId;


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public String getEventData() {
    return eventData;
  }

  public void setEventData(String eventData) {
    this.eventData = eventData;
  }


  public java.sql.Timestamp getTimeEntered() {
    return timeEntered;
  }

  public void setTimeEntered(java.sql.Timestamp timeEntered) {
    this.timeEntered = timeEntered;
  }


  public java.sql.Timestamp getProcessStart() {
    return processStart;
  }

  public void setProcessStart(java.sql.Timestamp processStart) {
    this.processStart = processStart;
  }


  public java.sql.Timestamp getProcessHeartbeat() {
    return processHeartbeat;
  }

  public void setProcessHeartbeat(java.sql.Timestamp processHeartbeat) {
    this.processHeartbeat = processHeartbeat;
  }


  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

}
