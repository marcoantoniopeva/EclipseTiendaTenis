package com.backend.Tienda.tenis.Repository;

import com.backend.Tienda.tenis.Entity.VentaEntity; // Cambia según la entidad
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Venta_Repository extends JpaRepository<VentaEntity, Integer> { 
}