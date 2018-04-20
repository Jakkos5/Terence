/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randonnee;

import randonnee.controleur.RandonneeControleur;

/**
 *
 * @author donof
 */
public class RandonneeMVC {

    public static void main(String[] args) {

        RandonneeControleur gc = new RandonneeControleur();
        gc.menu();
    }
}
