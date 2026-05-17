package com.backend.Tienda.tenis.Repository;
import com.backend.Tienda.tenis.Entity.DireccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Direccion_Repository extends JpaRepository<DireccionEntity, Integer> { }