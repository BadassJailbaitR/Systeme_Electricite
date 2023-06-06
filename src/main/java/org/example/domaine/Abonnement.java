package org.example.domaine;

import java.time.LocalDate;

public class Abonnement {
    int noAbonnement;
    LocalDate dateCreation;
    Client c;
    Compteur comp;
    Localite loc;
    TypeUtilisation typeUtilisation;


    public Abonnement(int noAbonnement, LocalDate dateCreation, Client c, Compteur comp, Localite loc, TypeUtilisation typeUtilisation) {
        this.noAbonnement = noAbonnement;
        this.dateCreation = dateCreation;
        this.c = c;
        this.comp = comp;
        this.loc = loc;
        this.typeUtilisation = typeUtilisation;
    }

}
