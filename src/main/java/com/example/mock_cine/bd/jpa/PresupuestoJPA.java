package com.example.mock_cine.bd.jpa;

import com.example.mock_cine.bd.orm.PresupuestoORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresupuestoJPA extends JpaRepository<PresupuestoORM, Long> {
}
