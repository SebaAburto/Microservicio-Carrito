package com.carrito.carrito.repository;

import com.carrito.carrito.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByCategoria(String categoria);

    long countByCategoria(String categoria);

    List<Producto> findByNombreContainingIgnoreCase(String nombre);

}