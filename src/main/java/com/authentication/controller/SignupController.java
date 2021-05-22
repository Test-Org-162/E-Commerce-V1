package com.authentication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api")
public class SignupController {

    @ResponseBody
    @GetMapping( value = "/signup")
    public String signup(){
        return "do Signup";
    }

}
