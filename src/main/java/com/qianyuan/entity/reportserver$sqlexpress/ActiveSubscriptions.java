package com.qianyuan.entity.reportserver$sqlexpress;


public class ActiveSubscriptions {

  private String activeId;
  private String subscriptionId;
  private long totalNotifications;
  private long totalSuccesses;
  private long totalFailures;


  public String getActiveId() {
    return activeId;
  }

  public void setActiveId(String activeId) {
    this.activeId = activeId;
  }


  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public long getTotalNotifications() {
    return totalNotifications;
  }

  public void setTotalNotifications(long totalNotifications) {
    this.totalNotifications = totalNotifications;
  }


  public long getTotalSuccesses() {
    return totalSuccesses;
  }

  public void setTotalSuccesses(long totalSuccesses) {
    this.totalSuccesses = totalSuccesses;
  }


  public long getTotalFailures() {
    return totalFailures;
  }

  public void setTotalFailures(long totalFailures) {
    this.totalFailures = totalFailures;
  }

}
