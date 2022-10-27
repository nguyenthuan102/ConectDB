package com.example.ConectDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConectDB.entity.Migration;

public interface MigrationRepository extends JpaRepository<Migration, String>{

}
