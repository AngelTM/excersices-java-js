package com.angeltm.restaurant.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESERVATION_ID")
    private long reservationId;
    @Column(name ="ROOM_ID")
    private long roomId;
    @Column(name ="GUEST_ID")
    private long guestId;
    @Column(name ="RES_DATE")
    private Date resDate;
    public long getReservationId() {
        return reservationId;
    }
    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }
    public long getRoomId() {
        return roomId;
    }
    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }
    public long getGuestId() {
        return guestId;
    }
    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }
    public Date getResDate() {
        return resDate;
    }
    public void setResDate(Date resDate) {
        this.resDate = resDate;
    }

}
