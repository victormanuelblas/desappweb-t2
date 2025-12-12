package com.cibertec.desappwebt2.application.usecase.implementation;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProveedorRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProveedorResponse;
import com.cibertec.desappwebt2.application.usecase.interfaces.IProveedorInterface;
import com.cibertec.desappwebt2.domain.services.interfaces.IProveedorService;
import com.cibertec.desappwebt2.infrastucture.database.repositories.ProveedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProveedorImplementation implements IProveedorInterface {
    private final IProveedorService proveedorService;

    @Override
    public List<ProveedorResponse> findAll() {
        return proveedorService.findAll();
    }

    @Override
    public ProveedorResponse findById(Integer id) {
        return proveedorService.findById(id);
    }

    @Override
    public ProveedorResponse save(ProveedorRequest entity) {
        return proveedorService.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        proveedorService.delete(id);
    }

    @Override
    public ProveedorResponse update(Integer id, ProveedorRequest entity) {
        return proveedorService.update(id, entity);
    }
}
