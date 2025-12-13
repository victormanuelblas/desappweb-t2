package com.cibertec.desappwebt2.domain.services.interfaces;

import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoProveedorResponse;

import java.util.List;

public interface IProductoProveedorService {
    List<ProductoProveedorResponse> ListarProductosProveedor(
            String criterio,
            String valor
    );
}
