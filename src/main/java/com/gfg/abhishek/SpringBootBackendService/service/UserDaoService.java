package com.gfg.abhishek.SpringBootBackendService.service;

import com.gfg.abhishek.SpringBootBackendService.model.User;
import com.gfg.abhishek.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDaoService {

    @Autowired
    UserRepository userRepository ;

    public List<User> findAllUsers() {
        return userRepository.findAll() ;
    }

    public Optional<User> findUserByID(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
         userRepository.deleteById(id);
    }


}
