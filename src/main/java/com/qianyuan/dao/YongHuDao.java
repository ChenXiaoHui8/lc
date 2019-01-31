package com.qianyuan.dao;

import com.qianyuan.entity.cangchudian01.Yonghu;

public interface YongHuDao {

    int insert(Yonghu yonghu);

    Yonghu selectByPrimaryKey(Integer id);

    Yonghu login(String username,String pasword);

    void update(Yonghu yonghu);


}
