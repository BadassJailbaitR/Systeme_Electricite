package org.example.domaine;

import java.util.List;

public class Localite {
    int code;
    String nom;
    List<Abonnement> abonnements;

    public List<Abonnement> getAbonnements() {
        return abonnements;
    }
    public Abonnement getAbonnementById(int noAbonnement) {
        for (Abonnement abn : this.abonnements) {
            if (abn.getNoAbonnement()==noAbonnement) {
                return abn;
            }
        }
        throw new RuntimeException("Abonnement Introuvable !!");
    }
}
