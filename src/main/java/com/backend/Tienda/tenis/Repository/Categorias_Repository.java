package com.backend.Tienda.tenis.Repository;
import com.backend.Tienda.tenis.Entity.CategoriasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categorias_Repository extends JpaRepository<CategoriasEntity, Integer> { 
	
}