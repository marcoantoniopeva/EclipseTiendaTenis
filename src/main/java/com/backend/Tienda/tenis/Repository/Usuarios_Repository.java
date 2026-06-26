package com.backend.Tienda.tenis.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.Tienda.tenis.Entity.UsuariosEntity;

@Repository
public interface Usuarios_Repository extends JpaRepository<UsuariosEntity, Integer>{
}