package com.stars.controller;

import com.stars.model.LoginDTO;
import com.stars.model.User;
import com.stars.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private IUserService userService;
    @PostMapping("/add")
    @CrossOrigin(origins = "*")
    public String addUser(@RequestBody User user){
        try{
            int result = userService.addUser(user);
            if(result > 0){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }catch (Exception e){
            e.printStackTrace();
            return "添加失败";
        }
    }
    @PostMapping("/select")
    @CrossOrigin(origins = "*")
    public String SelectUser(@RequestBody String username){
        try{
            System.out.println(username);
            String result = userService.SelectUser(username);
            if(result != null){
                return "该用户存在";
            }else{
                return "不存在";
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return "查询失败";
        }
    }
    @PostMapping("/login")
    @CrossOrigin(origins = "*")
    public String LoginUser(@RequestBody LoginDTO loginDTO) {
        try {
            String result = userService.LoginUser(loginDTO.getUsername(), loginDTO.getPassword());
            if (result != null) {
                return "登录成功";
            } else {
                return "登录失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "登录失败";
        }
    }
}
