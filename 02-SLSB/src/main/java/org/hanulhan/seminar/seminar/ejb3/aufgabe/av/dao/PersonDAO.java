package org.hanulhan.seminar.seminar.ejb3.aufgabe.av.dao;

import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.entity.PersonEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PersonDAO {

    Long save(PersonEntity o);

    void update(PersonEntity o);

    void delete(Long id);

    PersonEntity getById(Long id);

    public List<PersonEntity> suchePerson(String name, String vorname);
}
