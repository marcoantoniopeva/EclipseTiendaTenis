package com.backend.Tienda.tenis.Repository;
import com.backend.Tienda.tenis.Entity.Datos_PersonalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Datos_Personales_Repository extends JpaRepository<Datos_PersonalesEntity, Integer> {
}