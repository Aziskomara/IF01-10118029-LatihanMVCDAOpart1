/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aziskomara.latihanmvcjdbc.event;

import edu.aziskomara.latihanmvcjdbc.entity.pelanggan;
import edu.aziskomara.latihanmvcjdbc.model.PelangganModel;

/**
 * Nama  : Azis komara
 * NIM   : 10118029
 * Kelas : IF-1
 * 
 * @author Azis Komara
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(pelanggan pelanggan);

    
    
}
