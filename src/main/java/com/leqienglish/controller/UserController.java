package com.leqienglish.controller;



import com.leqienglish.service.UserServiceI;
import com.leqigame.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by zhuqing on 2017/7/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceI userServiceI;

    @RequestMapping(value="/addUser",method=RequestMethod.POST)
    public  @ResponseBody User addUser(@RequestBody User user){

        user.setUpdateDate(System.currentTimeMillis());
        user.setCreateDate(System.currentTimeMillis());
        userServiceI.addUser(user);
        return user;
    }

    @RequestMapping(value = "/findUserById/{id}", method = RequestMethod.GET)
    public  @ResponseBody  User findUserById(@PathVariable Long id) {
        return userServiceI.findUser(id);
    }

    @RequestMapping(value = "update/{id}/{name}",method = RequestMethod.PUT)
    public @ResponseBody User updateUserName(@PathVariable Long id,@PathVariable String name){
        return userServiceI.updateUserName(id,name);
    }

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public @ResponseBody List<User> get(){
        return userServiceI.get();
    }
    @RequestMapping(value = "get/{page}/{pageSize}")
    public @ResponseBody List<User> get(@PathVariable  Integer page,@PathVariable Integer pageSize){
        return userServiceI.get(page,pageSize);
    }

    @RequestMapping("count")
    public @ResponseBody Long getCount(){
        return userServiceI.getCount();
    }

    @RequestMapping("findUser/{value}")
    public @ResponseBody User findUser(@PathVariable String value){
        return userServiceI.findUser(value);
    }
}
