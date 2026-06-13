package com.example.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    private final List<String> users = new ArrayList<>();
     

    public List<String> getUsers(){
        return users;

    }

    public void addUser(String user){
        users.add(user);

    }

    public void connectToDb(){

    }
}
