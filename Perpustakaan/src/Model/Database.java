/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Aldiyan Farhan N
 */
public class Database {
    private Statement stmt;
    private ResultSet rs;
    private Connection conn;
    private ArrayList<Member> member = new ArrayList<>();
    private ArrayList<Buku> buku = new ArrayList<>();
   
    
    public Database(){
        loadBuku();
    }
    
    public void connect(){
        String url = "jdbc:mysql://localhost/perpustakaan";
        String user = "root";
        String pass = "";
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        int row;
        try {
            row = stmt.executeUpdate(query);
            if (row > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadBuku(){
        connect();
        String query = "SELECT * FROM buku";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()){
                buku.add(new Buku(rs.getString("kodeBuku"), 
                        rs.getString("Judul"), rs.getString("Penerbit"), 
                        rs.getInt("Harga"), rs.getString("Status")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    


    public ArrayList<Buku> getBuku() {
        buku.clear();
        loadBuku();
        return buku;
    }
    
    public void addBuku(Buku b){
        connect();
        String query = "INSERT INTO buku(Judul,Penerbit,Harga,Status) VALUES (";
//        query += "'" + b.getKodeBuku() + "',";
        query += "'" + b.getJudul()+ "',";
        query += "'" + b.getPenerbit() + "',";
        query += "'" + b.getHarga() + "',";
        query += "'" + b.getStatus() + "')";
        
        if (manipulate(query)) buku.add(b);
        disconnect();
    }
    
    public boolean cekDuplikatKodeBuku(String kodeBuku){
        boolean cek = false;
        for (Buku b : buku) {
            if (b.getKodeBuku().equals(kodeBuku)) {
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public void delBuku(String kode){
        connect();
        String query = "DELETE FROM buku WHERE kodeBuku='"+ kode+"';";
        if (manipulate(query)) {
            for (Buku b : buku) {
                if (b.getKodeBuku().equals(kode)) {
                    buku.remove(b);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void updateBuku(Buku b){
        connect();
        String query = "UPDATE buku SET";
        query += " kodeBuku='" + b.getKodeBuku() + "',";
        query += " Judul='" + b.getJudul() + "',";
        query += " Penerbit='" + b.getPenerbit() + "',";
        query += "Status='Available'";
        query += " WHERE kodeBuku='" + b.getKodeBuku() + "';";
        if (manipulate(query)) {
            for (Buku buku1 : buku) {
                if (buku1.getKodeBuku().equals(b.getKodeBuku())) {
                    buku1.setKodeBuku(b.getKodeBuku());
                    buku1.setJudul(b.getJudul());
                    buku1.setPenerbit(b.getPenerbit());
                    buku1.setHarga(b.getHarga());
                    buku1.setStatus(b.getStatus());   
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void pinjamBuku(String kode){
        connect();
        String query = "UPDATE buku SET Status='Unavailable' WHERE kodeBuku='"+ kode +"';";
        if (manipulate(query)) {
            for (Buku buku1 : buku) {
                if (buku1.getKodeBuku().equals(kode)) {
                    buku1.setStatus("Unavailable");
                }
            }
        }
        disconnect();
    }
    
    public void bukuKembali(String kode){
        connect();
        String query = "UPDATE buku SET Status='Available' WHERE kodeBuku='"+ kode +"';";
        if (manipulate(query)) {
            for (Buku buku1 : buku) {
                if (buku1.getKodeBuku().equals(kode)) {
                    buku1.setStatus("Available");
                    break;
                }
            }
        }
        disconnect();
    }
    
//                                      MEMBER SECTION
    
    public ArrayList<Member> getMember() {
        member.clear();
        loadMember();
        return member;
    }
    
    public void loadMember(){
        connect();
        String query = "SELECT id_member,nama FROM member";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()){
                member.add(new Member(rs.getString("id_member"),rs.getString("nama")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
        

}
