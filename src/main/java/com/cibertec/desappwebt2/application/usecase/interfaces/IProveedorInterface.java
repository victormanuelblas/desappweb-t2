package com.cibertec.desappwebt2.application.usecase.interfaces;

import com.cibertec.desappwebt2.infrastucture.database.dto.ProveedorEntity;

import java.util.List;

public interface IProveedorInterface {
    List<ProveedorEntity> findAll();
    ProveedorEntity findById(Long id);
    ProveedorEntity save(ProveedorEntity entity);
    void deleteById(Long id);
    ProveedorEntity update(ProveedorEntity entity);
}
