package com.backend.Tienda.tenis.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Tienda.tenis.Entity.DireccionEntity;
import com.backend.Tienda.tenis.Repository.Direccion_Repository;

@Service
public class DireccionService {
    @Autowired
    private Direccion_Repository direccionRepository;

    public List<DireccionEntity> listar() {
        return direccionRepository.findAll();
    }

    // NUEVO: Guardar dirección
    public DireccionEntity guardar(DireccionEntity direccion) {
        return direccionRepository.save(direccion);
    }

    // NUEVO: Obtener dirección por id_datos_personales
    public List<DireccionEntity> obtenerPorIdDatos(Integer idDatos) {
        return direccionRepository.findByIdDatosPersonales(idDatos);
    }
}