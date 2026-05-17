package com.backend.Tienda.tenis.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "direccion")
public class DireccionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_direccion;
    private Integer id_datos_personales;
    private String calle;
    private Integer num_exterior;
    private Integer num_interior;
    private String colonia;
    private String municipio;
    private Integer codigo_postal;

    // Getters y Setters
    public Integer getId_direccion() { return id_direccion; }
    public void setId_direccion(Integer id_direccion) { this.id_direccion = id_direccion; }
    public Integer getId_datos_personales() { return id_datos_personales; }
    public void setId_datos_personales(Integer id_datos_personales) { this.id_datos_personales = id_datos_personales; }
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }
    public Integer getNum_exterior() { return num_exterior; }
    public void setNum_exterior(Integer num_exterior) { this.num_exterior = num_exterior; }
    public Integer getNum_interior() { return num_interior; }
    public void setNum_interior(Integer num_interior) { this.num_interior = num_interior; }
    public String getColonia() { return colonia; }
    public void setColonia(String colonia) { this.colonia = colonia; }
    public String getMunicipio() { return municipio; }
    public void setMunicipio(String municipio) { this.municipio = municipio; }
    public Integer getCodigo_postal() { return codigo_postal; }
    public void setCodigo_postal(Integer codigo_postal) { this.codigo_postal = codigo_postal; }
}