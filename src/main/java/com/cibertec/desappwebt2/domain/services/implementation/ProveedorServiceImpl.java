package com.cibertec.desappwebt2.domain.services.implementation;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProveedorRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoResponse;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProveedorResponse;
import com.cibertec.desappwebt2.domain.services.interfaces.IProveedorService;
import com.cibertec.desappwebt2.infrastucture.database.dto.ProductoEntity;
import com.cibertec.desappwebt2.infrastucture.database.dto.ProveedorEntity;
import com.cibertec.desappwebt2.infrastucture.database.repositories.ProveedorRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProveedorServiceImpl implements IProveedorService {
    private final ProveedorRepository proveedorRepository;
    private final ObjectMapper objectMapper;

    @Override
    public List<ProveedorResponse> findAll() {
        Iterable<ProveedorEntity> proveedorEntities = proveedorRepository.findAll();
        List<ProveedorResponse> proveedores = new ArrayList<>();
        for(ProveedorEntity proveedor : proveedorEntities) {
            ProveedorResponse proveedorResponse = objectMapper.convertValue(proveedor, ProveedorResponse.class);
            proveedores.add(proveedorResponse);
        }
        return proveedores;
    }

    @Override
    public ProveedorResponse findById(Integer id) {
        ProveedorEntity proveedorEntity = proveedorRepository.findById(id).orElseThrow(
                () ->  new EntityNotFoundException("Proveedor id " + id + " not found")
        );
        var proveedorResponse = objectMapper.convertValue(proveedorEntity, ProveedorResponse.class);

        return proveedorResponse;
    }

    @Override
    public ProveedorResponse save(ProveedorRequest request) {
        ProveedorEntity proveedorEntity = objectMapper.convertValue(request, ProveedorEntity.class);
        var response = proveedorRepository.save(proveedorEntity);
        var proveedorResponse = objectMapper.convertValue(response, ProveedorResponse.class);
        return proveedorResponse;
    }

    @Override
    public ProveedorResponse update(Integer id, ProveedorRequest request) {
        ProveedorEntity proveedorEntity = proveedorRepository.findById(id).orElseThrow(
                () ->  new EntityNotFoundException("Proveedor id " + id + " not found")
        );

        proveedorEntity.setNombreProveedor(request.getNombreProveedor());
        proveedorEntity.setDireccion(request.getDireccion());
        proveedorEntity.setApoderadoLegal(request.getApoderadoLegal());

        var response = proveedorRepository.save(proveedorEntity);
        var proveedorResponse = objectMapper.convertValue(response, ProveedorResponse.class);
        return proveedorResponse;
    }

    @Override
    public void delete(Integer id) {
        ProveedorEntity proveedorEntity = proveedorRepository.findById(id).orElseThrow(
                () ->  new EntityNotFoundException("Proveedor id " + id + " not found")
        );
        proveedorRepository.delete(proveedorEntity);
    }
}
