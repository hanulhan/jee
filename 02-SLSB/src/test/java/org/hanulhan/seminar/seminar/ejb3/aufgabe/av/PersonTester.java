package org.hanulhan.seminar.seminar.ejb3.aufgabe.av;

import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.domain.Person;
import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.service.Adressverwaltung;
import org.hanulhan.seminar.seminar.ejb3.tools.EJBTools;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTester {

    private static Adressverwaltung service;

    @BeforeClass
    public static void init() throws NamingException {
        InitialContext context = new InitialContext();

        // Referenz auf EJB holen
        service = (Adressverwaltung) context.lookup(EJBTools.machJNDIName(Adressverwaltung.class));
    }

    @Test
    public void Adressverwaltung_NeuePerson() throws ParseException {
        String pattern= "MM-dd-yyyy";
        SimpleDateFormat sd= new SimpleDateFormat(pattern);
        Date birth= sd.parse("12-11-1937");
        Person p= new Person("Müller", "Thomas", "Gothaer-Allee", "51109", "Köln", birth);

        p= service.neu(p);

        service.suchePerson("Müller", "Thomas");
    }
}
