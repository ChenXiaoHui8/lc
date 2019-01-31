package com.qianyuan;

import com.qianyuan.dao.MenuDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LcApplicationTests {
    @Autowired
    MenuDao menuDao;
    @Test
    public void contextLoads() {
        System.out.println(menuDao.getMenu());
    }

}

