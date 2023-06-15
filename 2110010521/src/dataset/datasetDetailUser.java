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
public class datasetDetailUser {
    private ArrayList<Integer> idcat;
    private ArrayList<Integer> nisuser;
    private ArrayList<String> namauser;
    private ArrayList<String> sklhuser;
    private ArrayList<String> jkuser;
    
    public datasetDetailUser() {
         idcat= new ArrayList<Integer>();
         nisuser= new ArrayList<Integer>(); 
         namauser= new ArrayList<String>();
         sklhuser = new ArrayList<String>();
         jkuser = new ArrayList<String>();
    }
    public void insertIdcat(Integer isi){
        this.idcat.add(isi);
    }
    public ArrayList<Integer> getRecordIdcat(){
        return this.idcat;
    }
    public void insertNisuser(Integer isi){
        this.nisuser.add(isi);
    }
    public ArrayList<Integer> getRecordNisuser(){
        return this.nisuser;
    } 
    public void insertNamauser(String isi){
        this.namauser.add(isi);
    }
    public ArrayList<String> getRecordNamauser(){
        return this.namauser;
    } 
    public void insertSklhuser(String isi){
        this.sklhuser.add(isi);
    }
    public ArrayList<String> getRecordSklhuser(){
        return this.sklhuser;
    } 
    public void insertJkuser(String isi){
        this.jkuser.add(isi);
    }
    public ArrayList<String> getRecordJkuser(){
        return this.jkuser;
    } 
    
    public void insertUser (String namauser, String sklhuser, String jkuser,
            int idcat, int nisuser){
        this.idcat.add(idcat);
        this.nisuser.add(nisuser);
        this.namauser.add(namauser);
        this.sklhuser.add(sklhuser);
        this.jkuser.add(jkuser);
    }
    
}
    
