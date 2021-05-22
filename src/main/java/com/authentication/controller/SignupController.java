package com.authentication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SignupController {

    @ResponseBody
    @RequestMapping(value = "/signup",method = RequestMethod.GET)
    public String signup(){
        return "do Signup";
    }

}
