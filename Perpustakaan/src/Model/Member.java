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
    
    
    public Member(String id, String nama, String alamat, String notelp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getIdMember() {
        return id;
    }
    
    public void getNamaMember(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    
    public void setAlamatMember(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamatMember() {
        return alamat;
    }    
    
    public void setNotelpMember(String notelp) {
        this.notelp = notelp;
    }
    public String getNotelpMember() {
        return notelp;
    }    

    public Object getNamaMember() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}