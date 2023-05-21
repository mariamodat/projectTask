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

//    @Column(length = 15)
//    private String password;
//
//    @Column(length = 10)
//    private String username;
//
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(	name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private Set<Role> roles = new HashSet<>();
    @Column(name = "role")
    String role;
}
