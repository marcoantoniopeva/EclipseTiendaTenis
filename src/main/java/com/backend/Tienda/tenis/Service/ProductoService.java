package com.backend.Tienda.tenis.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Tienda.tenis.Entity.ProductoEntity;
import com.backend.Tienda.tenis.Repository.Producto_Repository;

@Service
public class ProductoService {

    @Autowired
    private Producto_Repository productoRepository;

    public List<ProductoEntity> listar() {
        return (List<ProductoEntity>) productoRepository.findAll();
    }
}