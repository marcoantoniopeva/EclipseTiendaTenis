package com.backend.Tienda.tenis.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Tienda.tenis.Entity.PagoEntity;
import com.backend.Tienda.tenis.Repository.Pago_Repository;

@Service
public class PagoService {

    @Autowired
    private Pago_Repository pagoRepository;

    public List<PagoEntity> listar() {
        return (List<PagoEntity>) pagoRepository.findAll();
    }
}