package com.backend.Tienda.tenis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.backend.Tienda.tenis.Entity.CategoriasEntity;
import com.backend.Tienda.tenis.Service.CategoriasService;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin("*")
public class CategoriasController {

    @Autowired
    private CategoriasService categoriasService;

    // ==========================================
    // 1. OBTENER TODAS LAS CATEGORÍAS (GET)
    // Ruta: http://localhost:8080/api/categorias/todas
    // ==========================================
    @GetMapping("/todas")
    public List<CategoriasEntity> obtenerCategorias() {
        return categoriasService.listar();
    }

    // ==========================================
    // 2. AGREGAR UNA CATEGORÍA NUEVA (POST)
    // Ruta: http://localhost:8080/api/categorias/nueva
    // ==========================================
    @PostMapping("/nueva")
    public CategoriasEntity agregarCategoria(@RequestBody CategoriasEntity categoria) {
        return categoriasService.guardar(categoria);
    }
}