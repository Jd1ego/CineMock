package com.example.mock_cine.bd.orm;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name = "Proyecto")
@Entity
@Data
@NoArgsConstructor

public class ProyectoORM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column (name = "guion_id")
    private String guionId;

    @Column (name = "presupuesto_id")
    private String presupuestoId;

    @Column (name = "progreso_id")
    private String progresoId;

    public ProyectoORM(String titulo, String guionId, String presupuestoId, String progresoId) {
        this.titulo = titulo;
        this.guionId = guionId;
        this.presupuestoId = presupuestoId;
        this.progresoId = progresoId;
    }
}
