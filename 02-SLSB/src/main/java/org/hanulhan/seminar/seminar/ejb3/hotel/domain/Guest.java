package org.hanulhan.seminar.seminar.ejb3.hotel.domain;

import java.io.Serializable;
import java.util.Date;

public class Guest implements Serializable
{
    private Long id;
    private String Name;
    private String FirstName;
    private int RoomNo;
    private int bill;
    private Date arrival;
    private Date departure;

    public Guest() {
    }

    public Guest(String name, String firstName, int roomNo) {
        Name = name;
        FirstName = firstName;
        RoomNo = roomNo;
        bill=0;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int roomNo) {
        RoomNo = roomNo;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }
}
