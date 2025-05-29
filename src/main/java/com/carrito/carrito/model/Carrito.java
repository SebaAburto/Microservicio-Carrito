package com.carrito.carrito.model;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name="Carrito")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Carrito {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer carrito_id;

    @Column(nullable = true)
    private Integer cantidad;

    @Column(nullable = true)
    private Date fecha_creacion;
    
    @Column(nullable = true)
    private Date fecha_modificacion;

    @ManyToOne
    private Usuario usuario;

    @OneToOne
    private Tipo_estado tipo_estado;

    @ManyToMany
    private Producto producto;
}

