package com.login.demologin.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.login.demologin.common.CommonResult;
import com.login.demologin.entity.User;
import com.login.demologin.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("user")
public class LoginController {

    @Resource
    private UserServiceImpl userService;
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @PostMapping("login")
    public CommonResult login(String username, String password){
        //判断用户名是否存在
        QueryWrapper queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name",username);
        User user = userService.getOne(queryWrapper);
        if (user==null) return CommonResult.builder().code(200).message("用户名不存在!").build();
        if (!user.getPassword().equals(password)) return CommonResult.builder().code(500).message("密码错误").build();
        Date start=new Date();
        Date end=new Date(System.currentTimeMillis()+1000*60*30);
        String sign = JWT
                .create()
                .withAudience()
                .withIssuedAt(start)
                .withExpiresAt(end)
                .sign(Algorithm.HMAC256(password));
        return CommonResult.builder().code(200).data(sign).build();
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("register")
    public CommonResult register(User user){
        boolean save = userService.save(user);
        if (!save) return CommonResult.builder().code(500).message("失败").build();
        return CommonResult.builder().code(200).message("成功").build();
    }
}
