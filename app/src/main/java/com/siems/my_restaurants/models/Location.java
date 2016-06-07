package com.siems.my_restaurants.models;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Location {

    public ArrayList <String> address = new ArrayList<>();

    public String city;

    public Coordinate coordinate;

    @SerializedName("country_code")
    public String countryCode;

    @SerializedName("cross_streets")
    public String crossStreets;

    @SerializedName("display_address")
    public ArrayList <String> displayAddress = new ArrayList<>();

    @SerializedName("geo_accuracy")
    public Double geoAccuracy;

    public ArrayList <String> neighborhoods = new ArrayList<>();

    @SerializedName("postal_code")
    public String postalCode;

    @SerializedName("state_code")
    public String stateCode;

    public Location() {
        //empty bean constructor
    }

    public Location(ArrayList<String> address, String city, Coordinate coordinate, String countryCode, String crossStreets, ArrayList<String> displayAddress, Double geoAccuracy, ArrayList<String> neighborhoods, String postalCode, String stateCode) {
        this.address = address;
        this.city = city;
        this.coordinate = coordinate;
        this.countryCode = countryCode;
        this.crossStreets = crossStreets;
        this.displayAddress = displayAddress;
        this.geoAccuracy = geoAccuracy;
        this.neighborhoods = neighborhoods;
        this.postalCode = postalCode;
        this.stateCode = stateCode;
    }

    public ArrayList <String> getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCrossStreets() {
        return crossStreets;
    }

    public ArrayList <String> getDisplayAddress() {
        return displayAddress;
    }

    public Double getGeoAccuracy() {
        return geoAccuracy;
    }

    public ArrayList <String> getNeighborhoods() {
        return neighborhoods;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStateCode() {
        return stateCode;
    }

}
