/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nada.pegawai.service.service;


import com.nada.pegawai.service.entity.Pegawai;
import com.nada.pegawai.service.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nadaletika
 */
@Service
public class PegawaiService {
    @Autowired
    private PegawaiRepository pegawaiRepository;
    
    public Pegawai savePegawai(Pegawai pegawai){
        return pegawaiRepository.save(pegawai);
    }
    
    public Pegawai findPegawaiByNip(Long pegawaiNip){
        return pegawaiRepository.findByPegawaiNip(pegawaiNip);
    }
}
