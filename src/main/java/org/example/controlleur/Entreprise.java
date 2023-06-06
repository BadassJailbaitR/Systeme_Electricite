package org.example.controlleur;

import org.example.domaine.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entreprise {
    Map<Integer, Client> clients = new HashMap<Integer,Client>();
    Map<Integer, Region> regions = new HashMap<Integer,Region>();
    Map<Integer, Compteur> compteurs = new HashMap<Integer,Compteur>();
    Map<Client, List<Abonnement>> abonnements = new HashMap<Client, List<Abonnement>>();
    public Client indiquerClient(int noClient){
        if (this.clients.containsKey(noClient)) {
            return this.clients.get(noClient);
        }
        throw new RuntimeException("Client Introuvable !!");
    }
    public Localite indiquerLocalite(int noLocalite, int noRegion){
        Region r;
        if (this.regions.containsKey(noRegion)) {
            r = regions.get(noRegion);
            if (r.getLocalites().containsKey(noLocalite)) {
                return r.getLocalites().get(noLocalite);
            }
        }
        throw new RuntimeException("Localite Introuvable");
    }
    public Compteur indiquerCompteur(int noCompteur) {
        if (this.compteurs.containsKey(noCompteur)) {
            return this.compteurs.get(noCompteur);
        }
        throw new RuntimeException("Compteur Introuvable ");
    }
    private int generateKey() {
        return (int)(Math.random()*1000);
    }
    public void validerAbonnements(int noClient,int noRegion,int noLocalite,int noCompteur,TypeUtilisation typeUtilisation) {
        Client client;
        Localite local;
        Compteur comp;
        client=indiquerClient(noClient);
        local=indiquerLocalite(noLocalite,noRegion);
        comp=indiquerCompteur(noCompteur);
        Abonnement abonnement = new Abonnement(generateKey(), LocalDate.now(),client,comp,local,typeUtilisation);
        List<Abonnement> abs = this.abonnements.get(client);
        abs.add(abonnement);
        this.abonnements.put(client,abs);
    }

    public List<Region> getListRegion(){
        List<Region> list = (List<Region>) regions.values();
        return list;
    }
    private double consommation(Prelevement oldPrelevement,Prelevement newPrelevement) {
        double index = newPrelevement.getIndex()-oldPrelevement.getIndex()
        if (index<100) {
            return index*1.2;
        }
        else if (index<200) {
            return 100*1.2+(index-100)*1.5;
        }
        else {
            return 100*1.2+100*1.5+(index-100)*1.8;
        }
    }

    public double validerPrelevement(int noRegion,int noLocalite,int noCompteur,double consommation) {
        Localite local = indiquerLocalite(noLocalite,noRegion);
        Compteur comp = indiquerCompteur(noCompteur);

    }

    public List<Compteur> getListCompteur(int noLocalite,int noRegion){
        Localite local = indiquerLocalite(noLocalite,noRegion);

    }

    public List<Localite> getLocaliteParRegion(int noRegion){
        if (this.regions.containsKey(noRegion)) {
            Region r = regions.get(noRegion);
            return (List<Localite>) r.getLocalites().values();
        }
        throw new RuntimeException("Region Introuvable !");
    }
}
