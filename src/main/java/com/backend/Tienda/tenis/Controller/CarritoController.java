package com.backend.Tienda.tenis.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.Tienda.tenis.Entity.CarritoEntity;
import com.backend.Tienda.tenis.Service.CarritoService;

@RestController
@RequestMapping("/api/carrito")
@CrossOrigin("*")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    // Ver carrito de un usuario
    @GetMapping("/usuario/{idUsuario}")
    public List<CarritoEntity> verCarrito(@PathVariable Integer idUsuario) {
        return carritoService.obtenerCarritoUsuario(idUsuario);
    }

    // Agregar producto al carrito (o sumar si ya existe)
    @PostMapping("/agregar")
    public CarritoEntity agregar(@RequestBody CarritoEntity carrito) {
        return carritoService.agregarOActualizar(carrito);
    }

    // Modificar cantidad de un item específico
    @PutMapping("/actualizar/{idCarrito}/{cantidad}")
    public void actualizarCantidad(@PathVariable Integer idCarrito, @PathVariable Integer cantidad) {
        carritoService.actualizarCantidad(idCarrito, cantidad);
    }

    // Eliminar un producto del carrito
    @DeleteMapping("/eliminar/{idCarrito}")
    public void eliminar(@PathVariable Integer idCarrito) {
        carritoService.eliminarItem(idCarrito);
    }
}