package org.example.domaine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Abonnement {
    int noAbonnement;
    LocalDate dateCreation;
    Client c;
    Compteur comp;
    Localite loc;
    TypeUtilisation typeUtilisation;
    List<Prelevement> prelevements = new ArrayList<Prelevement>();

    public int getNoAbonnement() {
        return noAbonnement;
    }


    public Abonnement(int noAbonnement, LocalDate dateCreation, Client c, Compteur comp, Localite loc, TypeUtilisation typeUtilisation) {
        this.noAbonnement = noAbonnement;
        this.dateCreation = dateCreation;
        this.c = c;
        this.comp = comp;
        this.loc = loc;
        this.typeUtilisation = typeUtilisation;
    }
    public void createPrelevement(LocalDate datePrelevement,int noPrelevement,double conso) {
        Prelevement prelevement = new Prelevement(datePrelevement,conso,noPrelevement,this);
        this.prelevements.add(prelevement);
    }

}
