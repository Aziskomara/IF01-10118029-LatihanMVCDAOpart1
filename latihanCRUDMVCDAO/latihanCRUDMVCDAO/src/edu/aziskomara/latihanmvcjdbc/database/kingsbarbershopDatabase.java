/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aziskomara.latihanmvcjdbc.database;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import edu.aziskomara.latihanmvcjdbc.impl.pelangganDAOIMPL;
import edu.aziskomara.latihanmvcjdbc.service.PelangganDAO;

/**
 * Nama  : Azis komara
 * NIM   : 10118029
 * Kelas : IF-1
 * 
 * @author Azis Komara
 */
public class kingsbarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDAO pelangganDao;
    
    public static Connection getConnection()  throws SQLException{
        if(connection==null){
            
            MysqlDataSource datasource = new MysqlDataSource();
            datasource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            datasource.setUser("root");
            datasource.setPassword("");
            connection = datasource.getConnection();
        }
            
        return connection;
    }
    
    public static PelangganDAO getPelangganDAO() throws SQLException{
        if(pelangganDao==null){
            pelangganDao = new pelangganDAOIMPL(getConnection());
        }
        
        return pelangganDao;
    } 
    
}
