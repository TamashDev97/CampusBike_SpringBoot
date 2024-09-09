package com.example.filtro_springboot.compras.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filtro_springboot.compras.domain.entity.Compra;

@Repository
public interface ComprasRepository extends JpaRepository<Compra, Long> {
    
}