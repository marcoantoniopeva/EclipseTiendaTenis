package com.backend.Tienda.tenis.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "datos_personales")
public class Datos_PersonalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_datos_personales;
    
    private Integer id_usuario;
    private String nombres;
    private String apell_paterno;
    private String apell_materno;
    private Long telefono_celular;

    // --- Getters y Setters Manuales ---

    public Integer getId_datos_personales() {
        return id_datos_personales;
    }

    public void setId_datos_personales(Integer id_datos_personales) {
        this.id_datos_personales = id_datos_personales;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApell_paterno() {
        return apell_paterno;
    }

    public void setApell_paterno(String apell_paterno) {
        this.apell_paterno = apell_paterno;
    }

    public String getApell_materno() {
        return apell_materno;
    }

    public void setApell_materno(String apell_materno) {
        this.apell_materno = apell_materno;
    }

    public Long getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(Long telefono_celular) {
        this.telefono_celular = telefono_celular;
    }
}