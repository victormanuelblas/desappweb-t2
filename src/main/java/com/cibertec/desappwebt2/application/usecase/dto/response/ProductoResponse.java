package com.cibertec.desappwebt2.application.usecase.dto.response;

import com.cibertec.desappwebt2.infrastucture.database.dto.ProveedorEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoResponse {
    private Long id;
    private String nombreProducto;
    private Integer cantidad;
    private Double precioUnitario;

    private ProveedorEntity proveedor;
}
