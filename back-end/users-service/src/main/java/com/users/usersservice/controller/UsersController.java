package com.users.usersservice.controller;

import com.users.usersservice.pojo.User;
import com.users.usersservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    UserService service;

    @GetMapping("/health")
    public String health(){
        return "alive";
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user){
        return ResponseEntity.ok(service.registerUser(user));
    }

    @GetMapping("/id")
    public ResponseEntity getUserById(@RequestParam int id){
        return ResponseEntity.ok(service.getUserById(id));
    }

    @PutMapping("/update")
    public ResponseEntity updateUser(User user){
        return ResponseEntity.ok(service.updateUser(user));
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteUser(@RequestBody User user){
        return ResponseEntity.ok(service.deleteUser(user));
    }
}
