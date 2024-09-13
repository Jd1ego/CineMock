package com.example.mock_cine.bd.jpa;

import com.example.mock_cine.bd.orm.EquipoProduccionORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoProduccionJPA extends JpaRepository<EquipoProduccionORM, Long> {
}
