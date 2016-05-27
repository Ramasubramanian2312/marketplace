package com.marketplace.mvc.database.model;

import javax.persistence.*;

/**
 * Created by rchandrasekar on 4/27/2016.
 */
@Entity
@Table(name = "LOCATION")
public class LocationDto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "latitude")
    private float latitude;

    @Column(name = "longitude")
    private float longitude;

    public float getLongitude() { return longitude; }

    public void setLongitude(float longitude) { this.longitude = longitude; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public float getLatitude() { return latitude; }

    public void setLatitude(float latitude) { this.latitude = latitude; }

    @Override
    public String toString() {
        return "LocationDto{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
