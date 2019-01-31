package com.qianyuan.controller;

import com.qianyuan.entity.cangchudian01.Yonghu;
import com.qianyuan.service.YongHuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;


@RestController
public class YongHuController {
    private static final Logger LOGGER= LoggerFactory.getLogger(YongHuController.class);

    @Autowired
    private YongHuService yongHuService;


    @RequestMapping("doLogin")
    public String doLogin(@RequestParam String username, @RequestParam String password, Map map, HttpSession session){
            Yonghu yonghu=yongHuService.login(username,password);
            if (yonghu!=null){
                session.setAttribute("yonghu",yonghu);
                return "redirect:/main/main.jsp";
            }
            map.put("error","用户名或者密码错误");
            return "login.jsp";
    }


    @RequestMapping("doLogout")
    public String doLogout(HttpSession session,Yonghu yonghu){
        if(yonghu!=null){
            session.removeAttribute("yonghu");
            return "main.jsp";
        }
        return "main.jsp";
    }

}
