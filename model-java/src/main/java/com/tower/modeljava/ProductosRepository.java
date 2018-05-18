package com.tower.modeljava;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductosRepository extends CrudRepository<Producto, Long> {

    Optional<Producto> findById(Long id);
}
