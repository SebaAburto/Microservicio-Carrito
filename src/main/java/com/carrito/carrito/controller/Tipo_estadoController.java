package com.carrito.carrito.controller;

import com.carrito.carrito.model.Tipo_estado;
import com.carrito.carrito.Service.Tipo_estadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tipo-estados")
public class Tipo_estadoController {

    @Autowired
    private Tipo_estadoService tipo_estadoService;

    @GetMapping
    public ResponseEntity<List<Tipo_estado>> listar() {
        List<Tipo_estado> estados = tipo_estadoService.findAll();
        if (estados.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(estados);
    }

    @PostMapping
    public ResponseEntity<Tipo_estado> guardar(@RequestBody Tipo_estado tipo_estado) {
        Tipo_estado nuevoEstado = tipo_estadoService.save(tipo_estado);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEstado);
    }
}
