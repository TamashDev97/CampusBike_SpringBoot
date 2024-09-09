package com.example.filtro_springboot.bicicletas.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filtro_springboot.bicicletas.application.BicicletaRepository;
import com.example.filtro_springboot.bicicletas.domain.entity.Bicicleta;

@Service
public class BicicletaService {
    @Autowired
    BicicletaRepository bicicletaRepositoy;

    public List<Bicicleta> getBicicletas(){
        return bicicletaRepositoy.findAll();
    }

    public Optional<Bicicleta> getBicicletas(Long id){
        return bicicletaRepositoy.findById(id);
    }

    public void saveOrUpdate(Bicicleta bicicleta){
        bicicletaRepositoy.save(bicicleta);
    }

    public void delete(Long id){
        bicicletaRepositoy.deleteById(id);
    }
}
