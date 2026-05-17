package com.backend.Tienda.tenis.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "estado_v")
public class EstadoVEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estado_v;
    private String estado;

    public Integer getId_estado_v() { return id_estado_v; }
    public void setId_estado_v(Integer id_estado_v) { this.id_estado_v = id_estado_v; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}