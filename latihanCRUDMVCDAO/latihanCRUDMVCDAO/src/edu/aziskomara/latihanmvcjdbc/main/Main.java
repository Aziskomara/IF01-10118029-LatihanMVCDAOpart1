/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aziskomara.latihanmvcjdbc.main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import edu.aziskomara.latihanmvcjdbc.database.kingsbarbershopDatabase;
import edu.aziskomara.latihanmvcjdbc.entity.pelanggan;
import edu.aziskomara.latihanmvcjdbc.error.PelangganException;
import edu.aziskomara.latihanmvcjdbc.service.PelangganDAO;
import edu.aziskomara.latihanmvcjdbc.view.MainViewPelanggan;

/**
 * Nama  : Azis komara
 * NIM   : 10118029
 * Kelas : IF-1
 * 
 * @author Azis Komara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
       SwingUtilities.invokeLater(new Runnable() {

           @Override
           public void run() {       
               try{
                   MainViewPelanggan pelanggan = new MainViewPelanggan();
                   pelanggan.loadDatabase();
                   pelanggan.setVisible(true);
               }catch(SQLException e){
               
               
               }
             catch (PelangganException ex) {
                   Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
               }
       }
        
       });    
        
        
       }  
        
        
        
    }
    

