package com.mvcexample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvcexample.demo.entity.SignInRequest;
import com.mvcexample.demo.entity.User;
import com.mvcexample.demo.service.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServices userServices;

//	@GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @GetMapping("/register")
//    public String register() {
//        return "register";
//    }
	

    @PostMapping("/register")
    public String createUser(@RequestBody User user) {
        User res = userServices.registerUser(user);
        if (res!= null) {
//            model.addAttribute("success", "User registered successfully");
            return "register";
        } else {
//            model.addAttribute("error", "Registration failed");
            return " NOt register";
        }
    }

    @PostMapping("/login")
    public Integer logIn(@RequestBody SignInRequest signInObj) {
        Integer res = userServices.logInUser(signInObj.getUname(), signInObj.getUpassword());
        if (res!=0) {
//            model.addAttribute("success", "Valid User");
            return res;
        } else {
//            model.addAttribute("error", "Invalid User");
            return 0;
        }
    }

}
