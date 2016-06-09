package com.siems.my_restaurants.models;

import org.parceler.Parcel;

@Parcel
public class Coordinate {

    public Double latitude;
    public Double longitude;

    public Coordinate () {}

    public Coordinate(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


}