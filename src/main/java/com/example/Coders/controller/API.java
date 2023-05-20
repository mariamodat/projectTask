package com.example.Coders.controller;

import com.example.Coders.adapter.dto.CoderDto;
import com.example.Coders.model.Coderz;
import com.example.Coders.service.ApiServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class API {

    private final ApiServiceImpl service;

    @GetMapping
    public String HelloWorld(@RequestParam String name) {
        return "Hi " + name;
    }

    @PostMapping()
    public ResponseEntity<String> addNewUser(@RequestBody CoderDto dto) {
        Optional<Coderz> coderById = service.getCoderById(dto.getId());
        if (coderById.isPresent()) {
            return new ResponseEntity<>("User Already Exists!", HttpStatus.BAD_REQUEST);
        }
        service.createNewUser(maptoModel(dto));
        return new ResponseEntity<>(HttpStatus.OK);

    }

    private Coderz maptoModel(CoderDto dto) {
        return Coderz.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }
}
