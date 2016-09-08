package com.example.zorien.grademanager.model;

import java.util.ArrayList;

/**
 * Created by zascho on 08.09.2016.
 */
public class Klasse {
    private int klassenid;
    private String bezeichnung;
    private ArrayList<Kurs> kurse;
    
    public Boolean selectKlasseByID(int currentID){return false;}
    public int insertKlasse(){return 0;}
    public Boolean updateKlasse(){return false;}
    public Boolean deleteKlasse(){return false;}

    public int getKlassenid() {
        return klassenid;
    }

    public void setKlassenid(int klassenid) {
        this.klassenid = klassenid;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public ArrayList<Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(ArrayList<Kurs> kurse) {
        this.kurse = kurse;
    }
}
