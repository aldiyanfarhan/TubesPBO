/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Member;
import View.Perpustakaan;
import View.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Aldiyan Farhan N
 */
public class ControllerRegister extends MouseAdapter implements ActionListener{

    private Register view;
    private Database db;
    
    public ControllerRegister() {
        view = new Register();
        db = new Database();
        view.setVisible(true);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getJrRegister())) {
            JrRegisterPerformed();
        }
    }
    

    public void JrRegisterPerformed() {
        String id_member = view.getJrIdMember();
        String nama = view.getJrNama();
        String email = view.getJrEmail();
        String alamat = view.getJrAlamat();
        String notelp = view.getJrNotelp();
        if (nama.isEmpty() || email.isEmpty() || alamat.isEmpty() || notelp.isEmpty()){
            view.showMessage("Data Kosong", "Error", 0);
        } else {
            if (db.cekDuplikatEmailMember(email)){
                view.showMessage("Member Sudah Ada", "Error", 0);
            }else{
                db.addMember(new Member (id_member, nama, email, alamat, notelp));
                view.Reset();
                view.showMessage("Data Berhasil Ditambah", "Success", 1);
            }
        }
    }
}
