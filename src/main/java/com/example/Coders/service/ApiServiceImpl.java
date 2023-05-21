package com.example.Coders.service;

import com.example.Coders.adapter.repository.Repo;
import com.example.Coders.entity.CoderEntity;
import com.example.Coders.exception.AlreadyExistsException;
import com.example.Coders.model.Coderz;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {
    private final Repo repository;

    public void createNewUser(Coderz coder) {

        repository.save(mapToEntity(coder));
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Coderz> getCoderById(Long id) throws AlreadyExistsException {

        Optional<CoderEntity> coderzEntity = repository.getCoderzById(id);
        return coderzEntity.map(this::toCoderz);
    }

    private CoderEntity mapToEntity(Coderz coder) {
        CoderEntity entity = new CoderEntity();
        entity.setId(coder.getId());
        entity.setUsername(coder.getUsername());
        return entity;
    }

    private Coderz toCoderz(CoderEntity entity) {
        return Coderz.builder().id(entity.getId())
                .username(entity.getUsername())
                .build();
    }
}
