package com.vrihas.simpleauth.authapplication.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    private long id;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "restaurant_id")
    private long restaurantId;

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Column(name = "party_size")
    private int party_size;

    public Reservation() {
    }

    public Reservation(long id, long userId, int party_size) {
        this.id = id;
        this.userId = userId;
        this.party_size = party_size;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getParty_size() {
        return party_size;
    }

    public void setParty_size(int party_size) {
        this.party_size = party_size;
    }
}
