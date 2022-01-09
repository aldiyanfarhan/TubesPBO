/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MemberSection;
import Model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aldiyan Farhan N
 */
public class ControllerMemberSection extends MouseAdapter implements ActionListener {
    private MemberSection view;
    private Database db;

    public ControllerMemberSection() {
        view = new MemberSection();
        db = new Database();
        view.addActionListener(this);
        loadTableMember();
        view.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnCariMember())){
            btnCariMemberActionPerformed();
        }
    }
    

    public void btnPinjamActionPerformed(){
        String kode = view.getjPkodeBuku();
        String id = view.getPidmember();
        String tanggal = view.getpTanggalPinjam();
        if (kode.isEmpty()) {
            view.showMessage("Data Kosong", "Error", 0);
        }else{
            db.pinjamBuku(kode);
            db.addPinjamBuku(new Peminjaman(kode,id,tanggal));
            view.showMessage("Status Buku berhasil diubah", "Success", 1);
        }
    }   
    
    public void btnStatusActionPerformed(){
        String kode = view.getjKkodebuku();
        String id = view.getKidmember();
        String tanggal = view.getpTanggalKembali();
        if (kode.isEmpty()) {
            view.showMessage("Data kosong", "error", 0);
        }else {
            db.bukuKembali(kode);
            db.updatepinjamBuku(kode,id,tanggal);
            view.showMessage("Data berhasil diubah", "success", 1);
        }
    }
    
    
        public void loadTableMember(){
        DefaultTableModel modelm = new DefaultTableModel(new String[]{"ID Member", "Nama"}, 0);
        ArrayList<Member> member = db.getMember();
        for (Member m : member) {
            modelm.addRow(new Object[]{m.getidMember(), m.getNama()});
        }
        view.setTbMember(modelm);
    }
        
    public void btnCariMemberActionPerformed(){
        String cari = view.getjDaftarIdMember();
        DefaultTableModel modelm = new DefaultTableModel(new String[]{"ID Member", "Nama"}, 0);
        ArrayList<Member> member = db.getMember();
            for (Member m : member) {
                if (m.getidMember().contains(cari) || m.getNama().contains(cari)){
                    modelm.addRow(new Object[]{m.getidMember(), m.getNama()});
                }
            }
        view.setTbMember(modelm);
    }    
}
