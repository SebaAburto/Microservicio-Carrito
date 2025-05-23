package com.carrito.carrito.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name="Estado")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Estado {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer estado_id;

    @Column(nullable = false)
    private String descripcion;

}