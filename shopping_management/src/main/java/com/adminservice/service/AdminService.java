package com.adminservice.service;



import java.util.List;
import com.adminservice.entity.User;

public interface AdminService {

    User createAdmin(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
}
