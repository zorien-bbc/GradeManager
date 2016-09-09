package com.example.zorien.grademanager.model;

import java.util.ArrayList;

/**
 * Created by zascho on 08.09.2016.
 */
public class Fach {
    private int fachid;
    private String fachkurz;
    private String bezeichnung;
    private double schnitt;
    private ArrayList<Kurs> kurse;

    //caner
    public Fach() {
    }

    public Fach(String bezeichnung, double schnitt) {
        this.bezeichnung = bezeichnung;
        this.schnitt = schnitt;
    }

    private Boolean selectFachByID(int currentID) {
        return false;
    }

    public Boolean updateFach(int currentID) {
        return false;
    }

    public int insertFach() {
        return 0;
    }

    public Boolean deleteFach() {
        return false;
    }

    public String getFachkurz() {
        return fachkurz;
    }

    public void setFachkurz(String fachkurz) {
        this.fachkurz = fachkurz;
    }

    public double getSchnitt() {
        return schnitt;
    }

    public void setSchnitt(double schnitt) {
        this.schnitt = schnitt;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public ArrayList<com.example.zorien.grademanager.model.Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(ArrayList<Kurs> kurse) {
        this.kurse = kurse;
    }

    public int getFachid() {
        return fachid;
    }

    public void setFachid(int fachid) {
        this.fachid = fachid;
    }
}
