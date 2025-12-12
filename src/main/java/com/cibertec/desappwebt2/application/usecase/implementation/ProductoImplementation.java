package com.cibertec.desappwebt2.application.usecase.implementation;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProductoRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoResponse;
import com.cibertec.desappwebt2.application.usecase.interfaces.IProductoInterface;
import com.cibertec.desappwebt2.infrastucture.database.dto.ProductoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductoImplementation implements IProductoInterface {


    @Override
    public List<ProductoResponse> findAll() {
        return List.of();
    }

    @Override
    public ProductoResponse findById(Long id) {
        return null;
    }

    @Override
    public ProductoResponse save(ProductoRequest entity) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public ProductoResponse update(ProductoRequest entity) {
        return null;
    }
}
