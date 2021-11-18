package org.hanulhan.seminar.seminar.ejb3.aufgabe.av.domain;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

    private Long id;
    private String name;
    private String vorname;
    private String strasse;
    private String plz;
    private String wohnort;
    private Date gebDat;

    public Person() {
    }

    public Person(String name, String vorname, String strasse, String plz, String wohnort, Date gebDat) {
        this.name = name;
        this.vorname = vorname;
        this.strasse = strasse;
        this.plz = plz;
        this.wohnort = wohnort;
        this.gebDat = gebDat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public Date getGebDat() {
        return gebDat;
    }

    public void setGebDat(Date gebDat) {
        this.gebDat = gebDat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", strasse='" + strasse + '\'' +
                ", plz='" + plz + '\'' +
                ", wohnort='" + wohnort + '\'' +
                ", gebDat=" + gebDat +
                '}';
    }
}

