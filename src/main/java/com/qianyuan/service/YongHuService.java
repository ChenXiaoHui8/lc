package com.qianyuan.service;

import com.qianyuan.entity.cangchudian01.Yonghu;

public interface YongHuService {

    /**
    * 添加用户
    * 用户信息
    * */
    Integer insertYongHu(Yonghu yonghu);

    /**
     * 通过id查询对象
     * id
     * */
    Yonghu queryById(Integer id);

    /**
     * 用户登录
     * username
     * password
     * */
    Yonghu login(String username,String password);


    /**
     * 根据id更新对象
     * id
     * */
    void UpdateById(Yonghu yonghu);
}
