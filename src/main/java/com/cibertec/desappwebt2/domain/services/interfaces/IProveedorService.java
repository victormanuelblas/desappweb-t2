package com.cibertec.desappwebt2.domain.services.interfaces;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProveedorRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProveedorResponse;

import java.util.List;

public interface IProveedorService {
    List<ProveedorResponse> findAll();
    ProveedorResponse findById(Integer id);
    ProveedorResponse save(ProveedorRequest request);
    ProveedorResponse update(Integer id, ProveedorRequest request);
    void delete(Integer id);
}
