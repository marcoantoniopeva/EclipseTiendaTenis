package com.backend.Tienda.tenis.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carrito")
public class CarritoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_carrito;
    private Integer id_usuario;
    private Integer id_producto;
    private Integer cantidad;

    // Getters y Setters
    public Integer getId_carrito() { return id_carrito; }
    public void setId_carrito(Integer id_carrito) { this.id_carrito = id_carrito; }
    public Integer getId_usuario() { return id_usuario; }
    public void setId_usuario(Integer id_usuario) { this.id_usuario = id_usuario; }
    public Integer getId_producto() { return id_producto; }
    public void setId_producto(Integer id_producto) { this.id_producto = id_producto; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
}