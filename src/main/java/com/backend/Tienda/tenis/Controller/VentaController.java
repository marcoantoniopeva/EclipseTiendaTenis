package com.backend.Tienda.tenis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import com.backend.Tienda.tenis.Entity.VentaEntity;
import com.backend.Tienda.tenis.Service.ProductoService;
import com.backend.Tienda.tenis.Service.VentaService;

@RestController
@RequestMapping("/api/ventas")
@CrossOrigin("*")
public class VentaController {

    @Autowired
    private VentaService ventaService;
    @Autowired
    private ProductoService productoService;

    @PostMapping("/nueva")
    public String registrarVenta(@RequestBody Map<String, Object> payload) {
        try {
            // 1. Extraer datos comunes
            Integer idUsuario = (Integer) payload.get("id_usuario");
            Integer idPago = (Integer) payload.get("id_pago");
            Integer idEstadoV = (Integer) payload.get("id_estado_v");
            Double totalGeneral = Double.parseDouble(payload.get("total").toString());
            
            // 2. Obtener lista de productos
            List<Map<String, Object>> productos = (List<Map<String, Object>>) payload.get("productos");
            
            // 3. Crear una venta por cada producto
            for (Map<String, Object> prod : productos) {
                VentaEntity venta = new VentaEntity();
                venta.setId_usuario(idUsuario);
                venta.setId_pago(idPago);
                venta.setId_estado_v(idEstadoV);
                venta.setId_producto((Integer) prod.get("id_producto"));
                venta.setCantidad((Integer) prod.get("cantidad"));
                venta.setTotal(totalGeneral); // o podrías calcular subtotal * cantidad
                venta.setFecha_hora(new Timestamp(System.currentTimeMillis()));
                ventaService.guardar(venta);
                productoService.restarStock(venta.getId_producto(), venta.getCantidad());
            }
            return "Venta registrada exitosamente";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al registrar la venta: " + e.getMessage();
        }
    }
}