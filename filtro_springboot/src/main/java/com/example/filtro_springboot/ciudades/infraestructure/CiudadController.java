package com.example.filtro_springboot.ciudades.infraestructure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.filtro_springboot.ciudades.domain.entity.Ciudad;
import com.example.filtro_springboot.ciudades.domain.service.CiudadService;

@RestController
@RequestMapping(path = "api/v1/ciudad")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public List<Ciudad> getAll(){
        return ciudadService.getCiudades();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Ciudad ciudad) {
        ciudadService.saveOrUpdate(ciudad);
    }

    @DeleteMapping("/{ciudadId}")
    public void delete(@PathVariable("ciudadId") Long ciudadId) {
        ciudadService.delete(ciudadId);
    }
    
    @GetMapping("/{ciudadId}")
    public Optional<Ciudad> getById(@PathVariable("ciudadId") Long objectId) {
        return ciudadService.getCiudad(objectId);
    }
}