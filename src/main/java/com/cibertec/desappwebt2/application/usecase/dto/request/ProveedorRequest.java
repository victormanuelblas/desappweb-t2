package com.cibertec.desappwebt2.application.usecase.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProveedorRequest {
    private String nombreProveedor;
    private String direccion;
    private String apoderadoLegal;
}
