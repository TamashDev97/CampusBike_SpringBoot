package com.example.filtro_springboot.compras.infraestructure;

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

import com.example.filtro_springboot.compras.domain.entity.Compra;
import com.example.filtro_springboot.compras.domain.service.CompraService;

@RestController
@RequestMapping(path = "api/v1/compra")
public class ComprasController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> getAll(){
        return compraService.getCompras();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Compra compra) {
        compraService.saveOrUpdate(compra);
    }

    @DeleteMapping("/{compraId}")
    public void delete(@PathVariable("compraId") Long compraId) {
        compraService.delete(compraId);
    }
    
    @GetMapping("/{compraId}")
    public Optional<Compra> getById(@PathVariable("compraId") Long objectId) {
        return compraService.getCompra(objectId);
    }
}