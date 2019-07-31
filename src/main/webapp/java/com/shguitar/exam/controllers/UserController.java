package com.shguitar.exam.controllers;

import com.shguitar.exam.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String index(Model model){
        return "user";
    }

    @RequestMapping("/user-model-view")
    public ModelAndView index(){
        return new ModelAndView("user");
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String submit(String username, String password, String nickname, String email){
        User user = new User();
        user.username = username;
        user.password = password;
        user.nickname = nickname;
        user.email = email;
        return "user";
    }
}
