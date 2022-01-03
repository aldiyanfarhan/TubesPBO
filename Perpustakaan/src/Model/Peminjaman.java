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
public class Peminjaman{

    private String id_member;
    private String kodebuku;
    private String tanggal_pinjam;
    private String status; 
    
    public Peminjaman(String id_member, String kodebuku, String tanggal_pinjam) {
        this.id_member = id_member;
        this.kodebuku = kodebuku;
        this.tanggal_pinjam = tanggal_pinjam;
    }
    
    public void setid_member(String id_member) {
        this.id_member = id_member;
    }
    public String getid_member() {
        return id_member;
    }       
    
    public void setkodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }
    public String getkodebuku() {
        return kodebuku;
    }     
    
    public void setstatus(String status) {
        this.status = status;
    }
    public String getstatus() {
        return status;
    }     
    
    public void settanggal_pinjam(String tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }
    public String gettanggal_pinjam() {
        return tanggal_pinjam;
    }    

    
}
