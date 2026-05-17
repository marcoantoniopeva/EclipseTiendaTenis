package com.backend.Tienda.tenis.Repository;
import com.backend.Tienda.tenis.Entity.EstadoVEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoV_Repository extends JpaRepository<EstadoVEntity, Integer> { }