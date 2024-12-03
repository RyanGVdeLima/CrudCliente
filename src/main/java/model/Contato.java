/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ryang
 */
package com.example.clienteapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipo;

    private String texto;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
