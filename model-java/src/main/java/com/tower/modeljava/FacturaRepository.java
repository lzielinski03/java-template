package com.tower.modeljava;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FacturaRepository  extends CrudRepository<Factura, Long> {

    Optional<Factura> findById(Long id);
}
