package com.backend.Tienda.tenis.Repository;

import com.backend.Tienda.tenis.Entity.RolEntity; // Cambia según la entidad
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rol_Repository extends JpaRepository<RolEntity, Integer> { 
}