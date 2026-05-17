package com.backend.Tienda.tenis.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    private String nombre_modelo;
    private String marca;
    private Double precio;
    private Integer stock;

    public Integer getId_producto() { return id_producto; }
    public void setId_producto(Integer id_producto) { this.id_producto = id_producto; }
    public String getNombre_modelo() { return nombre_modelo; }
    public void setNombre_modelo(String nombre_modelo) { this.nombre_modelo = nombre_modelo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }
}