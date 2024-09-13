package com.example.mock_cine;

import com.example.mock_cine.bd.orm.GuionORM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PruebasJPA extends JpaRepository<PruebasORM, Long>{
}
