package com.example.mock_cine.controller.dto;

import com.example.mock_cine.bd.orm.ProyectoORM;

import java.time.LocalDate;

public record ProgresoDTO(String etapa, double porcentajeCompletado, LocalDate fechaActualizacion, ProyectoORM proyecto) {
}
