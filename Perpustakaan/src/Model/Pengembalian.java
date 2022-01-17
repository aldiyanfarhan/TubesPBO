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
public class Pengembalian {
    private String id_member;
    private String kodebuku;
    private String tanggal_kembali;
    private String status; 
    
    public Pengembalian(String kodebuku, String id_member, String tanggal_kembali) {
        this.id_member = id_member;
        this.kodebuku = kodebuku;
        this.tanggal_kembali = tanggal_kembali;
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
    
    public void settanggal_kembali(String tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }
    public String gettanggal_kembali() {
        return tanggal_kembali;
    }   
}
