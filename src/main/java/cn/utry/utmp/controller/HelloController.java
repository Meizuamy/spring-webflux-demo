package cn.utry.utmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.utry.utmp.mapper.UserMapper;
import cn.utry.utmp.model.User;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@Controller
@Api(tags = "用户相关接口", description = "提供用户相关的 Rest API")
public class HelloController {
    
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    @ResponseBody
    public Flux<User> hello(){

        log.info("Hell==============");
        return Flux.fromIterable(userMapper.getUserList());
    }
}
