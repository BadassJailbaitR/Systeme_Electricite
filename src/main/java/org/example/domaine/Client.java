package org.example.domaine;

public abstract class  Client {
    protected int noClient;
    protected String adress;
    protected String numeroTelephone;

    public Client(int noClient, String adress, String numeroTelephone) {
        this.noClient = noClient;
        this.adress = adress;
        this.numeroTelephone = numeroTelephone;
    }
}
