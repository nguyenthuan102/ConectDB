package com.example.ConectDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConectDB.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, String>{

}
