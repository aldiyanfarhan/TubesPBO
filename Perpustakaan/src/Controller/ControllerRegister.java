/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
