package org.hanulhan.seminar.seminar.ejb3.hotel.dao;

import org.hanulhan.seminar.seminar.ejb3.hotel.entity.GuestEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface GuestDao {

    Long save(GuestEntity o);

    void update(GuestEntity o);

    void delete(Long id);

    GuestEntity getById(Long id);

    List<GuestEntity> suche(String suchBegriff);
}
