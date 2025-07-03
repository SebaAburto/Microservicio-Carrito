package com.carrito.carrito.assembler;

import com.carrito.carrito.controller.ProductoControllerV2;
import com.carrito.carrito.model.Producto;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class ProductoModelAssembler implements RepresentationModelAssembler<Producto, EntityModel<Producto>> {

    @Override
    public EntityModel<Producto> toModel(Producto producto) {
        return EntityModel.of(producto,
                linkTo(methodOn(ProductoControllerV2.class).buscar(producto.getProducto_id().longValue())).withSelfRel(),
                linkTo(methodOn(ProductoControllerV2.class).listar()).withRel("productos"));
    }
}