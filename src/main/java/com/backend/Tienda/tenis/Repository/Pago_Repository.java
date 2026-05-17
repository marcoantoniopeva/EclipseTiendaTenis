package com.backend.Tienda.tenis.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.Tienda.tenis.Entity.PagoEntity;
@Repository
public interface Pago_Repository extends JpaRepository<PagoEntity, Integer> {

}
