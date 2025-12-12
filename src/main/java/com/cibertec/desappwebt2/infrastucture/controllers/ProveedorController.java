package com.cibertec.desappwebt2.infrastucture.controllers;

import com.cibertec.desappwebt2.application.usecase.dto.request.ProveedorRequest;
import com.cibertec.desappwebt2.application.usecase.dto.response.ProveedorResponse;
import com.cibertec.desappwebt2.application.usecase.interfaces.IProveedorInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/proveedores")
@RequiredArgsConstructor
public class ProveedorController {
    private final IProveedorInterface proveedorInterface;

    @GetMapping("")
    public ResponseEntity<List<ProveedorResponse>> findAll() {
        return ResponseEntity.ok(proveedorInterface.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<ProveedorResponse> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(proveedorInterface.findById(id));
    }

    @PostMapping("")
    public ResponseEntity<ProveedorResponse> save(@RequestBody ProveedorRequest entity) {
        return ResponseEntity.status(201).body(proveedorInterface.save(entity));
    }

    @PutMapping("{id}")
    public ResponseEntity<ProveedorResponse> update(@PathVariable Integer id, @RequestBody ProveedorRequest entity) {
        return ResponseEntity.ok(proveedorInterface.update(id, entity));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Map> delete(@PathVariable Integer id) {
        proveedorInterface.deleteById(id);
        return ResponseEntity.ok(
                Map.of("message", "Proveedor eliminado con éxito")
        );
    }
}
