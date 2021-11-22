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
public class Buku {
    private String kodeBuku;
    private String judul;
    private String penerbit;
    private String status;
    private int harga;

    public Buku(String kodeBuku, String judul, String penerbit, int harga, String status) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penerbit = penerbit;
        this.status = status;
        this.harga = harga;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }
    public String getKodeBuku() {
        return kodeBuku;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getJudul() {
        return judul;
    }
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }    
    public String getPenerbit() {
        return penerbit;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }    
}
