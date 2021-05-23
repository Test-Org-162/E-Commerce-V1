package com.authentication.controller;


import com.authentication.UsersService;
import com.authentication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api")
public class SignupController {

    @Autowired
    UsersService userService;

    @ResponseBody
    @GetMapping( value = "/signup")
    public String signup(){
        return "do Signup";
    }

    @PostMapping(value = "/signup")
    @ResponseBody
    public String signup(@RequestBody User user) {

        if (userService.addUser(user)){
            return "Added";
        }
        return "not added";
    }

}
