package com.backend.Tienda.tenis.Repository;

import com.backend.Tienda.tenis.Entity.Datos_PersonalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Datos_Personales_Repository extends JpaRepository<Datos_PersonalesEntity, Integer> {
    
    // Consulta JPQL explícita (funciona con cualquier nombre de campo)
    @Query("SELECT d FROM Datos_PersonalesEntity d WHERE d.id_usuario = :idUsuario")
    Datos_PersonalesEntity findByIdUsuario(@Param("idUsuario") Integer idUsuario);
}