package com.cibertec.desappwebt2.application.usecase.interfaces;

import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoProveedorResponse;

import java.util.List;

public interface IProductoProveedorInterface {
    List<ProductoProveedorResponse>ListarProductosProveedor(
            String criterio,
            String valor
    );
}
