package com.backend.Tienda.tenis.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Tienda.tenis.Entity.Datos_PersonalesEntity;
import com.backend.Tienda.tenis.Repository.Datos_Personales_Repository;

@Service
public class Datos_PersonalesService {
    @Autowired
    private Datos_Personales_Repository repository;

    public List<Datos_PersonalesEntity> listar() {
        return (List<Datos_PersonalesEntity>) repository.findAll();
    }
}