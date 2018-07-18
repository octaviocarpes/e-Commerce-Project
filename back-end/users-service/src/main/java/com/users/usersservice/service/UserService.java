package com.users.usersservice.service;

import com.users.usersservice.model.User;
import com.users.usersservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User registerUser(User user){
        return repository.save(user);
    }

    public User getUserById(String id){
        return repository.findById(id).orElse(null);
    }

    public User updateUser(User user){
        if(repository.findById(user.getId().toString()).isPresent()) {
            repository.save(user);
        }

        return user;
    }

    public boolean deleteUser(User user){
        repository.delete(user);
        return true;
    }
}
