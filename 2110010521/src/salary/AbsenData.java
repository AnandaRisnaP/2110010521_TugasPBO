/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author USER
 */
public class AbsenData {
    private int idAbsen, idBulan, idHari, idTgl; 
    private String idUser, jamMsk, stJamMsk, jamKlr, stJamKlr;
    
    public void setidAbsen(int idAbsen){
        this.idAbsen = idAbsen;
    }
    public int getidAbsen(){
        return idAbsen;
    }
    public void setidBulan(int idBulan){
        this.idBulan = idBulan;
    }
    public int getidBulan(){
        return idBulan;
    }
    public void setidHari(int idHari){
        this.idHari = idHari;
    }
    public int getidHari(){
        return idHari;
    }
    public void setidTgl(int idTgl){
        this.idTgl = idTgl;
    }
    public int getidTgl(){
        return idTgl;
    }
     public void setidUser(String idUser){
        this.idUser = idUser;
    }
    public String getidUser(){
        return idUser;
    }
    public void setjamMsk(String jamMsk){
        this.jamMsk = jamMsk;
    }
    public String getjamMsk(){
        return jamMsk;
    }
    public void setstJamMsk(String stJamMsk){
        this.stJamMsk = stJamMsk;
    }
    public String getstJamMsk(){
        return stJamMsk;
    }
    public void setjamKlr(String jamKlr){
        this.jamKlr = jamKlr;
    }
    public String getjamKlr(){
        return jamKlr;
    }
    public void setstJamKlr(String stJamKlr){
        this.stJamKlr = stJamKlr;
    }
    public String getstJamKlr(){
        return stJamKlr;
    }
}
