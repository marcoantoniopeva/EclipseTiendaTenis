package com.backend.Tienda.tenis.Repository;

import com.backend.Tienda.tenis.Entity.DireccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Direccion_Repository extends JpaRepository<DireccionEntity, Integer> { 
    
    // Usamos @Query para evitar el error de camelCase vs snake_case
    @Query("SELECT d FROM DireccionEntity d WHERE d.id_datos_personales = :idDatos")
    List<DireccionEntity> findByIdDatosPersonales(@Param("idDatos") Integer idDatos);
}