package com.users.usersservice.controller;

import com.users.usersservice.model.User;
import com.users.usersservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserService service;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user){
        return ResponseEntity.ok(service.registerUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable("id") String id){
        return ResponseEntity.ok(service.getUserById(id));
    }

    @PutMapping("/update")
    public ResponseEntity updateUser(@RequestBody User user){
        return ResponseEntity.ok(service.updateUser(user));
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteUser(@RequestBody User user){
        return ResponseEntity.ok(service.deleteUser(user));
    }
}
