package com.example.zorien.grademanager.model;

/**
 * Created by zascho on 08.09.2016.
 */
public class Kurs {
    private int kursid;
    private String semester;
    private String jahr;
    private int minNoten;
    private int maxStreichnoten;
    private float gewichtSemesternote;

    public Boolean selectKursByID(int currentID){return false;}
    public int insertKurs(){return 0;}
    public Boolean updateKurs(){return false;}
    public Boolean deleteKurs(){return false;}

    public int getKursid() {
        return kursid;
    }

    public void setKursid(int kursid) {
        this.kursid = kursid;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getJahr() {
        return jahr;
    }

    public void setJahr(String jahr) {
        this.jahr = jahr;
    }

    public int getMinNoten() {
        return minNoten;
    }

    public void setMinNoten(int minNoten) {
        this.minNoten = minNoten;
    }

    public int getMaxStreichnoten() {
        return maxStreichnoten;
    }

    public void setMaxStreichnoten(int maxStreichnoten) {
        this.maxStreichnoten = maxStreichnoten;
    }

    public float getGewichtSemesternote() {
        return gewichtSemesternote;
    }

    public void setGewichtSemesternote(float gewichtSemesternote) {
        this.gewichtSemesternote = gewichtSemesternote;
    }
}
