/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randonnee.vue;

import java.util.Collection;
import java.util.Scanner;
import randonnee.modele.Velo;

/**
 *
 * @author donof
 */
public class RandonneeVue {
    
    Scanner sc=new Scanner(System.in);
    
    
    
    public Velo encodeVelo() {
        String numPlaque = getMsg("entrer le  numéro de chassis du velo ");
        String marque =getMsg("entrer la marque du velo");
        String taille = getMsg("entrer la taille ");
        Velo v = new Velo(numPlaque,marque,taille);
        return v;
    }
    
    public void affVelo(Velo v ){
        affMsg("numéro de plaque :" +v.getNumplaque());
        affMsg("Marque du velo :" +v.getNumplaque());
        affMsg("Taille du vélo:" +v.getTaille());
    }
    
     public String getMsg() {
        String msg = sc.nextLine();
        return msg;
    }

    public void affMsg(Object msg) {
        System.out.println(msg);
    }

    public String getMsg(String msg) {//surcharge de la méthode getMsg
        affMsg(msg);
        return getMsg();
    }
    public void affListe(Collection liste){
      int i=1;
        for(Object o : liste){
          affMsg((i++)+" ." + o);
      } 
}
}
