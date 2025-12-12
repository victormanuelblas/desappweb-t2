package com.cibertec.desappwebt2.infrastucture.database.repositories;

import com.cibertec.desappwebt2.infrastucture.database.dto.ProveedorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends CrudRepository<ProveedorEntity, Long> {

}
