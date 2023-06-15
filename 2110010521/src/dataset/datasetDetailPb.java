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
public class datasetDetailPb {
     private ArrayList<Integer> iduser;
     private ArrayList<String> namauser;
     
    public datasetDetailPb() {
         iduser = new ArrayList<Integer>();
         namauser = new ArrayList<String>();
    }    
    public void insertIduser(int isi){
        this.iduser.add(isi);
    }
    public ArrayList<Integer> getRecordIdUser(){
        return this.iduser;
    } 
    public void insertNamauser(String isi){
        this.namauser.add(isi);
    }
    public ArrayList<String> getRecordNamauser(){
        return this.namauser;
    } 
    
    public void insertDetailPb (String namauser,
            int iduser){
        this.iduser.add(iduser);
        this.namauser.add(namauser);
     }   
}
