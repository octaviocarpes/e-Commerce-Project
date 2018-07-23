package com.auth.msauth.services;

import com.auth.msauth.repository.UserRepository;
import com.auth.msauth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User registerUser(User user){
        User userDB = new User();
        userDB.setName(user.getName());
        userDB.setEmail(user.getEmail());
        userDB.setPassword(user.getPassword());
        repository.save(userDB);
        return user;
    }

    public User getUser(String id){
        User response = new User();
        if (repository.findById(id).isPresent()){
            response.setId(repository.findById(id).get().getId());
            response.setName(repository.findById(id).get().getName());
            response.setEmail(repository.findById(id).get().getEmail());
            response.setPassword(repository.findById(id).get().getPassword());
        }
        return response;
    }

    public User updateUser(User user){
        User userDB = repository.findById(user.getId()).get();
        userDB.setName(user.getName());
        userDB.setEmail(user.getEmail());
        userDB.setPassword(user.getPassword());
        repository.save(userDB);
        return userDB;
    }

    public User deleteUser(User user){
        repository.delete(user);
        return new User();
    }

}
