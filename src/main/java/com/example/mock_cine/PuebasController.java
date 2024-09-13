package com.example.mock_cine;


import com.example.mock_cine.bd.jpa.PresupuestoJPA;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@AllArgsConstructor
public class PuebasController {

    private final PresupuestoJPA presupuestoJPA;
    private PruebasJPA pruebasJPA;

    List<PruebasDTO> pruebasDTOList = new ArrayList<>();

    @GetMapping(path = "/elpepe")
    public String saludar() {
        return "Hola pepe";
    }

    @PostMapping(path = "/estudiante")
    public String guardarEstudiante(@RequestBody PruebasDTO prueba) {
        pruebasDTOList.add(prueba);
        pruebasJPA.save(new PruebasORM(prueba.nombre(), prueba.carrera()));
        return "Estudiante guardado";
    }
}
