package com.example.filtro_springboot.compras.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filtro_springboot.compras.application.ComprasRepository;
import com.example.filtro_springboot.compras.domain.entity.Compra;

@Service
public class CompraService {
    @Autowired
    private ComprasRepository compraRepository;

    public List<Compra> getCompras(){
        return compraRepository.findAll();
    }

    public Optional<Compra> getCompra(Long id){
        return compraRepository.findById(id);
    }

    public void saveOrUpdate(Compra compra){
        compraRepository.save(compra);
    }

    public void delete(Long id){
        compraRepository.deleteById(id);
    }
}