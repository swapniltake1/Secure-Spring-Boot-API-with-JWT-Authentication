package com.jwt.project.jwtauthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.web.exchanges.HttpExchange.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.project.jwtauthentication.Services.UserService;
import com.jwt.project.jwtauthentication.entity.User;

@RestController
@RequestMapping("/home")
public class Home {

    @Autowired
    private UserService userService;


    // to get users details  
    @GetMapping("/user")
    public List<User> getUser(){

         System.out.println("getting current users");
        
       return this.userService.getUsers();
    }

    // To get current user info.
    @GetMapping("/current-user")
    public String getLoginUser(Principal principal){
         System.out.println(principal.getName());
        return "current User";
    }

    
}
