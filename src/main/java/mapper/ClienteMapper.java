/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ryang
 */
package com.example.clienteapi.mapper;

import com.example.clienteapi.dto.ClienteDTO;
import com.example.clienteapi.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO toDTO(Cliente cliente);

    Cliente toEntity(ClienteDTO clienteDTO);
}
