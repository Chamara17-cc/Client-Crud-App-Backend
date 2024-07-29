package com.clientapp.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.clientapp.Client_Crud_App.models.User;

public interface UserServices {
    public String createnewUser(@RequestBody User user);
    public String updateUser(@RequestBody User user,Integer Id);
    public String deleteUser(@PathVariable("userid") Integer Id);
    public List <User> getAllUsers();
    public User getUserDetails(@PathVariable("userid") Integer Id);
}