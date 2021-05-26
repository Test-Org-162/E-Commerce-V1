package com.authentication.controller;

import com.authentication.model.User;
import com.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class SignupController {

    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping( value = "/signup")
    public ResponseEntity<List<User>> signup() throws Exception {
        List<User> signedUserList = userService.getSignedUser();
        return buildResponseUserList(signedUserList);
    }

    @ResponseBody
    @PostMapping(value = "/signup")
    public ResponseEntity<User> signup(@RequestBody User user) throws Exception {
        User signedUser = userService.addUser(user);
        return buildResponseUser(signedUser);
    }

    private ResponseEntity<User> buildResponseUser(User source){
        return ResponseEntity.status(HttpStatus.CREATED).body(source);
    }

    private ResponseEntity<List<User>> buildResponseUserList(List<User> source){
        return ResponseEntity.status(HttpStatus.CREATED).body(source);
    }

}
