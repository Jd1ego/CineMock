package com.example.mock_cine.bd.orm;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "proyecto_equipo")
@Entity
@Data
@NoArgsConstructor
public class ProyectoEquipo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "proyecto_id")
    private Long proyectoId;

    @Column (name = "equipo_id")
    private Long equipoId;

    public ProyectoEquipo(Long proyectoId, Long equipoId) {
        this.proyectoId = proyectoId;
        this.equipoId = equipoId;
    }
}
