package org.hanulhan.seminar.seminar.ejb3.aufgabe.av.service;

import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.domain.Person;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface Adressverwaltung {

    String teste();

    Person neu(Person p);

    Person get(Long id);

    List<Person> suchePerson(String name, String vorname);
}
