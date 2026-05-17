package com.backend.Tienda.tenis.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/agregar")
public class GuardarController {

    @PostMapping("/usuarios")
    public <Entity> ResponseEntity<Entity> Guardar(@RequestBody Entity usuarios) {
        return new ResponseEntity<>(usuarios, org.springframework.http.HttpStatus.OK);
    }
}