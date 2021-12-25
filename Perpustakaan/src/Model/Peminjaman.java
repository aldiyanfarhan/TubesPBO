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
public class Peminjaman extends Buku{

    private String id_member;
    private String nama;
    private String tanggal_pinjam;
    private String tanggal_kembali; 
    
    public Peminjaman(String kodeBuku, String judul, String penerbit, int harga, String status) {
        super(kodeBuku, judul, penerbit, harga, status);
    }

    public void setid_member(String id_member) {
        this.id_member = id_member;
    }
    public String getid_member() {
        return id_member;
    }    
    
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String getnama() {
        return nama;
    }    
    
    public void settanggal_pinjam(String tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }
    public String gettanggal_pinjam() {
        return tanggal_pinjam;
    }    
    
    public void settanggal_kembali(String tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }
    public String gettanggal_kembali() {
        return tanggal_kembali;
    }

    
}
