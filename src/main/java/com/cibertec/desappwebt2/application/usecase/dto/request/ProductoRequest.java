package com.cibertec.desappwebt2.application.usecase.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoRequest {
    private String nombreProducto;
    private Integer cantidad;
    private Double precioUnitario;
}
