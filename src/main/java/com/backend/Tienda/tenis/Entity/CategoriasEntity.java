package com.backend.Tienda.tenis.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class CategoriasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;
    private Integer id_producto;
    private Integer codigo_sku;
    private Integer talla;
    private String color;

    // Getters y Setters
    public Integer getId_categoria() { return id_categoria; }
    public void setId_categoria(Integer id_categoria) { this.id_categoria = id_categoria; }
    public Integer getId_producto() { return id_producto; }
    public void setId_producto(Integer id_producto) { this.id_producto = id_producto; }
    public Integer getCodigo_sku() { return codigo_sku; }
    public void setCodigo_sku(Integer codigo_sku) { this.codigo_sku = codigo_sku; }
    public Integer getTalla() { return talla; }
    public void setTalla(Integer talla) { this.talla = talla; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}