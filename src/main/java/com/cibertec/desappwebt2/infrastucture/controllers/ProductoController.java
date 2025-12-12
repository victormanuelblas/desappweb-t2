package com.cibertec.desappwebt2.infrastucture.controllers;

import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoResponse;
import com.cibertec.desappwebt2.application.usecase.interfaces.IProductoInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {
    private  final IProductoInterface productoInterface;

    @GetMapping("")
    public ResponseEntity<List<ProductoResponse>> getAllUsers() {
        return ResponseEntity.ok(productoInterface.findAll());
    }

}
