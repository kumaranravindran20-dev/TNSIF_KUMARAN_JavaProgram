package com.adminservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.adminservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
