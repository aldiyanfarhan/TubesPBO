/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aldiyan Farhan N
 */
public class Denda extends Peminjaman{
    private int denda;

    public Denda(String kodeBuku, String judul, String penerbit, int harga, String status) {
        super(kodeBuku, judul, penerbit, harga, status);
    }
    
    public void setDenda(int denda) {
        this.denda = denda;
    }
    public int getDenda() {
        return denda;
    } 
    
    
}
