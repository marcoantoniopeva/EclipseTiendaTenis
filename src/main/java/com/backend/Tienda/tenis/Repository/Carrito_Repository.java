package com.backend.Tienda.tenis.Repository;

import com.backend.Tienda.tenis.Entity.CarritoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Carrito_Repository extends JpaRepository<CarritoEntity, Integer> {
    
    @Query("SELECT c FROM CarritoEntity c WHERE c.id_usuario = :idUsuario")
    List<CarritoEntity> findByIdUsuario(@Param("idUsuario") Integer idUsuario);

    @Query("SELECT c FROM CarritoEntity c WHERE c.id_usuario = :idUsuario AND c.id_producto = :idProducto")
    CarritoEntity findByUsuarioAndProducto(@Param("idUsuario") Integer idUsuario, @Param("idProducto") Integer idProducto);
}