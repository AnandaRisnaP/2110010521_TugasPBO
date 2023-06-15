/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class datasetUser {
     private ArrayList<String> iduser;
     private ArrayList<String> leveluser;
     private ArrayList<String> emailuser;
     private ArrayList<String> password;
     
public datasetUser() {
         iduser = new ArrayList<String>();
         leveluser = new ArrayList<String>();
         emailuser = new ArrayList<String>();
         password = new ArrayList<String>();
     }    
    public void insertIduser(String isi){
        this.iduser.add(isi);
    }
    public ArrayList<String> getRecordIdUser(){
        return this.iduser;
    } 
    public void insertLeveluser(String isi){
        this.leveluser.add(isi);
    }
    public ArrayList<String> getRecordLeveluser(){
        return this.leveluser;
    } 
    public void insertEmailuser(String isi){
        this.emailuser.add(isi);
    }
    public ArrayList<String> geRecordtEmailuser(){
        return this.emailuser;
    }
    public void insertPassword(String isi){
        this.password.add(isi);
    }
    public ArrayList<String> getRecordPassword(){
        return this.password;
    }
    
    public void insertUser (String leveluser, String emailuser, String password, String iduser){
        this.iduser.add(iduser);
        this.leveluser.add(leveluser);
        this.emailuser.add(emailuser);
        this.password.add(password); 
    }

}

