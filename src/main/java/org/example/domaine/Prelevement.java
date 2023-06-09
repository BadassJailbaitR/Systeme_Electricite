package org.example.domaine;

import java.time.LocalDate;

public class Prelevement {
    private LocalDate datePrelevement;
    private double index;
    private int noPrelevement;
    private Abonnement abonnement;

    public Prelevement(LocalDate datePrelevement, double index, int noPrelevement, Abonnement abonnement) {
        this.datePrelevement = datePrelevement;
        this.index = index;
        this.noPrelevement = noPrelevement;
        this.abonnement = abonnement;
    }
}
