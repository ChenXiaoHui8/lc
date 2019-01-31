package com.qianyuan.entity.cangchudian01;


public class XjDingshi {

  private long id;
  private long liangcangId;
  private long leixing;
  private long status;
  private java.sql.Time zhixingShijian;
  private java.sql.Date kaishiRiqi;
  private java.sql.Date jieshuRiqi;
  private String checkPoints;
  private String beizhu;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getLiangcangId() {
    return liangcangId;
  }

  public void setLiangcangId(long liangcangId) {
    this.liangcangId = liangcangId;
  }


  public long getLeixing() {
    return leixing;
  }

  public void setLeixing(long leixing) {
    this.leixing = leixing;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Time getZhixingShijian() {
    return zhixingShijian;
  }

  public void setZhixingShijian(java.sql.Time zhixingShijian) {
    this.zhixingShijian = zhixingShijian;
  }


  public java.sql.Date getKaishiRiqi() {
    return kaishiRiqi;
  }

  public void setKaishiRiqi(java.sql.Date kaishiRiqi) {
    this.kaishiRiqi = kaishiRiqi;
  }


  public java.sql.Date getJieshuRiqi() {
    return jieshuRiqi;
  }

  public void setJieshuRiqi(java.sql.Date jieshuRiqi) {
    this.jieshuRiqi = jieshuRiqi;
  }


  public String getCheckPoints() {
    return checkPoints;
  }

  public void setCheckPoints(String checkPoints) {
    this.checkPoints = checkPoints;
  }


  public String getBeizhu() {
    return beizhu;
  }

  public void setBeizhu(String beizhu) {
    this.beizhu = beizhu;
  }

}
