package com.example.filtro_springboot.detalles_compras.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filtro_springboot.detalles_compras.domain.entity.DetallesCompra;

@Repository
public interface DetallesCompraRepository extends JpaRepository<DetallesCompra, Long> {
}