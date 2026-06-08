package com.backend.Tienda.tenis.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Tienda.tenis.Entity.VentaEntity;
import com.backend.Tienda.tenis.Repository.Venta_Repository;

@Service
public class VentaService {

    @Autowired
    private Venta_Repository ventaRepository;

    public List<VentaEntity> listar() {
        return ventaRepository.findAll();
    }

    // 🔥 Método nuevo para guardar una venta individual
    public VentaEntity guardar(VentaEntity venta) {
        return ventaRepository.save(venta);
    }
}