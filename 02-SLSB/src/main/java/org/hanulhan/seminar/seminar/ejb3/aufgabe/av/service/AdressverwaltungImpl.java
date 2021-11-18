package org.hanulhan.seminar.seminar.ejb3.aufgabe.av.service;

import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.dao.PersonDAO;
import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.domain.Person;
import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.entity.PersonEntity;
import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.mapper.PersonMapper;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import java.util.List;

@Stateless(name="Adressverwaltung")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class AdressverwaltungImpl implements Adressverwaltung {

    @EJB
    private PersonDAO personDAO;

    @Override
    public String teste() {
        return null;
    }

    @Override
    public Person neu(Person p) {
        PersonEntity ent= PersonMapper.toEntity(p);
        Long id= personDAO.save(ent);

        ent= personDAO.getById(id);
        p= PersonMapper.toDomain(ent);
        return p;
    }

    @Override
    public Person get(Long id) {
        PersonEntity ent= personDAO.getById(id);
        return PersonMapper.toDomain(ent);
    }

    @Override
    public List<Person> suchePerson(String name, String vorname) {
        List<PersonEntity> list= personDAO.suchePerson(name, vorname);
        return PersonMapper.toDomain(list);
    }
}
