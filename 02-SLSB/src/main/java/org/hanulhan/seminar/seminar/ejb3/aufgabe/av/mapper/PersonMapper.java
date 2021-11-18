package org.hanulhan.seminar.seminar.ejb3.aufgabe.av.mapper;

import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.domain.Person;
import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.entity.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public class PersonMapper {

    public static PersonEntity toEntity(Person p) {
        PersonEntity pe= new PersonEntity();
        pe.setName(p.getName());
        pe.setVorname(p.getVorname());
        pe.setWohnort(p.getWohnort());
        pe.setStrasse(p.getStrasse());
        pe.setPlz(p.getPlz());
        pe.setGebDat(p.getGebDat());
        pe.setId(p.getId());
        return pe;
    }

    public static Person toDomain(PersonEntity pe)  {
        Person p= new Person();
        p.setName(pe.getName());
        p.setVorname(pe.getVorname());
        p.setWohnort(pe.getWohnort());
        p.setStrasse(pe.getStrasse());
        p.setPlz(pe.getPlz());
        p.setId(pe.getId());
        p.setGebDat(pe.getGebDat());
        return p;
    }

    public static List<Person> toDomain(List<PersonEntity> pel)  {
        List<Person> pl= new ArrayList<>();
        for (PersonEntity temp: pel)    {
            pl.add(toDomain(temp));
        }
        return pl;
    }
}
