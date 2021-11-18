package org.hanulhan.seminar.seminar.ejb3.aufgabe.av.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name="Person")
@Table(name="PERSON")
@NamedQuery(name = "suchePerson", query = "select p from Person p where p.name=:name and p.vorname=:vorname")
public class PersonEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME", length = 75)
    private String name;
    @Column(name = "VORNAME", length = 75)
    private String vorname;
    @Column(name = "STRASSE", length = 75)
    private String strasse;
    @Column(name = "PLZ", length = 6)
    private String plz;
    @Column(name = "WOHNORT", length = 75)
    private String wohnort;
    @Temporal(TemporalType.DATE)
    private Date gebDat;

    @PostPersist
    void nachSpeichern() {
        System.out.println("Ganz neuer Person mit ID: "+id );
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
