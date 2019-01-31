package com.qianyuan.entity.reportserver$sqlexpress;


public class Schedule {

  private String scheduleId;
  private String name;
  private java.sql.Timestamp startDate;
  private long flags;
  private java.sql.Timestamp nextRunTime;
  private java.sql.Timestamp lastRunTime;
  private java.sql.Timestamp endDate;
  private long recurrenceType;
  private long minutesInterval;
  private long daysInterval;
  private long weeksInterval;
  private long daysOfWeek;
  private long daysOfMonth;
  private long month;
  private long monthlyWeek;
  private long state;
  private String lastRunStatus;
  private long scheduledRunTimeout;
  private String createdById;
  private String eventType;
  private String eventData;
  private long type;
  private java.sql.Timestamp consistancyCheck;
  private String path;


  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public long getFlags() {
    return flags;
  }

  public void setFlags(long flags) {
    this.flags = flags;
  }


  public java.sql.Timestamp getNextRunTime() {
    return nextRunTime;
  }

  public void setNextRunTime(java.sql.Timestamp nextRunTime) {
    this.nextRunTime = nextRunTime;
  }


  public java.sql.Timestamp getLastRunTime() {
    return lastRunTime;
  }

  public void setLastRunTime(java.sql.Timestamp lastRunTime) {
    this.lastRunTime = lastRunTime;
  }


  public java.sql.Timestamp getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }


  public long getRecurrenceType() {
    return recurrenceType;
  }

  public void setRecurrenceType(long recurrenceType) {
    this.recurrenceType = recurrenceType;
  }


  public long getMinutesInterval() {
    return minutesInterval;
  }

  public void setMinutesInterval(long minutesInterval) {
    this.minutesInterval = minutesInterval;
  }


  public long getDaysInterval() {
    return daysInterval;
  }

  public void setDaysInterval(long daysInterval) {
    this.daysInterval = daysInterval;
  }


  public long getWeeksInterval() {
    return weeksInterval;
  }

  public void setWeeksInterval(long weeksInterval) {
    this.weeksInterval = weeksInterval;
  }


  public long getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(long daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }


  public long getDaysOfMonth() {
    return daysOfMonth;
  }

  public void setDaysOfMonth(long daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
  }


  public long getMonth() {
    return month;
  }

  public void setMonth(long month) {
    this.month = month;
  }


  public long getMonthlyWeek() {
    return monthlyWeek;
  }

  public void setMonthlyWeek(long monthlyWeek) {
    this.monthlyWeek = monthlyWeek;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public String getLastRunStatus() {
    return lastRunStatus;
  }

  public void setLastRunStatus(String lastRunStatus) {
    this.lastRunStatus = lastRunStatus;
  }


  public long getScheduledRunTimeout() {
    return scheduledRunTimeout;
  }

  public void setScheduledRunTimeout(long scheduledRunTimeout) {
    this.scheduledRunTimeout = scheduledRunTimeout;
  }


  public String getCreatedById() {
    return createdById;
  }

  public void setCreatedById(String createdById) {
    this.createdById = createdById;
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


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public java.sql.Timestamp getConsistancyCheck() {
    return consistancyCheck;
  }

  public void setConsistancyCheck(java.sql.Timestamp consistancyCheck) {
    this.consistancyCheck = consistancyCheck;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

}
