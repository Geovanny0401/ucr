package com.demo.ucr.backend.servicio;

import com.demo.ucr.backend.modelo.Cliente;
import com.demo.ucr.backend.repositorio.IClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ClienteService {

    private final IClienteRepository repository;

    public ClienteService(IClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente add(Cliente cliente) {
        return repository.save(cliente);
    }


    public Cliente update(Cliente cliente) {
        return repository.save(cliente);
    }


    public void delete(Cliente cliente) {
        repository.delete(cliente);
    }

}
