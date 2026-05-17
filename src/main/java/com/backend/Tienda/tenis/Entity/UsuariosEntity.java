package com.backend.Tienda.tenis.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class UsuariosEntity implements Serializable {
	@Id
	/**
	 * 
	 */
	private static final long serialVersionUID = -5121024251775003506L;

	@Id
	
	@Column(name="id_usuario")
	private long idUsuarios;
	
	@Column(name="id_rol")
	private long idRol;
	
	@Column(name="email")
	private long email;
	
	@Column(name="password")
	private long password;
	
	@Column(name="fecha_registro")
	private long FechaRegistro;
	

}

