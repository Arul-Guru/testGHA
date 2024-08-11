package com.example.SpringDemo.project.services;

import com.example.SpringDemo.project.Models.User;
import com.example.SpringDemo.project.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User createUser(User user) {
        // Business logic, e.g., validation, modification
        return userRepository.save(user);
    }

    public User findUserById(Long id) throws Exception {
        return userRepository.findById(id).orElseThrow(() -> new Exception(String.valueOf(id)));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

