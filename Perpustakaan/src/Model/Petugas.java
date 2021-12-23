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
public class Petugas {
    private int id;
    private String email;
    private String nama;
    private String alamat;
    private String notelp;
    
    public Petugas(String email, String nama, String alamat, String notelp) {
        this.email = email;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    
        public void setEmail(String id) {
        this.email = email;
    }
    public String getEmailPetugas() {
        return email;
    }
    
    public void getNamaPetugas(String nama) {
        this.nama = nama;
    }
    public String getPetugas() {
        return nama;
    }
    
    public void setAlamatPetugas(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamatPetugas() {
        return alamat;
    }    
    
    public void setNotelpPetugas(String notelp) {
        this.notelp = notelp;
    }
    public String getNotelpPetugas() {
        return notelp;
    }    
}
