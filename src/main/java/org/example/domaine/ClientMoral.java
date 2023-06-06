package org.example.domaine;

public class ClientMoral extends Client{
    int patente;
    FormeJuridique formeJuridique;
    public ClientMoral(int patente,FormeJuridique formeJuridique, int noClient, String adress, String numeroTelephone) {
        super(noClient, adress, numeroTelephone);
        this.patente=patente;
        this.formeJuridique=formeJuridique;
    }
}
