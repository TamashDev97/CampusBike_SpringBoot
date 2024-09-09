package com.example.filtro_springboot.detalles_compras.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filtro_springboot.detalles_compras.application.DetallesCompraRepository;
import com.example.filtro_springboot.detalles_compras.domain.entity.DetallesCompra;

@Service
public class DetallesCompraService {
    @Autowired
    private DetallesCompraRepository detallesCompraRepository;

    public List<DetallesCompra> getDetallesCompras(){
        return detallesCompraRepository.findAll();
    }

    public Optional<DetallesCompra> getDetallesCompra(Long id){
        return detallesCompraRepository.findById(id);
    }

    public void saveOrUpdate(DetallesCompra detallesCompra){
        detallesCompraRepository.save(detallesCompra);
    }

    public void delete(Long id){
        detallesCompraRepository.deleteById(id);
    }
}