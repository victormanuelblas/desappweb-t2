package com.cibertec.desappwebt2.infrastucture.controllers;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProductoRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoProveedorResponse;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoResponse;
import com.cibertec.desappwebt2.application.usecase.interfaces.IProductoInterface;
import com.cibertec.desappwebt2.application.usecase.interfaces.IProductoProveedorInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoController {
    private  final IProductoInterface productoInterface;
    private final IProductoProveedorInterface productoProveedorInterface;

    @GetMapping("")
    public ResponseEntity<List<ProductoResponse>> getAllUsers() {
        return ResponseEntity.ok(productoInterface.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductoResponse> findById(@PathVariable Integer id) {
        return  ResponseEntity.ok(productoInterface.findById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Map> deleteById(@PathVariable Integer id) {
        productoInterface.deleteById(id);
        return ResponseEntity.ok(
                Map.of("message", "Producto eliminado con éxito")
        );
    }

    @PostMapping("")
    public ResponseEntity<ProductoResponse> save(@RequestBody ProductoRequest entity) {
        return ResponseEntity.ok(productoInterface.save(entity));
    }

    @PutMapping("{id}")
    public ResponseEntity<ProductoResponse> update(@PathVariable Integer id, @RequestBody ProductoRequest entity) {
        return ResponseEntity.ok(productoInterface.update(id, entity));
    }

    @GetMapping("/reporte/productoproveedor")
    public ResponseEntity<List<ProductoProveedorResponse>> reporteProductoProveedor (
            @RequestParam String criterio, String valor
    ) {
        return ResponseEntity.ok(productoProveedorInterface.ListarProductosProveedor(criterio, valor));
    }
}
