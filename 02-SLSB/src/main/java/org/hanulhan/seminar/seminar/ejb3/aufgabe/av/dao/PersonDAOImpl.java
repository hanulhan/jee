package org.hanulhan.seminar.seminar.ejb3.aufgabe.av.dao;

import org.hanulhan.seminar.seminar.ejb3.aufgabe.av.entity.PersonEntity;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless(name = "PersonDAO")
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PersonDAOImpl implements PersonDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public Long save(PersonEntity o) {
        em.persist(o);
        System.out.println("Speichere " + o.getId());
        return o.getId();
    }

    @Override
    public void update(PersonEntity o) {
        em.merge(o);
    }

    @Override
    public void delete(Long id) {
        PersonEntity o= getById(id);
        em.remove(o);
    }

    @Override
    public PersonEntity getById(Long id) {
        return null;
    }

    @Override
    public List<PersonEntity> suchePerson(String name, String vorname) {
        Query q = em.createNamedQuery("suchePerson");
        q.setParameter("name", name);
        q.setParameter("vorname", vorname);
        List<PersonEntity> ergebnis = q.getResultList();
        return ergebnis;
    }
}
