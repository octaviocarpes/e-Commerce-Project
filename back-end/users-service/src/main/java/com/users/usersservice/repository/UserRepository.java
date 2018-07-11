package com.users.usersservice.repository;

import com.users.usersservice.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User getUserById(int id);
    User updateUser(User user);
}
