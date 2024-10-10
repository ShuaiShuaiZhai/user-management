package com.example.usermanagement.service;

import com.example.usermanagement.common.RestResp;
import com.example.usermanagement.model.User;

import java.util.List;

public interface UserService {
    /**
     * • Creating new users
     * • Listing all available users
     * • Listing a single user
     * • Updating an existing user
     * • Deleting an existing user
     *
     */
    RestResp<String> createUser(User user);

    RestResp<List<User>> getAllUsers();

    RestResp<User> getUserById(Long id);

    RestResp<String> updateUser(User user, Long id);

    RestResp<String> deleteUser(Long id);
    
}
