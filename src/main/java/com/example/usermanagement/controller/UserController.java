package com.example.usermanagement.controller;

import com.example.usermanagement.common.RestResp;
import com.example.usermanagement.model.User;
import com.example.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping
    public RestResp<String> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public RestResp<List<User>> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public RestResp<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public RestResp<String> updateUser(@RequestBody User user,@PathVariable Long id) {
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public RestResp<String> deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}
