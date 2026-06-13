 package com.example.repository;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.db.DatabaseConnection;

@Repository
public class UserRepository {


    private DatabaseConnection db;

    public UserRepository(DatabaseConnection db ){
        this.db = db;

    }
    public void save(String name){
        db.addUser(name);
    }

    public List<String> getUsers(){
        return db.getUsers();

    }
     
}