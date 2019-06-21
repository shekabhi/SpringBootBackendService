package com.gfg.abhishek.SpringBootBackendService.controller;

import com.gfg.abhishek.SpringBootBackendService.model.User;
import com.gfg.abhishek.SpringBootBackendService.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserDaoService userDaoService  ;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userDaoService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id){
        return userDaoService.findUserByID(id) ;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userDaoService.createUser(user) ;
    }

    @PutMapping("/user")
    public User updateUserById(@RequestBody User user){
        return userDaoService.updateUser(user) ;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable("id") Long id ){
         userDaoService.deleteUser(id) ;
    }



}
