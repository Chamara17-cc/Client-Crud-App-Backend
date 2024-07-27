package com.clientapp.Client_Crud_App.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping
    public String updateUser(@RequestBody User user)
    {
       this.user=user;
       return "User updated sucessfullly";
    }

    @DeleteMapping("{userid}")
    public String deleteUser(@PathVariable("userid") Integer Id){

        this.user=null;
        return "Deleted succsussfully";
    }
    @GetMapping
    public User getAllUsers(){
        return user;
    }
}
