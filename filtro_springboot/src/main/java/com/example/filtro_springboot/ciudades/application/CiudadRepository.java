package com.example.filtro_springboot.ciudades.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filtro_springboot.ciudades.domain.entity.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
}