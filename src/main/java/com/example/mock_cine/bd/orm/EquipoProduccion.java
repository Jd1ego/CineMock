package com.example.mock_cine.bd.orm;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name = "EquipoProduccion")
@Entity
@Data
@NoArgsConstructor

public class EquipoProduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "rol")
    private String rol;

    @Column(name = "contacto")
    private String contacto;

    public EquipoProduccion(String nombre, String rol, String contacto) {
        this.nombre = nombre;
        this.rol = rol;
        this.contacto = contacto;
    }
}
