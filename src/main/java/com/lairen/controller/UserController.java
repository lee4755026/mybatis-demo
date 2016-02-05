package com.lairen.controller;

import com.lairen.pojo.User;
import com.lairen.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lee on 16/2/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
        int id=Integer.valueOf(request.getParameter("id"));
        User user=userService.getUserById(id);
        model.addAttribute("user",user);
        return "showUser";
    }

    @RequestMapping("/insert")
    public String insert(HttpServletRequest request,Model model){
        User user=new User();
        user.setMobile("111111");
        user.setNickname("aaa");
        userService.insert(user);
        return "insert";
    }
}
