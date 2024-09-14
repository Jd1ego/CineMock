package com.example.mock_cine.controller;

import com.example.mock_cine.bd.jpa.EquipoProduccionJPA;
import com.example.mock_cine.bd.jpa.GuionJPA;
import com.example.mock_cine.bd.jpa.ProyectoJPA;
import com.example.mock_cine.bd.orm.EquipoProduccionORM;
import com.example.mock_cine.bd.orm.GuionORM;
import com.example.mock_cine.bd.orm.ProyectoORM;
import com.example.mock_cine.controller.dto.GuionDTO;
import com.example.mock_cine.controller.dto.ProyectoDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@RestController
@AllArgsConstructor

public class ProyectoController {

    private ProyectoJPA proyectoJPA;
    private EquipoProduccionJPA equipoProduccionJPA;
    private GuionController guionController;


    List<ProyectoDTO> proyectos = new ArrayList<>();



 //Guarda en la base de datos Un proyecto sencillo
    @PostMapping(path = "/ProyectoSimple")
    public String guardadProyectos(@RequestBody ProyectoDTO proyecto) {
        proyectos.add(proyecto);
        proyectoJPA.save(new ProyectoORM(proyecto.titulo()));

        return "proyecto guardado";
    }

    //Guarda en la base de datos un proyecto y lo relaciona con uno o mas equipos de produccion
    @PostMapping(path = "/Proyectos")
    public String crearProyecto(@RequestBody ProyectoDTO proyectoDto) {
        // Crear el proyecto
        ProyectoORM proyecto = new ProyectoORM(proyectoDto.titulo());

        // Asignar los equipos de producción
        List<EquipoProduccionORM> equiposProduccion = equipoProduccionJPA.findAllById(proyectoDto.equipoIds());
        proyecto.setEquiposProduccion(equiposProduccion);



        // Verificar si hay un guion proporcionado
        if (proyectoDto.guionDTO() != null) {

            GuionDTO guionDto = proyectoDto.guionDTO();
            GuionORM guion = guionController.crearGuion(guionDto, proyecto);

            proyecto.setGuion(guion);
        }

        // Guardar el proyecto y el guion (cascade se encargará del guion)
        proyectoJPA.save(proyecto);

        return "Proyecto guardado";
    }




}
