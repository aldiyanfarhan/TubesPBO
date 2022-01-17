/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Perpustakaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Guntur
 */
public class ControllerLogin {
    private Database db;
    private final Petugas model;
    private final Login view;
    
    public ControllerLogin(Petugas m, Login v) {
        db = new Database();
        view.setVisible(true);
        model = m;
        view = v;
        initView();
    }
    
    public void initController() {
        view.addButtonListener(new ButtonListener());
    }
    
    public class ButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            switch (e.getActionCommand()) {
                case "Login":
                    BtnLoginActionPerformed();
                    break;

            }
        }
    }
    
    public void initView() {
        view.setVisible(true);
        view.getjUsernameAdmin().setText(model.getUsername());
        view.getjPasswordAdmin().setText(model.getPassword());
    }
    
    public void BtnLoginActionPerformed() {
        model.setUsername(view.getjUsernameAdmin().getText());
        model.setPassword(view.getjPasswordAdmin().getText());
       
        String username = model.getUsername();
        String password = model.getPassword();
        
        if (username.equalsIgnoreCase(username.getText()) && password.equalsIgnoreCase(password.getText())) {
            Perpustakaan v = new Perpustakaan();
            Login c = new Login(v);
            c.initController();
            view.dispose;
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Maaf Username dan Password Salah!");

        }    
    }   
}
