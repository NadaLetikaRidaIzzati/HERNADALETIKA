/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nada.pegawai.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author nadaletika
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pegawai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pegawaiNip;
    private String nama;
    private String alamat;
}