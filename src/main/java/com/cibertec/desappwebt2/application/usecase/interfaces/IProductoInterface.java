package com.cibertec.desappwebt2.application.usecase.interfaces;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProductoRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoResponse;

import java.util.List;

public interface IProductoInterface {
    List<ProductoResponse> findAll();
    ProductoResponse findById(Long id);
    ProductoResponse save(ProductoRequest entity);
    void deleteById(Long id);
    ProductoResponse update(ProductoRequest entity);
}
