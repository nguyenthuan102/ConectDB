package com.example.ConectDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConectDB.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, String>{

}
