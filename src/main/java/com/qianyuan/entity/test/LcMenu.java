package com.qianyuan.entity.test;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class LcMenu implements Serializable {

  private Integer menuId;
  private String menuName;
  private Integer menuPartentId;
  private List<LcMenu> list;



}
