/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Perpustakaan;
import Model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aldiyan Farhan N
 */
public class ControllerPerpustakaan extends MouseAdapter implements ActionListener {
    private Perpustakaan view;
    private Database db;

    public ControllerPerpustakaan() {
        view = new Perpustakaan();
        db = new Database();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        loadTable();
    }
    
    public void loadTable(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Kode Buku", "Judul", "Penerbit", "Harga", "Status"}, 0);
        ArrayList<Buku> buku = db.getBuku();
        for (Buku b : buku) {
            model.addRow(new Object[]{b.getKodeBuku(), b.getJudul(), b.getPenerbit(), b.getHarga(), b.getStatus()});
        }
        view.setTbBuku(model);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnTambah())) {
            btnTambahActionPerformed();
            loadTable();
        }else if (source.equals(view.getBtnDelete())) {
            btnHapusActionPerformed();
            loadTable();
        }else if (source.equals(view.getBtnReset())) {
            view.Reset();
            loadTable();
        }else if (source.equals(view.getBtnUpdate())) {
            btnUbahActionPerformed();
            loadTable();
        }else if (source.equals(view.getBtnCariBuku())){
            btnCariActionPerformed();
        }
        else if (source.equals(view.getBtnRefresh())){
            loadTable();
        } 
    }
    
 
    
    public void btnTambahActionPerformed(){
        String kodeBuku = view.getjKodeBuku();
        String Judul = view.getjJudul();
        String Penerbit = view.getjPenerbit();
        String Harga = view.getjHarga();
        String status = "Available";
//        kodeBuku.isEmpty() || 
        if (Judul.isEmpty() || Penerbit.isEmpty() || Harga.isEmpty() || status.isEmpty()){
            view.showMessage("Data Kosong", "Error", 0);
        }else{
            if (db.cekDuplikatKodeBuku(kodeBuku)){
                view.showMessage("Buku Sudah Ada", "Error", 0);
            }else{
                db.addBuku(new Buku(kodeBuku,Judul,Penerbit,Integer.parseInt(Harga),status));
                view.Reset();
                view.showMessage("Data Berhasil Ditambah", "Success", 1);
            }
        }
    }
    
    public void btnHapusActionPerformed(){
        String kodeBuku = view.getjKodeBuku();
        db.delBuku(kodeBuku);
        view.Reset();
        view.showMessage("Data Berhasil Dihapus", "Success", 1);
    }
    
    public void btnUbahActionPerformed(){
        String kodeBuku = view.getjKodeBuku();
        String Judul = view.getjJudul();
        String Penerbit = view.getjPenerbit();
        String harga = view.getjHarga();
        String status = "Available";
        if (kodeBuku.isEmpty() || Judul.isEmpty() || Penerbit.isEmpty() || harga.isEmpty() || status.isEmpty()){
            view.showMessage("Data Kosong", "Error", 0);
        }else{
            if (!db.cekDuplikatKodeBuku(kodeBuku)){
                view.showMessage("Buku Tidak Ditemukan", "Error", 0);
            }else{
                db.updateBuku(new Buku(kodeBuku,Judul,Penerbit, Integer.parseInt(harga),status));
                view.Reset();
                view.showMessage("Data Berhasil Diubah", "Success", 1);
            }
        }
    }
    
    public void btnCariActionPerformed(){
        String cari = view.getjDaftarkodebuku();
        DefaultTableModel model = new DefaultTableModel(new String[]{"Kode Buku", "Judul", "Penerbit", "Harga", "Status"}, 0);
        ArrayList<Buku> buku = db.getBuku();
            for (Buku b : buku) {
                if (b.getKodeBuku().contains(cari) || b.getJudul().contains(cari) || b.getPenerbit().contains(cari) || b.getStatus().contains(cari)){
                    model.addRow(new Object[]{b.getKodeBuku(), b.getJudul(), b.getPenerbit(), b.getHarga(), b.getStatus()});
                }
            }
        view.setTbBuku(model);
    }    
    

    
//    public void btnCariActionPerformed(){
//        String cari = view.getjDaftarkodebuku();
//        int index = view.getCategory();
//        DefaultTableModel model = new DefaultTableModel(new String[]{"Kode Buku", "Judul", "Penerbit", "Harga", "Status"}, 0);
//        ArrayList<Buku> buku = db.getBuku();
//        if(index == 0){
//            for (Buku b : buku) {
//                if (b.getKodeBuku().contains(cari) || b.getJudul().contains(cari) || b.getPenerbit().contains(cari) 
//                    || b.getStatus().contains(cari)){
//                    model.addRow(new Object[]{b.getKodeBuku(), b.getJudul(), b.getPenerbit(), b.getHarga(), b.getStatus()});
//                }
//            }
//        }else if(index == 1){
//            for (Buku b : buku) {
//                if (b.getKodeBuku().contains(cari)){
//                    model.addRow(new Object[]{b.getKodeBuku(), b.getJudul(), b.getPenerbit(), b.getHarga(), b.getStatus()});
//                }
//            }
//        }else if(index == 2){
//            for (Buku b : buku) {
//                if (b.getJudul().contains(cari)){
//                    model.addRow(new Object[]{b.getKodeBuku(), b.getJudul(), b.getPenerbit(), b.getHarga(), b.getStatus()});
//                }
//            }
//        }else if(index == 3){
//            for (Buku b : buku) {
//                if (b.getPenerbit().contains(cari)){
//                    model.addRow(new Object[]{b.getKodeBuku(), b.getJudul(), b.getPenerbit(), b.getHarga(), b.getStatus()});
//                }
//            }
//        }
//        view.setTbBuku(model);
//    }
    

    
    @Override
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getJtbBuku())){
            int i = view.getSelectedBuku();
            String kode = view.getJtbBuku().getModel().getValueAt(i, 0).toString();
            String judul = view.getJtbBuku().getModel().getValueAt(i, 1).toString();
            String penerbit = view.getJtbBuku().getModel().getValueAt(i, 2).toString();
            String Harga = view.getJtbBuku().getModel().getValueAt(i, 3).toString();
            
            view.setjKodeBuku(kode);
            view.setjJudul(judul);
            view.setjPenerbit(penerbit);
            view.setjHarga(Harga);
        }
    }
    
}
