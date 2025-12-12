package com.cibertec.desappwebt2.application.usecase.dto.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProveedorResponse {
    private Integer id;
    private String nombreProveedor;
    private String direccion;
    private String apoderadoLegal;
}
