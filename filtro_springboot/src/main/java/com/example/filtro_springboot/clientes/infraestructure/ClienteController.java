package com.example.filtro_springboot.clientes.infraestructure;

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

import com.example.filtro_springboot.clientes.domain.entity.Cliente;
import com.example.filtro_springboot.clientes.domain.service.ClienteService;

@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAll(){
        return clienteService.getClientes();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Cliente cliente) {
        clienteService.saveOrUpdate(cliente);
    }

    @DeleteMapping("/{clienteId}")
    public void delete(@PathVariable("clienteId") Long clienteId) {
        clienteService.delete(clienteId);
    }
    
    @GetMapping("/{clienteId}")
    public Optional<Cliente> getById(@PathVariable("clienteId") Long objectId) {
        return clienteService.getCliente(objectId);
    }
}