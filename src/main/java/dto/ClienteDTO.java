/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ryang
 */
package com.example.clienteapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class ClienteDTO {
    private Integer id;
    private String nome;
    private String dataCadastro;
    private List<ContatoDTO> contatos;
}
