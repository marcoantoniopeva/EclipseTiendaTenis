package com.backend.Tienda.tenis.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Tienda.tenis.Entity.RolEntity;
import com.backend.Tienda.tenis.Repository.Rol_Repository;

@Service
public class RolService {
    @Autowired
    private Rol_Repository rolRepository;

    public List<RolEntity> listar() {
        return (List<RolEntity>) rolRepository.findAll();
    }
}