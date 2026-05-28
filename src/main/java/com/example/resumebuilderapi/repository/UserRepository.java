package com.example.resumebuilderapi.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.resumebuilderapi.document.User;

public interface UserRepository extends MongoRepository<User, String>{
    Optional<User> findByEmail(String email);
}
