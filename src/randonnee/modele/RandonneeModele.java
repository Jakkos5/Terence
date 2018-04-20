/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randonnee.modele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author donof
 */
public class RandonneeModele {
    
    private List<Velo> mesVelo=new ArrayList<>();
    
    public RandonneeModele(){
    }  
        
        
     public String ajouterVelo(Velo v){
     if(v==null)return "Velo nul";
     int p=mesVelo.indexOf(v);
     if(p>=0)return "velo deja enregistre";
     mesVelo.add(v);
     return "ajout velo effectue";
  }
     
     public void informations(){
          mesVelo.addAll(Arrays.asList(
               new Velo("A11","BTWIN","100cm"),
               new Velo("B22","BTWIN","95cm"),
               new Velo("C33","POLYGON","120cm")
               ));
     }
     public List<Velo> tousVelo(){
         return mesVelo;
     }
    
    
}
