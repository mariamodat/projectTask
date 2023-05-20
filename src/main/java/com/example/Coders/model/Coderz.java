package com.example.Coders.model;

import com.example.Coders.entity.Role;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class Coderz {

    Long id;
    String name;
     String password;
     String username;
     Set<Role> roles;




}
