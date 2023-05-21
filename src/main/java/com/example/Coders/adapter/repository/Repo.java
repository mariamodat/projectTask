package com.example.Coders.adapter.repository;

import com.example.Coders.entity.CoderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface Repo extends JpaRepository<CoderEntity,Long> {
    Optional<CoderEntity> getCoderzById(Long id);
}
