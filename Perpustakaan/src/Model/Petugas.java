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
public class Petugas extends Register{
    String Username;
    String Password;
    int id;
    
    public Petugas (int id, String Username, String Password) {
        this.id = id;
        this.Username = Username;
        this.Password = Password;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }  
}
