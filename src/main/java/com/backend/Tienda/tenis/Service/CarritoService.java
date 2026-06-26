package com.backend.Tienda.tenis.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Tienda.tenis.Entity.CarritoEntity;
import com.backend.Tienda.tenis.Repository.Carrito_Repository;

@Service
public class CarritoService {

    @Autowired
    private Carrito_Repository carritoRepository;

    public List<CarritoEntity> obtenerCarritoUsuario(Integer idUsuario) {
        return carritoRepository.findByIdUsuario(idUsuario);
    }

    public CarritoEntity agregarOActualizar(CarritoEntity carrito) {
        // Verificar si ya existe el producto en el carrito del usuario
        CarritoEntity existente = carritoRepository.findByUsuarioAndProducto(carrito.getId_usuario(), carrito.getId_producto());
        
        if (existente != null) {
            // Si existe, solo sumamos la cantidad
            existente.setCantidad(existente.getCantidad() + carrito.getCantidad());
            return carritoRepository.save(existente);
        } else {
            // Si no existe, lo guardamos como nuevo
            return carritoRepository.save(carrito);
        }
    }

    public void actualizarCantidad(Integer idCarrito, Integer nuevaCantidad) {
        CarritoEntity item = carritoRepository.findById(idCarrito).orElse(null);
        if (item != null) {
            item.setCantidad(nuevaCantidad);
            carritoRepository.save(item);
        }
    }

    public void eliminarItem(Integer idCarrito) {
        carritoRepository.deleteById(idCarrito);
    }
    
    public void vaciarCarrito(Integer idUsuario) {
        List<CarritoEntity> items = carritoRepository.findByIdUsuario(idUsuario);
        carritoRepository.deleteAll(items);
    }
}