package com.example.usermanagement.dao;

import com.example.usermanagement.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * • Creating new users
     * • Listing all available users
     * • Listing a single user
     * • Updating an existing user
     * • Deleting an existing user
     *
     */
    int createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    int updateUser(@Param("user") User user, @Param("id") Long id);

    int deleteUser(Long id);

}
