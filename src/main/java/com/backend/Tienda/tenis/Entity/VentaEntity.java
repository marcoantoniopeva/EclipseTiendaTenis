package com.backend.Tienda.tenis.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "venta")
public class VentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_venta;
    private Integer id_pago;
    private Integer id_estado_v;
    private Integer id_usuario;
    private Integer id_producto;
    private Integer cantidad;
    private Timestamp fecha_hora;
    private Double total;

    // Getters y Setters
    public Integer getId_venta() { return id_venta; }
    public void setId_venta(Integer id_venta) { this.id_venta = id_venta; }
    public Integer getId_pago() { return id_pago; }
    public void setId_pago(Integer id_pago) { this.id_pago = id_pago; }
    public Integer getId_estado_v() { return id_estado_v; }
    public void setId_estado_v(Integer id_estado_v) { this.id_estado_v = id_estado_v; }
    public Integer getId_usuario() { return id_usuario; }
    public void setId_usuario(Integer id_usuario) { this.id_usuario = id_usuario; }
    public Integer getId_producto() { return id_producto; }
    public void setId_producto(Integer id_producto) { this.id_producto = id_producto; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public Timestamp getFecha_hora() { return fecha_hora; }
    public void setFecha_hora(Timestamp fecha_hora) { this.fecha_hora = fecha_hora; }
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}