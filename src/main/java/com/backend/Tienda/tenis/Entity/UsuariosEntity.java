package com.backend.Tienda.tenis.Entity;

import java.io.Serializable;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuariosEntity implements Serializable {

	private static final long serialVersionUID = -5121024251775003506L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Agregué esto asumiendo que tu ID es autoincrementable en MySQL
	@Column(name="id_usuario")
	private Integer idusuario;

	@Column(name="id_rol")
	private Integer idrol;
	
	// CAMBIO: De long a String para que acepte texto
	@Column(name="email")
	private String email;
	
	// CAMBIO: De long a String para que acepte texto
	@Column(name="password")
	private String password;
	
	// CAMBIO: De long a String (o podrías usar java.util.Date)
	@Column(name = "fecha_registro")
	private LocalDateTime fechaRegistro;
	
	// ==========================================
	// GETTERS Y SETTERS (Obligatorios para Spring)
	// ==========================================
	
	public Integer getIdUsuario() {
	    return idusuario;
	}

	public void setIdUsuario(Integer idUsuario) {
	    this.idusuario = idUsuario;
	}

	public Integer getIdRol() {
	    return idrol;
	}

	public void setIdRol(Integer idRol) {
	    this.idrol = idRol;
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

	public LocalDateTime getFechaRegistro() {
	    return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
	    this.fechaRegistro = fechaRegistro;
	}
}