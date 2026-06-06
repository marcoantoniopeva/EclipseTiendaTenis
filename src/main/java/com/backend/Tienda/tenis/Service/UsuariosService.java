package com.backend.Tienda.tenis.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Tienda.tenis.Entity.UsuariosEntity;
import com.backend.Tienda.tenis.Repository.Usuarios_Repository;

import jakarta.transaction.Transactional;

@Service
public class UsuariosService {

	@Autowired
	private Usuarios_Repository usuariosrepository;
	
	// 1. Cambiamos 'mostrardatos' por 'listar' para que coincida con el Controller
	@Transactional
	public List<UsuariosEntity> listar() {
		return usuariosrepository.findAll();
	}

	// 2. Agregamos el método guardar que le faltaba al Controller
	@Transactional
	public UsuariosEntity guardar(UsuariosEntity usuario) {
		return usuariosrepository.save(usuario);
	}
}