package com.backend.Tienda.tenis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.backend.Tienda.tenis.Entity.ProductoEntity;
import com.backend.Tienda.tenis.Service.ProductoService;

@RestController
@RequestMapping("/agregar")
@CrossOrigin("*")
public class GuardarController {

    @Autowired
    private ProductoService productoService;

    // 1. CONSULTAR: GET a http://localhost:8080/agregar/consultar
    @GetMapping("/consultar")
    public List<ProductoEntity> consultarProductos() {
        return productoService.listar();
    }

    // 2. AGREGAR: POST a http://localhost:8080/agregar/nuevo
    @PostMapping("/nuevo")
    public ProductoEntity agregarProducto(@RequestBody ProductoEntity producto) {
        System.out.println("imagen_url recibida: " + producto.getImagen_url());
        return productoService.guardar(producto);
    }

    // 3. ACTUALIZAR: PUT a http://localhost:8080/agregar/actualizar/{id}
    @PutMapping("/actualizar/{id}")
    public ProductoEntity actualizarProducto(@RequestBody ProductoEntity producto, @PathVariable Integer id) {
        producto.setId_producto(id);
        return productoService.guardar(producto);
    }

    // 4. ELIMINAR: DELETE a http://localhost:8080/agregar/eliminar/{id}
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Integer id) {
        productoService.eliminar(id);
    }
}