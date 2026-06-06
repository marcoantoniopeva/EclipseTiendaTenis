package com.backend.Tienda.tenis.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Tienda.tenis.Entity.ProductoEntity;
import com.backend.Tienda.tenis.Repository.Producto_Repository;

@Service
public class ProductoService {

    @Autowired
    private Producto_Repository productoRepository;

    // Método para consultar
    public List<ProductoEntity> listar() {
        return (List<ProductoEntity>) productoRepository.findAll();
    }

    // --- MÉTODOS NUEVOS AGREGADOS ---

    // Método para guardar (Spring Boot es inteligente: si el ID no existe, lo crea; si ya existe, lo actualiza)
    public ProductoEntity guardar(ProductoEntity producto) {
        return productoRepository.save(producto);
    }

    // Método para eliminar buscando por su ID
    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }
}