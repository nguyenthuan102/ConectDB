package com.example.ConectDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConectDB.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
