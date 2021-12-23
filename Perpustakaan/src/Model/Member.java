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

    private String id_member;
    private String email;
    private String nama;
    private String alamat;
    private String notelp;

    public Member(String id_member, String nama) {
        this.id_member = id_member;
        this.nama = nama;
    }

    public void setidMember(String id_member) {
        this.id_member = id_member;
    }
    public String getidMember() {
        return id_member;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
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

    public void setnoTelp(String notelp) {
        this.notelp = notelp;
    }
    public String getnoTelp() {
        return notelp;
    }   
}
