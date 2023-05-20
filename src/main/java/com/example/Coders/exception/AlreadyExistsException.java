package com.example.Coders.exception;

public class AlreadyExistsException extends RuntimeException {
    @Override
    public String getMessage() {
        return "user already Exists";
    }
}
