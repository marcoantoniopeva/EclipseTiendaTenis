package com.backend.Tienda.tenis.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class PagoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pago; // Basado en el campo id_pago de tu SQL
	
	private String metodo; // Basado en el campo metodo de tu SQL

	// --- Getters y Setters Manuales ---
	
	public Integer getId_pago() {
		return id_pago;
	}

	public void setId_pago(Integer id_pago) {
		this.id_pago = id_pago;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
}