package com.clientapp.Client_Crud_App.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientapp.Client_Crud_App.models.User;

@RestController
@RequestMapping("/user")
public class userAPIServices {

    User user;
   
    @GetMapping("{userid}")
    public User getUserDetails(@PathVariable("userid") Integer Id){
       
        return user;
    }

    @PostMapping
    public String createnewUser(@RequestBody User user)
    {
       this.user=user;
       return "User created sucessfullly";
    }
}
