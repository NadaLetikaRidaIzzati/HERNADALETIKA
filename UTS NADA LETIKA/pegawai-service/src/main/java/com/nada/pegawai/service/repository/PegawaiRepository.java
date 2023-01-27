/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nada.pegawai.service.repository;


import com.nada.pegawai.service.entity.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nadaletika
 */
@Repository
public interface PegawaiRepository extends JpaRepository<Pegawai, Long> {

    public Pegawai findByPegawaiNip(Long pegawaiNip);
    
}
