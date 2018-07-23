package com.auth.msauth.controllers;

import com.auth.msauth.model.User;
import com.auth.msauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping(value = "/register")
    public ResponseEntity registerUser(@RequestBody User user){
        return ResponseEntity.ok(service.registerUser(user));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getUser(@RequestParam String id){
        return ResponseEntity.ok(service.getUser(id));
    }

    @PutMapping(value = "/update")
    public ResponseEntity updateUser(@RequestBody User user){
        return ResponseEntity.ok(service.updateUser(user));
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity deleteUser(@RequestBody User user){
        return ResponseEntity.ok(service.deleteUser(user));
    }
}
