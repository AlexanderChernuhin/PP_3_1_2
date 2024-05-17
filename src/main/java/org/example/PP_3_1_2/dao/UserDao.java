package org.example.PP_3_1_2.dao;

import org.example.PP_3_1_2.model.User;

import java.util.List;


public interface UserDao {
    public List<User> getAllUsers();

    public User getUserById(long id);

    public void saveUser(User user);

    void updateUser(User updatedUser);

    public void deleteUser(long id);
}