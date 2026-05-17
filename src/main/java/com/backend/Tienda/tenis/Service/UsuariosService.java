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
	
	@Transactional
	public List<UsuariosEntity> mostrardatos (){
		return usuariosrepository.findAll();
		
	}

	
}
