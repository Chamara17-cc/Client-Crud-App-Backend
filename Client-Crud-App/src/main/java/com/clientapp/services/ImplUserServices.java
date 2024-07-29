package com.clientapp.services;

import java.util.List;
import java.util.Optional;

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
    public String updateUser(User user,Integer Id) {
        Optional<User> optionalUser = userrepository.findById(Id);
        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
           existingUser.setContactnumber(user.getContactnumber());
           existingUser.setGender(user.getGender());
           existingUser.setAge(user.getAge());
            userrepository.save(existingUser);
            return "User updated successfully";
        } else {
            return "User not found";

    }
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
