package com.clientapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.clientapp.Client_Crud_App.models.User;
import repository.UserRepository;

@Service
public class ImplUserServices implements UserServices{

    UserRepository userrepository;
    
      @Autowired
    public ImplUserServices(UserRepository userrepository) {
        this.userrepository = userrepository;
    }

    @Override
    public String createnewUser(User user) {
        if (user==null){
            throw new IllegalArgumentException("User object cannot be null");
        }
        userrepository.save(user);
        return "Created";
    }

    @Override
    public String updateUser(User user) {
        userrepository.save(user);
       return "Updated";
    }

    @Override
    public String deleteUser(Integer Id) {
        userrepository.deleteById(Id);
        return "Successfully deleted";
    }

    @Override
    public List<User> getAllUsers() {
        
        return userrepository.findAll();
    }

    @Override
    public User getUserDetails(@PathVariable("userid") Integer Id) {
       return userrepository.findById(Id).get();
    }
   
}