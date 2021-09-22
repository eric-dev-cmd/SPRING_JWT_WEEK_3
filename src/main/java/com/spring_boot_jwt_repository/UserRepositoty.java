/**
 * 
 */
package com.spring_boot_jwt_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_boot_jwt_entity.User;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Repository
public interface UserRepositoty extends JpaRepository<User, Integer>{

}
