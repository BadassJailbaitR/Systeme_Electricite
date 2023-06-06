package org.example.domaine;

public class ClientPhysique extends Client{
    private String CIN,nom,prenom;
    public ClientPhysique(String CIN,String nom,String prenom,int noClient, String adress, String numeroTelephone) {
        super(noClient, adress, numeroTelephone);
        this.CIN=CIN;
        this.nom=nom;
        this.prenom=prenom;
    }
}
