/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aziskomara.latihanmvcjdbc.service;

import java.util.List;
import edu.aziskomara.latihanmvcjdbc.entity.pelanggan;
import edu.aziskomara.latihanmvcjdbc.error.PelangganException;

/**
 * Nama  : Azis komara
 * NIM   : 10118029
 * Kelas : IF-1
 * 
 * @author Azis Komara
 */
public interface PelangganDAO {
    
    public void insertPelanggan(pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan(pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer id) throws PelangganException;
    public pelanggan getPelanggan(Integer id) throws PelangganException;
    public pelanggan getPelanggan(String email) throws PelangganException;
    public List<pelanggan> selectAllPelanggan() throws PelangganException;
    
}
