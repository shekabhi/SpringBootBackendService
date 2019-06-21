package com.gfg.abhishek.SpringBootBackendService.service;

import com.gfg.abhishek.SpringBootBackendService.model.User;
import com.gfg.abhishek.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class UserDaoService {

    @Autowired
    UserRepository userRepository ;

    List<User> findAllUsers() {
        return userRepository.findAll() ;
    }

    Optional<User> findUserByID(Long id) {
        return userRepository.findById(id);
    }

    User createUser(User user) {
        return userRepository.save(user);
    }

    User updateUser(User user) {
        return userRepository.save(user);
    }

    void deleteUser(Long id) {
         userRepository.deleteById(id);
    }


}
