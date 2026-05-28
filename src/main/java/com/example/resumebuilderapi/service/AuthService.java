package com.example.resumebuilderapi.service;

import org.springframework.stereotype.Service;

import com.example.resumebuilderapi.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthService {
    private final UserRepository userRepository;

    public AuthResponse register(RegisterRequest request)
    {
        log.info("inside AuthService: register() {}" , request);

    }
}
