package com.qpp.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Controller
@RequestMapping("/redirect")
public class RedirectController {

    /**
     * @Author qipengpai
     * @Description //TODO 重定向 redis 客户端
     * @Date 13:00 2018/12/22
     * @Param [model]
     * @return org.springframework.web.servlet.view.RedirectView
     * @throws
     **/
    @GetMapping(value = "/redis_client")
    public String redisClient(Model model, HttpServletResponse response){
        response.setHeader("X-Frame-Options", "SAMEORIGIN");// 解决IFrame拒绝的问题
        try {
            response.sendRedirect("http://47.105.194.152:8080/redis-admin");
        } catch (IOException e) {
            log.error("[RedirectController]{redisClient}-> error!",e);
        }
        return "";
    }

}
