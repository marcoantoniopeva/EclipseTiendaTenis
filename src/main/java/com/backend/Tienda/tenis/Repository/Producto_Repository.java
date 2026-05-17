package com.backend.Tienda.tenis.Repository;

import com.backend.Tienda.tenis.Entity.ProductoEntity; // Cambia según la entidad
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Producto_Repository extends JpaRepository<ProductoEntity, Integer> { 
}