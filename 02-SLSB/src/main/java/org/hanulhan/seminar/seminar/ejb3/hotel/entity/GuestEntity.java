package org.hanulhan.seminar.seminar.ejb3.hotel.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Guest")
@Table(name = "HotelGuest")
//@NamedQuery(name = "suche", query = "select s from Guest s where s.Name =:suche")
public class GuestEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String firstName;
    private int roomNo;
    private int bill;

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Temporal(TemporalType.DATE)
    private Date arrival;

    @Temporal(TemporalType.DATE)
    private Date departure;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        departure = departure;
    }
}
