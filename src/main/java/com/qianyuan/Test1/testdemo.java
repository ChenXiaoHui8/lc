package com.qianyuan.Test1;

import com.qianyuan.LcApplication;
import com.qianyuan.dao.MenuDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={LcApplication.class})// 指定启动类
public class testdemo {
    @Autowired
    private MenuDao menuDao;

    @Test
    public void test111(){
        System.out.println(menuDao.getMenu());
    }

    @Test
    public void test2(){
        System.out.println(menuDao.getOne(3));
    }
}
