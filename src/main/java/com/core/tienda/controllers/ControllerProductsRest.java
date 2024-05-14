package com.core.tienda.controllers;

import com.core.tienda.domain.Producto;
import com.core.tienda.services.ProductoService;
import com.core.tienda.services.ProductosServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ControllerProductsRest {


    @Autowired
    ProductosServicesImpl productosServicios;

    @GetMapping("/")
    public ResponseEntity<?> getProducto(){

        List<Producto> productos = productosServicios.productos;

        return ResponseEntity.ok(productos);
    }

}
