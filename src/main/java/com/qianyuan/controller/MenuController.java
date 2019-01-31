package com.qianyuan.controller;


import com.qianyuan.entity.test.LcMenu;
import com.qianyuan.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    @RequestMapping("getMenu")
    public  List<LcMenu> getMenu(){
        return menuService.getMenu();
    }

    @RequestMapping("getOne")
    public LcMenu getOne(Integer menuId){
        return menuService.getOne(menuId);
    }
}
