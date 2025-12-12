package com.cibertec.desappwebt2.domain.services.implementation;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProductoRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoResponse;
import com.cibertec.desappwebt2.domain.services.interfaces.IProductoService;
import com.cibertec.desappwebt2.infrastucture.database.dto.ProductoEntity;
import com.cibertec.desappwebt2.infrastucture.database.repositories.ProductoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements IProductoService {
    private final ProductoRepository productoRepository;
    private final ObjectMapper objectMapper;

    @Override
    public List<ProductoResponse> findAll() {

        Iterable<ProductoEntity> productos = productoRepository.findAll();
        List<ProductoResponse> productosLista = new ArrayList<>();
        for  (ProductoEntity producto : productos) {

            ProductoResponse productoResponse = objectMapper.convertValue(producto, ProductoResponse.class);
            productosLista.add(productoResponse);
        }
        return productosLista;
    }

    @Override
    public ProductoResponse findById(Integer id) {
        ProductoEntity productoEntity = productoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("No existe el producto")
        );
        ProductoResponse productoResponse = objectMapper.convertValue(productoEntity, ProductoResponse.class);
        return productoResponse;
    }

    @Override
    public ProductoResponse save(ProductoRequest request) {

        ProductoEntity productoEntity = objectMapper.convertValue(request, ProductoEntity.class);
        var response = productoRepository.save(productoEntity);
        var productoResponse = objectMapper.convertValue(response, ProductoResponse.class);

        return productoResponse;
    }

    @Override
    public ProductoResponse update(Integer id, ProductoRequest request) {
        ProductoEntity productoEntity = productoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("No existe el producto")
        );

        productoEntity.setNombreProducto(request.getNombreProducto());
        productoEntity.setCantidad(request.getCantidad());
        productoEntity.setPrecioUnitario(request.getPrecioUnitario());

        var response = productoRepository.save(productoEntity);

        var productoResponse = objectMapper.convertValue(response, ProductoResponse.class);

        return productoResponse;
    }

    @Override
    public void delete(Integer id) {
        ProductoEntity productoEntity = productoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("No existe el producto")
        );
        productoRepository.delete(productoEntity);
    }
}
