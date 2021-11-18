package org.hanulhan.seminar.seminar.ejb3.hotel.service;


import org.hanulhan.seminar.seminar.ejb3.hotel.domain.Guest;

import java.util.List;

public interface HotelService {

    Long arrival(Guest guest);
    Long departure(Long id);
    List<Guest> suche(String Name);

    Guest hole(Long id);

    void addCosts(Long id, int value);


}
