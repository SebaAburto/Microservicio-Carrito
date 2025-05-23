package com.carrito.carrito.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//TABLA DE RELACION

@Entity
@Table(name="Carrito_Producto")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Carrito_Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer carrito_producto_id;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = true)
    private double precio_unitario;
    
    @OneToMany
    private Producto producto;

    @OneToMany
    private Carrito carrito;

}

