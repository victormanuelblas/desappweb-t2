package com.cibertec.desappwebt2.application.usecase.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoProveedorResponse {

    private String nombreProducto;
    private Integer cantidad;
    private Double precioUnitario;

    private String nombreProveedor;
    private String direccion;
    private String apoderadoLegal;
}

