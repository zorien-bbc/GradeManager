package com.example.zorien.grademanager.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by zascho on 08.09.2016.
 */
public class Person {
    private int personid;
    private String vorname;
    private String nachname;
    private ArrayList<Kurs>kurse;

    public Boolean selectPersonByID(int currentID){return false;}
    public int insertPerson(){return 0;}
    public Boolean updatePerson(){return false;}
    public Boolean deletePerson(){return false;}

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public ArrayList<Kurs> getKurse() {
        return kurse;
    }

    public void setKurse(ArrayList<Kurs> kurse) {
        this.kurse = kurse;
    }
}
