/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ryang
 */
package com.example.clienteapi.mapper;

import com.example.clienteapi.dto.ContatoDTO;
import com.example.clienteapi.model.Contato;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContatoMapper {
    ContatoMapper INSTANCE = Mappers.getMapper(ContatoMapper.class);

    ContatoDTO toDTO(Contato contato);

    Contato toEntity(ContatoDTO contatoDTO);
}
