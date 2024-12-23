package com.project.quizitup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quizitup.model.User;
import com.project.quizitup.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(int id, User user){
        User existingUser = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found!"));
        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setProfileName(user.getProfileName());
        return userRepository.save(existingUser);
    }

    public String deleteUser(int id){
        User user = userRepository.findById(id).orElse(null);
        if(user != null){
            userRepository.delete(user);
            return "User deleted successfully!";
        }
        return "Not deleted";
    }

    public User getUser(int id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
    
}
