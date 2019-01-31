package com.qianyuan.entity.cangchudian01;


public class Article {

  private long id;
  private String title;
  private String acontent;
  private long type;
  private long flag;
  private java.sql.Timestamp date;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getAcontent() {
    return acontent;
  }

  public void setAcontent(String acontent) {
    this.acontent = acontent;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public long getFlag() {
    return flag;
  }

  public void setFlag(long flag) {
    this.flag = flag;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }

}
