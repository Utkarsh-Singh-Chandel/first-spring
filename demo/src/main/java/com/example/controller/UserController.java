package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.example.db.DatabaseConnection;
import com.example.repository.UserRepository;
import com.example.service.UserService;


@Controller
public class UserController {

    private DatabaseConnection db = new DatabaseConnection();

    private UserRepository userRepository = new UserRepository(db);

    private UserService userService = new UserService(userRepository);


    public void createUser(String name){
        userService.createUser(name);
        
    }

    public List<String> listUsers(){

        return userService.getUsers();
    }
}
