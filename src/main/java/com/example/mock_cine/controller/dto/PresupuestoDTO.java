package com.example.mock_cine.controller.dto;

import com.example.mock_cine.bd.orm.ProyectoORM;

public record PresupuestoDTO(int cantidad, String moneda, ProyectoORM proyecto) {
}
