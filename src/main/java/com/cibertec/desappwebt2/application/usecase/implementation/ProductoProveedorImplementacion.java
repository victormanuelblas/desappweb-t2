package com.cibertec.desappwebt2.application.usecase.implementation;

import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoProveedorResponse;
import com.cibertec.desappwebt2.application.usecase.interfaces.IProductoProveedorInterface;
import com.cibertec.desappwebt2.domain.services.interfaces.IProductoProveedorService;
import com.cibertec.desappwebt2.infrastucture.database.dto.ProductoEntity;
import com.cibertec.desappwebt2.infrastucture.database.repositories.ProductoRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductoProveedorImplementacion implements IProductoProveedorInterface {

    private final ProductoRepository productoRepository;
    private final IProductoProveedorService productoProveedorService;

    @Override
    public List<ProductoProveedorResponse> ListarProductosProveedor(String criterio, String valor) {
        return productoProveedorService.ListarProductosProveedor(criterio, valor);
    }
}
