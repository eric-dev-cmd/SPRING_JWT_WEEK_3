package com.spring_boot_jwt_dcl.repository;

import com.spring_boot_jwt_dcl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
