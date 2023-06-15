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
public class datasetTanggal {
     private ArrayList<Integer> idtgl;
     private ArrayList<String> namatgl;
     
    public datasetTanggal() {
         idtgl= new ArrayList<Integer>();
         namatgl = new ArrayList<String>();
    }    
    public void insertIdtgl(int isi){
        this.idtgl.add(isi);
    }
    public ArrayList<Integer> getRecordIdtgl(){
        return this.idtgl;
    } 
    public void insertNamatgl(String isi){
        this.namatgl.add(isi);
    }
    public ArrayList<String> getRecordNamatgl(){
        return this.namatgl;
    } 
    
       public void insertTanggal (String namatgl,
            int idtgl){
        this.idtgl.add(idtgl);
        this.namatgl.add(namatgl);
    }
}

