package com.cibertec.desappwebt2.application.usecase.implementation;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProductoRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoResponse;
import com.cibertec.desappwebt2.application.usecase.interfaces.IProductoInterface;
import com.cibertec.desappwebt2.domain.services.interfaces.IProductoService;
import com.cibertec.desappwebt2.infrastucture.database.dto.ProductoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductoImplementation implements IProductoInterface {
    private final IProductoService productoService;

    @Override
    public List<ProductoResponse> findAll() {
        return productoService.findAll();
    }

    @Override
    public ProductoResponse findById(Integer id) {
        return productoService.findById(id);
    }

    @Override
    public ProductoResponse save(ProductoRequest entity) {
        return productoService.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        productoService.delete(id);
    }

    @Override
    public ProductoResponse update(Integer id, ProductoRequest entity) {
        return productoService.update(id, entity);
    }
}
