package com.qianyuan.entity.cangchudian01;


public class KaoQinDayStat {

  private long id;
  private long userId;
  private long dateId;
  private String amOnDuty;
  private String amOffDuty;
  private String pmOnDuty;
  private String pmOffDuty;
  private long lateCount;
  private double notDutyStat;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getDateId() {
    return dateId;
  }

  public void setDateId(long dateId) {
    this.dateId = dateId;
  }


  public String getAmOnDuty() {
    return amOnDuty;
  }

  public void setAmOnDuty(String amOnDuty) {
    this.amOnDuty = amOnDuty;
  }


  public String getAmOffDuty() {
    return amOffDuty;
  }

  public void setAmOffDuty(String amOffDuty) {
    this.amOffDuty = amOffDuty;
  }


  public String getPmOnDuty() {
    return pmOnDuty;
  }

  public void setPmOnDuty(String pmOnDuty) {
    this.pmOnDuty = pmOnDuty;
  }


  public String getPmOffDuty() {
    return pmOffDuty;
  }

  public void setPmOffDuty(String pmOffDuty) {
    this.pmOffDuty = pmOffDuty;
  }


  public long getLateCount() {
    return lateCount;
  }

  public void setLateCount(long lateCount) {
    this.lateCount = lateCount;
  }


  public double getNotDutyStat() {
    return notDutyStat;
  }

  public void setNotDutyStat(double notDutyStat) {
    this.notDutyStat = notDutyStat;
  }

}
