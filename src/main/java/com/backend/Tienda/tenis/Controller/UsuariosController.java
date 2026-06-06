package com.backend.Tienda.tenis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.backend.Tienda.tenis.Entity.UsuariosEntity;
import com.backend.Tienda.tenis.Service.UsuariosService;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin("*") // Permite que React Native se conecte sin bloqueos de seguridad
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    // ==========================================
    // 1. REGISTRO DE USUARIO (POST)
    // Ruta: http://localhost:8080/api/usuarios/registrar
    // ==========================================
    @PostMapping("/registrar")
    public UsuariosEntity registrarUsuario(@RequestBody UsuariosEntity nuevoUsuario) {
        // Aquí guardamos el usuario en la BD. 
        // (Asegúrate de que tu UsuariosEntity tenga mapeada la relación con Datos_PersonalesEntity si los guardas juntos)
        return usuariosService.guardar(nuevoUsuario);
    }

    // ==========================================
    // 2. LOGIN DE USUARIO (POST)
    // Ruta: http://localhost:8080/api/usuarios/login
    // ==========================================
    @PostMapping("/login")
    public UsuariosEntity loginUsuario(@RequestBody UsuariosEntity credenciales) {
        // Obtenemos todos los usuarios (Para un entorno de producción se usaría una consulta SQL específica en el Repository)
        List<UsuariosEntity> todosLosUsuarios = usuariosService.listar();
        
        // Buscamos si existe un usuario con ese email y contraseña
        for (UsuariosEntity usuario : todosLosUsuarios) {
            // Suponiendo que tus variables en Java se llaman "email" y "password"
            if (usuario.getEmail().equals(credenciales.getEmail()) && 
                usuario.getPassword().equals(credenciales.getPassword())) {
                return usuario; // Si coincide, regresamos los datos del usuario (Login exitoso)
            }
        }
        return null; // Si no coincide, regresamos vacío (Login fallido)
    }
    
    // ==========================================A
    // 3. CONSULTAR TODOS LOS USUARIOS (GET) - Ideal para un panel de administrador
    // Ruta: http://localhost:8080/api/usuarios/todos
    // ==========================================
    @GetMapping("/todos")
    public List<UsuariosEntity> obtenerUsuarios() {
        return usuariosService.listar();
    }
}