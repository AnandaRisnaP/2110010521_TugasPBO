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
public class datasetBulan {
     private ArrayList<Integer> idbulan;
     private ArrayList<String> namabulan;
     
    public datasetBulan() {
         idbulan = new ArrayList<Integer>();
         namabulan = new ArrayList<String>();
    }    
    public void insertIdBulan(Integer isi){
        this.idbulan.add(isi);
    }
    public ArrayList<Integer> getRecordIdBulan(){
        return this.idbulan;
    } 
    public void insertNamaBulan(String isi){
        this.namabulan.add(isi);
    }
    public ArrayList<String> getRecordNamaBulan(){
        return this.namabulan;
    } 
    
       public void insertBulan (String namabulan,
            int idbulan){
        this.idbulan.add(idbulan);
        this.namabulan.add(namabulan);
    }
}
