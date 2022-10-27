package com.example.ConectDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ConectDB.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, String>{

}
