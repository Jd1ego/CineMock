package com.example.mock_cine.controller.dto;

import com.example.mock_cine.bd.orm.ProyectoORM;

import java.time.LocalDate;

public record GuionDTO(String titulo, String autor, LocalDate fechaCreacion) {
}
