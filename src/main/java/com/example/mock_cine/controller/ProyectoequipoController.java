package com.example.mock_cine.controller;

import com.example.mock_cine.bd.jpa.EquipoProduccionJPA;
import com.example.mock_cine.bd.jpa.ProyectoJPA;
import com.example.mock_cine.bd.orm.EquipoProduccionORM;
import com.example.mock_cine.bd.orm.ProyectoORM;
import com.example.mock_cine.controller.dto.EquipoProduccionDTO;
import com.example.mock_cine.controller.dto.ProyectoDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@AllArgsConstructor
public class ProyectoequipoController {

    private ProyectoJPA proyectoJPA;
    private EquipoProduccionJPA equipoProduccionJPA;

    List<ProyectoDTO> proyectos = new ArrayList<>();

    @GetMapping(path = "/proyectos")
    public String saludar() {
        return "Hola proyectos";
    }


    @PostMapping(path = "/pp")
    public String guardadProyectos(@RequestBody ProyectoDTO proyecto) {
        proyectos.add(proyecto);
        proyectoJPA.save(new ProyectoORM(proyecto.titulo()));

        return "proyecto guardado";
    }
    @PostMapping(path = "/Proyectos")
    public String crearProyecto(@RequestBody ProyectoDTO proyectoDto) {
        ProyectoORM proyecto = new ProyectoORM(proyectoDto.titulo());

        List<EquipoProduccionORM> equiposProduccion = equipoProduccionJPA.findAllById(proyectoDto.equipoIds());
        proyecto.setEquiposProduccion(equiposProduccion);
        proyectoJPA.save(proyecto);
        return "Proyecto guardado";
    }


}
