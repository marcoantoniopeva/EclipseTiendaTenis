package com.backend.Tienda.tenis.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.Tienda.tenis.Entity.CategoriasEntity;
import com.backend.Tienda.tenis.Entity.Datos_PersonalesEntity;
import com.backend.Tienda.tenis.Entity.DireccionEntity;
import com.backend.Tienda.tenis.Entity.EstadoVEntity;
import com.backend.Tienda.tenis.Entity.PagoEntity;
import com.backend.Tienda.tenis.Entity.ProductoEntity;
import com.backend.Tienda.tenis.Entity.RolEntity;
import com.backend.Tienda.tenis.Entity.UsuariosEntity;
import com.backend.Tienda.tenis.Entity.VentaEntity;

import com.backend.Tienda.tenis.Service.CategoriasService;
import com.backend.Tienda.tenis.Service.Datos_PersonalesService;
import com.backend.Tienda.tenis.Service.DireccionService;
import com.backend.Tienda.tenis.Service.EstadoVService;
import com.backend.Tienda.tenis.Service.PagoService;
import com.backend.Tienda.tenis.Service.ProductoService;
import com.backend.Tienda.tenis.Service.RolService;
import com.backend.Tienda.tenis.Service.UsuariosService;
import com.backend.Tienda.tenis.Service.VentaService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ApiController { // <--- AQUÍ ESTÁ EL CAMBIO DE NOMBRE
    
    @Autowired private UsuariosService usuariosService;
    @Autowired private VentaService ventaService;
    @Autowired private RolService rolService;
    @Autowired private ProductoService productoService;
    @Autowired private PagoService pagoService;
    @Autowired private EstadoVService estadoVService;
    @Autowired private DireccionService direccionService;
    @Autowired private Datos_PersonalesService datosPersonalesService;
    @Autowired private CategoriasService categoriasService;
    
    @GetMapping("/apiDatos")
    public List<UsuariosEntity> muestra(){
        return usuariosService.listar();
    }

    @GetMapping("/venta")
    public List<VentaEntity> listarVentas() { return ventaService.listar(); }

    @GetMapping("/rol")
    public List<RolEntity> listarRoles() { return rolService.listar(); }

    @GetMapping("/producto")
    public List<ProductoEntity> listarProductos() { return productoService.listar(); }

    @GetMapping("/pago/todos")
    public List<PagoEntity> listarPagos() { return pagoService.listar(); }

    @GetMapping("/estado_v")
    public List<EstadoVEntity> listarEstadosV() { return estadoVService.listar(); }

    @GetMapping("/direccion")
    public List<DireccionEntity> listarDirecciones() { return direccionService.listar(); }

    @GetMapping("/datos_personales")
    public List<Datos_PersonalesEntity> listarDatosPersonales() { return datosPersonalesService.listar(); }

    @GetMapping("/categorias")
    public List<CategoriasEntity> listarCategorias() { return categoriasService.listar(); }
    
    @GetMapping("/datos_personales/usuario/{idUsuario}")
    public Datos_PersonalesEntity obtenerDatosPersonales(@PathVariable Integer idUsuario) {
        return datosPersonalesService.obtenerPorUsuarioId(idUsuario);
    }

    // =========================================================
    // NUEVOS ENDPOINTS PARA EL FLUJO DE PAGO Y DATOS DE ENVÍO
    // =========================================================

    // Guardar o actualizar datos personales
    @PostMapping("/datos_personales/guardar")
    public Datos_PersonalesEntity guardarDatosPersonales(@RequestBody Datos_PersonalesEntity datos) {
        return datosPersonalesService.guardar(datos);
    }

    // Guardar dirección
    @PostMapping("/direccion/guardar")
    public DireccionEntity guardarDireccion(@RequestBody DireccionEntity direccion) {
        return direccionService.guardar(direccion);
    }

    // Obtener dirección por el ID de datos personales
    @GetMapping("/direccion/datos/{idDatos}")
    public List<DireccionEntity> obtenerDireccionPorDatos(@PathVariable Integer idDatos) {
        return direccionService.obtenerPorIdDatos(idDatos);
    }
}