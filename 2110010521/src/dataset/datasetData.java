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
public class datasetData {
    private ArrayList<Integer> idabsen;
    private ArrayList<Integer> idbulan;
    private ArrayList<Integer> idhari;
    private ArrayList<Integer> idtgl;
    private ArrayList<Integer> iduser;
    private ArrayList<String> jammsk;
    private ArrayList<String> stjammsk;
    private ArrayList<String> jamklr;
    private ArrayList<String> stjamklr;
    
    public datasetData() {
         idabsen= new ArrayList<Integer>();
         idbulan= new ArrayList<Integer>(); 
         idhari= new ArrayList<Integer>();
         idtgl= new ArrayList<Integer>();
         iduser= new ArrayList<Integer>();
         jammsk = new ArrayList<String>();
         stjammsk = new ArrayList<String>();
         jamklr = new ArrayList<String>();
         stjamklr = new ArrayList<String>();
    }
    public void insertIdabsen(Integer isi){
        this.idabsen.add(isi);
    }
    public ArrayList<Integer> getRecordIdabsen(){
        return this.idabsen;
    }
    public void insertIdBulan(Integer isi){
        this.idbulan.add(isi);
    }
    public ArrayList<Integer> getRecordIdbulan(){
        return this.idbulan;
    }
    public void insertIdhari(Integer isi){
        this.idhari.add(isi);
    }
    public ArrayList<Integer> getRecordIdhari(){
        return this.idhari;
    } 
    public void insertIdtgl(Integer isi){
        this.idtgl.add(isi);
    }
    public ArrayList<Integer> getRecordIdtgl(){
        return this.idtgl;
    } 
    public void insertIduser(Integer isi){
        this.iduser.add(isi);
    }
    public ArrayList<Integer> getRecordIduser(){
        return this.iduser;
    }  
    public void insertJammsk(String isi){
        this.jammsk.add(isi);
    }
    public ArrayList<String> getRecordJammsk(){
        return this.jammsk;
    }
    public void insertStjammsk(String isi){
        this.stjammsk.add(isi);
    }
    public ArrayList<String> getRecordStjammsk(){
        return this.stjammsk;
    }
    public void insertJamklr(String isi){
        this.jamklr.add(isi);
    }
    public ArrayList<String> getRecordJamklr(){
        return this.jamklr;
    }
    public void insertStjamklr(String isi){
        this.stjamklr.add(isi);
    }
    public ArrayList<String> getRecordStjamklr(){
        return this.stjamklr;
    }
    
       public void insertData (int iduser, String jammsk, String stjammsk, String jamklr, String stjamklr, 
            int idabsen, int idbulan, int idhari){
        this.idabsen.add(idabsen);
        this.idbulan.add(idbulan);
        this.idhari.add(idhari);
        this.iduser.add(iduser);
    
        
    }
}
