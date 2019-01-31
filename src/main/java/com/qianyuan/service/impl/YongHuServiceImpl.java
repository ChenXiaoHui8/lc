package com.qianyuan.service.impl;

import com.qianyuan.dao.YongHuDao;
import com.qianyuan.entity.cangchudian01.Yonghu;
import com.qianyuan.service.YongHuService;
import com.qianyuan.utils.TaleUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class YongHuServiceImpl implements YongHuService {

    @Autowired
    private YongHuDao yongHuDao;


    @Override
    public Integer insertYongHu(Yonghu yonghu) {
        Integer id=null;
        if(StringUtils.isNoneBlank(yonghu.getUserName())&&StringUtils.isNotBlank(yonghu.getPhone())){
            //用户密码加密
            String encodePwd= TaleUtils.MD5encode(yonghu.getUserName()+yonghu.getPassword());
            yonghu.setPassword(encodePwd);
            yongHuDao.insert(yonghu);

        }

        return yonghu.getId();
    }

    @Override
    public Yonghu queryById(Integer id) {
        Yonghu yonghu=null;
        if(id!=null){
            return yongHuDao.selectByPrimaryKey(id);
        }

        return yonghu;
    }

    @Override
    public Yonghu login(String username, String password) {

        return yongHuDao.login(username,password);
    }

    @Override
    public void UpdateById(Yonghu yonghu) {
        yongHuDao.update(yonghu);
    }
}
