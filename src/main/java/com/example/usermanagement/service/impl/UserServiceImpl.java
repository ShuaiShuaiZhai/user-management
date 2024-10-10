package com.example.usermanagement.service.impl;

import com.example.usermanagement.common.CodeEnum;
import com.example.usermanagement.common.RestResp;
import com.example.usermanagement.dao.UserDao;
import com.example.usermanagement.model.User;
import com.example.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    // Create a new user
    @Override
    public RestResp<String> createUser(User user) {
        User usr = new User();
        usr.setUsername(user.getUsername());
        usr.setFirstName(user.getFirstName());
        usr.setLastName(user.getLastName());
        usr.setEmail(user.getEmail());
        usr.setPhoneNumber(user.getPhoneNumber());
        int i = userDao.createUser(usr);
        if (i > 0) {
            return new RestResp<>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), "User created");
        } else {
            return new RestResp<>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(), "Failed to create user");
        }
    }

    // Get all users
    @Override
    public RestResp<List<User>> getAllUsers() {
        List<User> allUsers = userDao.getAllUsers();
        if (allUsers != null) {
            return new RestResp<>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), allUsers);
        } else {
            return new RestResp<>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(), null);
        }
    }

    // Get a user by id
    @Override
    public RestResp<User> getUserById(Long id) {
        User user = userDao.getUserById(id);
        if (user != null) {
            return new RestResp<>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), user);
        } else {
            return new RestResp<>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(), null);
        }
    }

    // Update a user
    @Override
    public RestResp<String> updateUser(User user, Long id) {
        User usr = new User();
        usr.setUsername(user.getUsername());
        usr.setFirstName(user.getFirstName());
        usr.setLastName(user.getLastName());
        usr.setEmail(user.getEmail());
        usr.setPhoneNumber(user.getPhoneNumber());
        if (userDao.updateUser(usr, id) > 0) {
            return new RestResp<>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), "User updated");
        } else {
            return new RestResp<>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(),"Failed to update user");
        }
    }

    // Delete a user
    @Override
    public RestResp<String> deleteUser(Long id) {
        if (userDao.deleteUser(id) > 0) {
            return new RestResp<>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), "User deleted");
        } else {
            return new RestResp<>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(), "Failed to delete user");
        }
    }
}
