package com.example.mock_cine.bd.orm;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.web.JsonPath;

import java.util.List;

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

    @OneToOne(mappedBy = "proyecto")
    private GuionORM guion;

    @OneToOne(mappedBy = "proyecto")
    private ProgresoORM progreso;

    @OneToOne(mappedBy = "proyecto")
    private PresupuestoORM presupuesto;

    @ManyToMany
    @JoinTable(name = "proyecto_equipo",
            joinColumns = @JoinColumn(name = "proyecto_id"),
            inverseJoinColumns = @JoinColumn(name = "equipo_id"))
    private List<EquipoProduccionORM> equiposProduccion;

    public ProyectoORM(String titulo, GuionORM guion, ProgresoORM progreso, PresupuestoORM presupuesto, List<EquipoProduccionORM> equiposProduccion) {
        this.titulo = titulo;
        this.guion = guion;
        this.progreso = progreso;
        this.presupuesto = presupuesto;
        this.equiposProduccion = equiposProduccion;
    }

    public ProyectoORM(String titulo) {
        this.titulo = titulo;
    }
}
