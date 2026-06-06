package com.backend.Tienda.tenis.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class UsuariosEntity implements Serializable {

	private static final long serialVersionUID = -5121024251775003506L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Agregué esto asumiendo que tu ID es autoincrementable en MySQL
	@Column(name="id_usuario")
	private long idUsuarios;
	
	@Column(name="id_rol")
	private long idRol;
	
	// CAMBIO: De long a String para que acepte texto
	@Column(name="email")
	private String email;
	
	// CAMBIO: De long a String para que acepte texto
	@Column(name="password")
	private String password;
	
	// CAMBIO: De long a String (o podrías usar java.util.Date)
	@Column(name="fecha_registro")
	private String fechaRegistro;
	
	
	// ==========================================
	// GETTERS Y SETTERS (Obligatorios para Spring)
	// ==========================================
	
	public long getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(long idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public long getIdRol() {
		return idRol;
	}

	public void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}