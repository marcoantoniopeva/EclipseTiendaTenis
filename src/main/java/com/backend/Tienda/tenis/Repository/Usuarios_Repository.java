package com.backend.Tienda.tenis.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.Tienda.tenis.Entity.UsuariosEntity;


public interface Usuarios_Repository extends JpaRepository<UsuariosEntity, Long>{

}
