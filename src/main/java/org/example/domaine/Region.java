package org.example.domaine;

import org.example.domaine.Localite;

import java.util.HashMap;
import java.util.Map;

public class Region {
    private Map<Integer, Localite> localites = new HashMap<Integer,Localite>();
    private String nom;

    public Map<Integer, Localite> getLocalites() {
        return localites;
    }



}
