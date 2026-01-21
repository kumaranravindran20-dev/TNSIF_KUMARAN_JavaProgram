package com.adminservice.service;

import com.adminservice.entity.User;
import java.util.List;

public interface AdminService {

    List<User> getAllUsers();

    User createUser(User user);
    
    User getUserById(Long id);
    User updateUser(Long id, User user);

}
