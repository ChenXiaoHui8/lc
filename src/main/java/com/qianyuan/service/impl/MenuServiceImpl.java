package com.qianyuan.service.impl;



import com.qianyuan.dao.MenuDao;
import com.qianyuan.entity.test.LcMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class MenuServiceImpl implements MenuDao {

    @Autowired
    private MenuDao menuDao;
    @Override
    public List<LcMenu> getMenu() {
        System.out.println("231213123131"+menuDao.getMenu());
        return menuDao.getMenu();
    }

    @Override
    public LcMenu getOne(Integer menuId) {
        return menuDao.getOne(menuId);
    }
}
