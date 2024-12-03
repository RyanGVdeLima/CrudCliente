/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ryang
 */
package com.example.clienteapi.controller;

import com.example.clienteapi.dto.ClienteDTO;
import com.example.clienteapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteDTO CadastrarCliente(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.salvarCliente(clienteDTO);
    }

    @GetMapping
    public List<ClienteDTO> listarTodos() {
        return clienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public ClienteDTO buscarPorId(@PathVariable Integer id) {
        return clienteService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable Integer id) {
        clienteService.excluirCliente(id);
    }

    @GetMapping("/buscar")
    public List<ClienteDTO> buscarPorNome(@RequestParam String nome) {
        return clienteService.buscarPorNome(nome);
    }
}

