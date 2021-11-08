package com.spring_boot_jwt_dcl.repository;

import com.spring_boot_jwt_dcl.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
