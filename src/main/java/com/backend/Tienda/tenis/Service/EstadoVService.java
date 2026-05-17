package com.backend.Tienda.tenis.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Tienda.tenis.Entity.EstadoVEntity;
import com.backend.Tienda.tenis.Repository.EstadoV_Repository;

@Service
public class EstadoVService {
    @Autowired
    private EstadoV_Repository estadoVRepository;

    public List<EstadoVEntity> listar() {
        return (List<EstadoVEntity>) estadoVRepository.findAll();
    }
}