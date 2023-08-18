package com.jwt.project.jwtauthentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jwt.project.jwtauthentication.entity.User;



public interface UserRepository extends JpaRepository<User, String> {
    
    public Optional<User>  findByEmail(String email);
}
