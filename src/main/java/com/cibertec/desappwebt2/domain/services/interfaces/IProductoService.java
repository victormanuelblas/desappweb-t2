package com.cibertec.desappwebt2.domain.services.interfaces;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProductoRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoResponse;

import java.util.List;

public interface IProductoService {
    List<ProductoResponse> findAll();
    ProductoResponse findById(Integer id);
    ProductoResponse save(ProductoRequest request);
    ProductoResponse update(Integer id, ProductoRequest request);
    void delete(Integer id);
}
