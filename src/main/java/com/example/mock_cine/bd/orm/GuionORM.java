package com.example.mock_cine.bd.orm;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "Guion")
@Entity
@Data
@NoArgsConstructor

public class GuionORM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "fechaCreacion")
    private LocalDate fechaCreacion;

    public GuionORM(String titulo, String autor, LocalDate fechaCreacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
    }
}
