package com.example.mock_cine;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.web.JsonPath;

import java.util.List;
@Table(name = "pruebas")
@Entity
@Data
@NoArgsConstructor

public class PruebasORM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;

    @Column
    private String carrera;

    public PruebasORM(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }
}
