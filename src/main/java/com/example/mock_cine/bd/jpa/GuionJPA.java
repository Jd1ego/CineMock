package com.example.mock_cine.bd.jpa;

import com.example.mock_cine.bd.orm.GuionORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuionJPA extends JpaRepository<GuionORM, Long> {
}
