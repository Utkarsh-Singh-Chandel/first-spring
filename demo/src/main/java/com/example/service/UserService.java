package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;


    public UserService(UserRepository ur){
        this.userRepository = ur;
    }

    public void createUser(String name){

        userRepository.save(name);
    }

    public List<String> getUsers(){
        return userRepository.getUsers();
        
    }
}
