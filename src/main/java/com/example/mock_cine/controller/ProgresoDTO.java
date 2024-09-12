package com.example.mock_cine.controller;

import java.time.LocalDate;

public record ProgresoDTO(String etapa, double porcentajeCompletado, LocalDate fechaActualizacion) {
}
