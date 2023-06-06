package org.example.domaine;

import java.util.List;

public class Localite {
    int code;
    String nom;
    List<Abonnement> abonnements;

    public List<Abonnement> getAbonnements() {
        return abonnements;
    }
}
