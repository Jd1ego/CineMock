package com.example.mock_cine.bd.jpa;

import com.example.mock_cine.bd.orm.ProyectoORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoJPA extends JpaRepository<ProyectoORM, Long> {
}
