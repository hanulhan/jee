package org.hanulhan.seminar.seminar.ejb3.hotel.mapping;

import org.hanulhan.seminar.seminar.ejb3.hotel.domain.Guest;
import org.hanulhan.seminar.seminar.ejb3.hotel.entity.GuestEntity;

public class HotelMapper {

    public static Guest toDomain(GuestEntity ge){
        Guest g= new Guest();
        g.setName(ge.getName());
        g.setFirstName(ge.getFirstName());
        g.setArrival(ge.getArrival());
        g.setDeparture(ge.getDeparture());
        g.setBill(ge.getBill());
        g.setRoomNo(ge.getRoomNo());
        g.setId(ge.getId());
        return g;
    }

    public static GuestEntity toEntity(Guest g) {
        GuestEntity ge= new GuestEntity();
        ge.setName(g.getName());
        ge.setFirstName(g.getFirstName());
        ge.setArrival(g.getArrival());
        ge.setDeparture(g.getDeparture());
        ge.setBill(g.getBill());
        ge.setRoomNo(g.getRoomNo());
        ge.setId(g.getId());
        return ge;
    }

}
