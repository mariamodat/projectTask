package com.example.Coders.service;

import com.example.Coders.model.Coderz;

import java.util.Optional;

public interface ApiService {
    void createNewUser(Coderz coder);
    Optional<Coderz> getCoderById(Long id);
}
