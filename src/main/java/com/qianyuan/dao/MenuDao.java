package com.qianyuan.dao;




import com.qianyuan.entity.test.LcMenu;

import java.util.List;

public interface MenuDao {

    List<LcMenu> getMenu();

    LcMenu getOne(Integer menuId);


}
