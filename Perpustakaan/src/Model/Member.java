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
public class Member {
    private String id;
    private String nama;
    private String alamat;
    private String notelp;
    private int denda;
    
    public Member(String id, String nama, String alamat, String notelp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }    
    
    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
    public String getNotelp() {
        return notelp;
    }    

    public void setDenda(int denda) {
        this.denda = denda;
    }
    public int getDenda() {
        return denda;
    } 
    
}