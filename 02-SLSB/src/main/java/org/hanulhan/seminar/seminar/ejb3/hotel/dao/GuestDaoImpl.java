package org.hanulhan.seminar.seminar.ejb3.hotel.dao;

import org.hanulhan.seminar.seminar.ejb3.hotel.entity.GuestEntity;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless(name = "GuestDao")
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class GuestDaoImpl implements GuestDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public Long save(GuestEntity o) {
        em.persist(o);
        System.out.println("Speichern von " + o.getId());
        return o.getId();

    }

    @Override
    public void update(GuestEntity o) {
        em.merge(o);
    }

    @Override
    public void delete(Long id) {
        GuestEntity e= getById(id);
        em.remove(e);
    }

    @Override
    public GuestEntity getById(Long id) {
        return em.find(GuestEntity.class, id);
    }

    @Override
    public List<GuestEntity> suche(String suchBegriff) {
        Query q= em.createNamedQuery("suche");
        q.setParameter("suche", "%" + suchBegriff + "%");
        List<GuestEntity> ergebnis= q.getResultList();
        return ergebnis;
    }

}
