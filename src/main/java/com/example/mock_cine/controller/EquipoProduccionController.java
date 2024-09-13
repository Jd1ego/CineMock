package com.example.mock_cine.controller;

import com.example.mock_cine.bd.jpa.EquipoProduccionJPA;
import com.example.mock_cine.bd.jpa.ProyectoJPA;
import com.example.mock_cine.bd.orm.EquipoProduccionORM;
import com.example.mock_cine.bd.orm.ProyectoORM;
import com.example.mock_cine.controller.dto.EquipoProduccionDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@AllArgsConstructor
public class EquipoProduccionController {

    private EquipoProduccionJPA equipoProduccionJPA;
    private ProyectoJPA proyectoJPA;

    List<EquipoProduccionDTO> equipos = new ArrayList<>();

    @GetMapping(path = "/saludo")
    public String saludar() {
        return "Hola mundo";
    }

    @PostMapping(path = "/equipos")
    public String guardarEstudiante(@RequestBody EquipoProduccionDTO equipo) {
        equipos.add(equipo);
        equipoProduccionJPA.save(new EquipoProduccionORM(equipo.nombre(), equipo.rol(),equipo.contacto()));
        return "Equipo guardado";
    }

    @PostMapping
    public EquipoProduccionORM crearEquipoProduccion(@RequestBody EquipoProduccionDTO equipoDTO) {
        List<ProyectoORM> proyectos = proyectoJPA.findAllById(equipoDTO.proyectoIds());
        EquipoProduccionORM equipo = new EquipoProduccionORM(equipoDTO.nombre(), equipoDTO.rol(), equipoDTO.contacto(), proyectos);
        return equipoProduccionJPA.save(equipo);
    }


}
