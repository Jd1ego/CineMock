package com.example.mock_cine.controller.dto;

import com.example.mock_cine.bd.orm.ProyectoORM;

import java.util.List;

public record EquipoProduccionDTO(String nombre, String rol, String contacto, List<Long> proyectoIds) {
}
