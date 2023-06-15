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
public class datasetHari {
     private ArrayList<Integer> idhari;
     private ArrayList<String> namahari;
     
    public datasetHari() {
         idhari= new ArrayList<Integer>();
         namahari = new ArrayList<String>();
    }    
    public void insertIdhari(int isi){
        this.idhari.add(isi);
    }
    public ArrayList<Integer> getRecordIdhari(){
        return this.idhari;
    } 
    public void insertNamahari(String isi){
        this.namahari.add(isi);
    }
    public ArrayList<String> getRecordNamahari(){
        return this.namahari;
    } 
    
    public void insertUser (String namahari,
            int idhari){
        this.idhari.add(idhari);
        this.namahari.add(namahari);
    
    }
}

