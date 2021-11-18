package org.hanulhan.seminar.seminar.ejb3.hotel.service;


import org.hanulhan.seminar.seminar.ejb3.hotel.dao.GuestDao;
import org.hanulhan.seminar.seminar.ejb3.hotel.domain.Guest;
import org.hanulhan.seminar.seminar.ejb3.hotel.entity.GuestEntity;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

@Stateless(name = "HotelService")
@Remote(HotelService.class)
public class HotelServiceImpl implements HotelService{

    @EJB
    private GuestDao guestDao;


    @Override
    public Long arrival(Guest guest) {
        GuestEntity ent= new GuestEntity();
        return null;
    }

    @Override
    public Long departure(Long id) {
        return null;
    }

    @Override
    public List<Guest> suche(String Name) {
        return null;
    }

    @Override
    public Guest hole(Long id) {
        return null;
    }

    @Override
    public void addCosts(Long id, int value) {

    }
}
