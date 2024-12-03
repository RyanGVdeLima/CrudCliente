/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ryang
 */
package com.example.clienteapi.service;

import com.example.clienteapi.dto.ClienteDTO;
import com.example.clienteapi.mapper.ClienteMapper;
import com.example.clienteapi.model.Cliente;
import com.example.clienteapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    private final ClienteMapper clienteMapper = ClienteMapper.INSTANCE;

    public ClienteDTO CadastrarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        cliente = clienteRepository.save(cliente);
        return clienteMapper.toDTO(cliente);
    }

    public List<ClienteDTO> listarTodos() {
        return clienteRepository.findAll().stream()
                .map(clienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ClienteDTO buscarPorId(Integer id) {
        return clienteRepository.findById(id)
                .map(clienteMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public void excluirCliente(Integer id) {
        clienteRepository.deleteById(id);
    }

    public List<ClienteDTO> buscarPorNome(String nome) {
        return clienteRepository.findByNomeContainingIgnoreCase(nome).stream()
                .map(clienteMapper::toDTO)
                .collect(Collectors.toList());
    }
}
