package com.example.usermanagement;

import com.example.usermanagement.model.User;
import com.example.usermanagement.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Autowired
    private UserService userService;

    @Test
    public void getAllUsers() {
        log.info("All users: {}", userService.getAllUsers());
    }

    @Test
    public void createUser() {
        User user = new User();
        user.setUsername("zackzhai");
        user.setFirstName("Zack");
        user.setLastName("Zhai");
        user.setEmail("zack@example.com");
        user.setPhoneNumber("1234567890");
        log.info("User created: {}", userService.createUser(user));
    }

    @Test
    public void getUserById() {
        Long id = 10L;
        log.info("User with id {}: {}", id, userService.getUserById(id));
    }

    @Test
    public void updateUser() {
        Long id = 10L;
        User user = new User();
        user.setUsername("zackzhai");
        user.setFirstName("Zack");
        user.setLastName("Zhai");
        user.setEmail("zack@example.com");
        user.setPhoneNumber("1111111111");
        log.info("User updated: {}", userService.updateUser(user, id));
    }

    @Test
    public void deleteUser() {
        Long id = 10L;
        log.info("User deleted: {}", userService.deleteUser(id));
    }
}
