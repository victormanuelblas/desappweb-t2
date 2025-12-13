package com.cibertec.desappwebt2.domain.services.implementation;

import com.cibertec.desappwebt2.application.usecase.dto.response.ProductoProveedorResponse;
import com.cibertec.desappwebt2.domain.services.interfaces.IProductoProveedorService;
import com.cibertec.desappwebt2.infrastucture.database.dto.ProductoEntity;
import com.cibertec.desappwebt2.infrastucture.database.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoProveedorServiceImpl implements IProductoProveedorService {
    private final ProductoRepository productoRepository;
    @Override
    public List<ProductoProveedorResponse> ListarProductosProveedor(String criterio, String valor) {
        List<ProductoEntity> productos;

        switch (criterio.toLowerCase()) {
            case "id":
                productos = productoRepository.findByProveedorId(
                        Integer.parseInt(valor));
                break;

            case "nombre":
                productos = productoRepository
                        .findByProveedorNombreProveedor(valor);
                break;

            case "direccion":
                productos = productoRepository
                        .findByProveedorDireccion(valor);
                break;

            case "apoderado":
                productos = productoRepository
                        .findByProveedorApoderadoLegal(valor);
                break;

            default:
                throw new IllegalArgumentException("Criterio no válido");
        }

        return productos.stream().map(p ->
                new ProductoProveedorResponse(
                        p.getNombreProducto(),
                        p.getCantidad(),
                        p.getPrecioUnitario(),
                        p.getProveedor().getNombreProveedor(),
                        p.getProveedor().getDireccion(),
                        p.getProveedor().getApoderadoLegal()
                )
        ).toList();
    }
}
