package com.nicole.demo.controller;

/*
 * author: Nicole
 * email : nicolechen412@163.com
 * date  : 2019/2/3 下午5:35
 * desc  :
 */

import com.nicole.demo.bean.User;
import com.nicole.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

//经常由于配置错误，导致406错误等等，spring boot如何做呢，
// 只需要类添加 @RestController 即可，默认类中的方法都会以json的格式返回
//如果我们需要使用页面开发只要使用@Controller

public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/listAll")
    public Object listAll(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "size", defaultValue = "10") int size){
        return userService.listAll(page, size);
    }

    @RequestMapping("/insert")
    public int insert(User user){
        return userService.insert(user);
    }

    @RequestMapping("/remove")
    public int remove(Integer userId){
        return userService.remove(userId);
    }

    @RequestMapping("/update")
    public int update(User user){
        return userService.update(user);
    }
}
