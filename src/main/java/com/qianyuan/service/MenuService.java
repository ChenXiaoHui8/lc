package com.qianyuan.service;

import com.qianyuan.entity.test.LcMenu;

import java.util.List;

public interface MenuService {

    List<LcMenu> getMenu();

    LcMenu getOne(Integer menuId);
}
