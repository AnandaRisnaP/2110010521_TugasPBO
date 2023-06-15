/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author USER
 */
public class AbsensiUser {
    private int idUser; 
    private String levelUser, emailUser, pwdUser;
    
    public void setidUser(int idUser){
        this.idUser = idUser;
    }
    public int getidUser(){
        return idUser;
    }
    public void setlevelUser(String levelUser){
        this.levelUser = levelUser;
    }
    public String getlevelUser(){
        return levelUser;
    }
    public void setemailUser(String emailUser){
        this.emailUser = emailUser;
    }
    public String getemailUser(){
        return emailUser;
    }
    public void setpwdUser(String pwdUser){
        this.pwdUser = pwdUser;
    }
    public String getpwdUser(){
        return pwdUser;
    }
}
