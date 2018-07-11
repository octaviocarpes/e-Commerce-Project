package com.users.usersservice.service;

import com.users.usersservice.pojo.User;
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

    public User getUserById(int id){
        return repository.getUserById(id);
    }

    public User updateUser(User user){
       return repository.updateUser(user);
    }

    public boolean deleteUser(User user){
        repository.delete(user);
        return true;
    }
}
