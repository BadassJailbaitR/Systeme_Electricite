package org.example.domaine;

public abstract class Compteur {
    int noCompteur,puissance,tension;

    public Compteur(int noCompteur, int puissance, int tension) {
        this.noCompteur = noCompteur;
        this.puissance = puissance;
        this.tension = tension;
    }
}
