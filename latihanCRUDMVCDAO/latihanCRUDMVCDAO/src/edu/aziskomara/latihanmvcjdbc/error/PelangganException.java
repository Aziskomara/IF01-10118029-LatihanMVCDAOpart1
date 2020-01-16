/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aziskomara.latihanmvcjdbc.error;

/**
 * Nama  : Azis komara
 * NIM   : 10118029
 * Kelas : IF-1
 * 
 * @author Azis Komara
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganException</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
