/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nada.pengembalian.service.repository;


import com.nada.pengembalian.service.entity.Pengembalian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nadaletika
 */
@Repository
public interface PengembalianRepository extends JpaRepository<Pengembalian, Long>{

    public Pengembalian findByPengembalianId(Long pengembalianId);
    
}