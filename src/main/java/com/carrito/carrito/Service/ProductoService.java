package com.carrito.carrito.Service;

import com.carrito.carrito.model.Producto;
import com.carrito.carrito.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Producto findById(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    public List<Producto> findByCategoria(String categoria) {
        return productoRepository.findByCategoria(categoria);
    }

    public long countByCategoria(String categoria) {
        return productoRepository.countByCategoria(categoria);
    }

    public List<Producto> findByNombre(String nombre) {
        return productoRepository.findByNombreContainingIgnoreCase(nombre);
    }
}