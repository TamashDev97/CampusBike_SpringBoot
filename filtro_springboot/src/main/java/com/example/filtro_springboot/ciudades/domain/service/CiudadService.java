package com.example.filtro_springboot.ciudades.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filtro_springboot.ciudades.application.CiudadRepository;
import com.example.filtro_springboot.ciudades.domain.entity.Ciudad;

@Service
public class CiudadService {
    @Autowired
    CiudadRepository ciudadRepository;

    public List<Ciudad> getCiudades(){
        return ciudadRepository.findAll();
    }

    public Optional<Ciudad> getCiudad(Long id){
        return ciudadRepository.findById(id);
    }

    public void saveOrUpdate(Ciudad ciudad){
        ciudadRepository.save(ciudad);
    }

    public void delete(Long id){
        ciudadRepository.deleteById(id);
    }
}