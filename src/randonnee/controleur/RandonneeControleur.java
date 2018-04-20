/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randonnee.controleur;

import java.util.List;
import java.util.Scanner;
import randonnee.modele.RandonneeModele;
import randonnee.modele.Velo;
import randonnee.vue.RandonneeVue;

/**
 *
 * @author donof
 */
public class RandonneeControleur {

    private RandonneeVue rv=new RandonneeVue();
    private RandonneeModele rm = new RandonneeModele();
    

    public RandonneeControleur() {

    }

    public RandonneeControleur(RandonneeVue rv, RandonneeModele rm) {
        this.rv = rv;
        this.rm = rm;

    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        rm.informations();
        do {
            System.out.println("1.Ajouter velo");
            System.out.println("2.Afficher les vélos");
            System.out.println("3.Fin");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    ajoutVelo();

                    break;

                case 2:
                    
                    listeVelo();
                    break;
                case 3:
                    System.out.println("Aurevoir");
                    break;
                default:
                    System.out.println("Erreur");
            }
        } while (choix != 3);

    }

    public void ajoutVelo() {

        Velo v=rv.encodeVelo();
        String msg = rm.ajouterVelo(v);
        rv.affMsg(msg);

    }
    public void listeVelo() {
        List<Velo> vl = rm.tousVelo();
        rv.affListe(vl);
    }
}
