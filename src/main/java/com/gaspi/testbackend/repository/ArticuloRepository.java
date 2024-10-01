package com.gaspi.testbackend.repository;

import com.gaspi.testbackend.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, String> {
}