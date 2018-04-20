/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randonnee.modele;

import java.util.Scanner;

/**
 *
 * @author donof
 */
public class Velo {
    
    protected String numplaque="";
    protected String marque="";
    protected String taille="";
    
    
    public Velo(String numplaque){
        this.numplaque=numplaque;
    }
    public Velo(String numplaque, String marque, String taille) {
    this.numplaque = numplaque;
    this.marque = marque;
    this.taille = taille;
    }
   public String getNumplaque(){
       return numplaque;
   }
   
   public String getMarque(){
       return marque;
   }
   public String getTaille(){
       return taille;
   }

    @Override
    public String toString() {
        return "Velo{" + "numplaque=" + numplaque + ", marque=" + marque + ", taille=" + taille + '}';
    }
   
    
   
    
 

  
    
    
}

