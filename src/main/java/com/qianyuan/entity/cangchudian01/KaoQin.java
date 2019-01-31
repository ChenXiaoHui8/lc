package com.qianyuan.entity.cangchudian01;


public class KaoQin {

  private long id;
  private long dateId;
  private long userId;
  private java.sql.Timestamp clockdate;
  private long clocktype;
  private String remark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDateId() {
    return dateId;
  }

  public void setDateId(long dateId) {
    this.dateId = dateId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getClockdate() {
    return clockdate;
  }

  public void setClockdate(java.sql.Timestamp clockdate) {
    this.clockdate = clockdate;
  }


  public long getClocktype() {
    return clocktype;
  }

  public void setClocktype(long clocktype) {
    this.clocktype = clocktype;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
