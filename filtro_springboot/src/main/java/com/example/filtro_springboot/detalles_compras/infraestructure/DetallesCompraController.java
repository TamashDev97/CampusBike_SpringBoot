package com.example.filtro_springboot.detalles_compras.infraestructure;

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

import com.example.filtro_springboot.detalles_compras.domain.entity.DetallesCompra;
import com.example.filtro_springboot.detalles_compras.domain.service.DetallesCompraService;

@RestController
@RequestMapping(path = "api/v1/detalles-compra")
public class DetallesCompraController {

    @Autowired
    private DetallesCompraService detallesCompraService;

    @GetMapping
    public List<DetallesCompra> getAll(){
        return detallesCompraService.getDetallesCompras();
    }

    @PostMapping
    public void saveUpdate(@RequestBody DetallesCompra detallesCompra) {
        detallesCompraService.saveOrUpdate(detallesCompra);
    }

    @DeleteMapping("/{detallesCompraId}")
    public void delete(@PathVariable("detallesCompraId") Long detallesCompraId) {
        detallesCompraService.delete(detallesCompraId);
    }
    
    @GetMapping("/{detallesCompraId}")
    public Optional<DetallesCompra> getById(@PathVariable("detallesCompraId") Long objectId) {
        return detallesCompraService.getDetallesCompra(objectId);
    }
}