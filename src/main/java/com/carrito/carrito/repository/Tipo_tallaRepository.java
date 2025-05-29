package com.carrito.carrito.repository;

import com.carrito.carrito.model.Tipo_talla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_tallaRepository extends JpaRepository<Tipo_talla, Long> {
}
