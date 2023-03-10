/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaidan.gaji.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author HP ELITE BOOK G2
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pegawai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pegawaiId;
    private String nip;
    private String nama;
    private String alamat;
}