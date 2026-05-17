package com.backend.Tienda.tenis.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.Tienda.tenis.Entity.CategoriasEntity;
import com.backend.Tienda.tenis.Repository.Categorias_Repository;

@Service
public class CategoriasService {
    @Autowired
    private Categorias_Repository categoriasRepository;

    public List<CategoriasEntity> listar() {
        return categoriasRepository.findAll();
    }
}