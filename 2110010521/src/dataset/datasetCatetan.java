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
public class datasetCatetan {
     private ArrayList<Integer> idcat;
     private ArrayList<Integer> iduser;
     private ArrayList<Integer> idbulan;
     private ArrayList<Integer> idhari;
     private ArrayList<Integer> idtgl;
     private ArrayList<String> isicat;
     private ArrayList<String> statuscat;
     
     public datasetCatetan() {
         idcat= new ArrayList<Integer>();
         iduser= new ArrayList<Integer>();
         idbulan= new ArrayList<Integer>();
         idhari= new ArrayList<Integer>();
         idtgl= new ArrayList<Integer>();
         isicat= new ArrayList<String>();
         statuscat = new ArrayList<String>();
    }
    public void insertIdcat(Integer isi){
        this.idcat.add(isi);
    }
    public ArrayList<Integer> getRecordIdcat(){
        return this.idcat;
    }
    public void insertIduser(Integer isi){
        this.iduser.add(isi);
    }
    public ArrayList<Integer> getRecordIduser(){
        return this.iduser;
    } 
    public void insertIdbulan(Integer isi){
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
    public void insertIsicat(String isi){
        this.isicat.add(isi);
    }
    public ArrayList<String> getRecordIsicat(){
        return this.isicat;
    } 
    public void insertStatuscat(String isi){
        this.statuscat.add(isi);
    }
    public ArrayList<String> getRecordStatuscat(){
        return this.statuscat;
    }
    
     public void insertUser (String isicat, String statuscat,
            int idcat, int iduser, int idhari, int idbulan, int idtgl){
        this.idcat.add(idcat);
        this.iduser.add(iduser);
        this.idhari.add(idhari);
        this.idbulan.add(idbulan); 
        this.idtgl.add(idtgl);
        this.isicat.add(isicat);
        this.statuscat.add(statuscat); 
    } 
}
