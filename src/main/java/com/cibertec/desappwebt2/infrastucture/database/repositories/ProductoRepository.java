package com.cibertec.desappwebt2.infrastucture.database.repositories;

import com.cibertec.desappwebt2.infrastucture.database.dto.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Integer> {
    List<ProductoEntity> findByProveedorId(Integer id);
    List<ProductoEntity> findByProveedorNombreProveedor(String nombre);
    List<ProductoEntity> findByProveedorDireccion(String direccion);
    List<ProductoEntity> findByProveedorApoderadoLegal(String apoderadoLegal);
}
