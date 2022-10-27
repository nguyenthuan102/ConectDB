package com.example.ConectDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConectDB.entity.Language;

public interface LanguageRepository extends JpaRepository<Language, String>{

}
