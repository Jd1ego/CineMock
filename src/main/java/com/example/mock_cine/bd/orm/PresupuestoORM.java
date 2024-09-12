package com.example.mock_cine.bd.orm;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Presupuesto")
@Entity
@Data
@NoArgsConstructor

public class PresupuestoORM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "moneda")
    private String moneda;

    public PresupuestoORM(int cantidad, String moneda) {
        this.cantidad = cantidad;
        this.moneda = moneda;
    }
}
