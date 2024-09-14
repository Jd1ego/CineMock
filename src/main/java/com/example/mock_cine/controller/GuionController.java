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
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor

public class GuionController {

    private GuionJPA guionJPA;

    public GuionORM crearGuion(GuionDTO guionDto, ProyectoORM proyecto) {
        return new GuionORM(
                guionDto.titulo(),
                guionDto.autor(),
                guionDto.fechaCreacion(),
                proyecto
        );
    }


   //
}
