package com.siems.my_restaurants.models;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Location {

    public List<String> address = new ArrayList<>();
    public String city;
    public Coordinate coordinate;
    @SerializedName("country_code")
    public String countryCode;
    @SerializedName("cross_streets")
    public String crossStreets;
    @SerializedName("display_address")
    public List<String> displayAddress = new ArrayList<>();
    @SerializedName("geo_accuracy")
    public Double geoAccuracy;
    public List<String> neighborhoods = new ArrayList<>();
    @SerializedName("postal_code")
    public String postalCode;
    @SerializedName("state_code")
    public String stateCode;

    public Location() {}

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

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCrossStreets() {
        return crossStreets;
    }

    public void setCrossStreets(String crossStreets) {
        this.crossStreets = crossStreets;
    }

    public List<String> getDisplayAddress() {
        return displayAddress;
    }

    public void setDisplayAddress(ArrayList<String> displayAddress) {
        this.displayAddress = displayAddress;
    }

    public Double getGeoAccuracy() {
        return geoAccuracy;
    }

    public void setGeoAccuracy(Double geoAccuracy) {
        this.geoAccuracy = geoAccuracy;
    }

    public List<String> getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(ArrayList<String> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

}
