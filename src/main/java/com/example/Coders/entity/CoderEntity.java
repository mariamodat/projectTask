package com.example.Coders.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "coderz")
public class CoderEntity {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "username")
    String username;
    @Column(name = "role")
    String role;
}
