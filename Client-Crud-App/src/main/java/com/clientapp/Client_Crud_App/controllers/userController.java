package com.clientapp.Client_Crud_App.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.clientapp.Client_Crud_App.models.User;
import com.clientapp.services.UserServices;

@RestController
@RequestMapping("/user")
public class userController {

    private final UserServices userServices;

    @Autowired
    public userController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("{userid}")
    public User getUserDetails(@PathVariable("userid") Integer id) {
        return userServices.getUserDetails(id);
    }

    @PostMapping
    public String createnewUser(@RequestBody User user) {
        return userServices.createnewUser(user);
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        return userServices.updateUser(user);
    }

    @DeleteMapping("{userid}")
    public String deleteUser(@PathVariable("userid") Integer id) {
        return userServices.deleteUser(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userServices.getAllUsers();
    }
}
