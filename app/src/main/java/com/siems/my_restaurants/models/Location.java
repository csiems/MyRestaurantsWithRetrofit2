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
    public String country_code;
    public String cross_streets;
    public List<String> display_address = new ArrayList<>();
    public Double geo_accuracy;
    public List<String> neighborhoods = new ArrayList<>();
    public String postal_code;
    public String state_code;

    public Location() {
        //empty bean constructor
    }

    public Location(ArrayList<String> address, String city, Coordinate coordinate, String country_code, String cross_streets, ArrayList<String> display_address, Double geo_accuracy, ArrayList<String> neighborhoods, String postal_code, String state_code) {
        this.address = address;
        this.city = city;
        this.coordinate = coordinate;
        this.country_code = country_code;
        this.cross_streets = cross_streets;
        this.display_address = display_address;
        this.geo_accuracy = geo_accuracy;
        this.neighborhoods = neighborhoods;
        this.postal_code = postal_code;
        this.state_code = state_code;
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
        return country_code;
    }

    public void setCountryCode(String countryCode) {
        this.country_code = countryCode;
    }

    public String getCrossStreets() {
        return cross_streets;
    }

    public void setCrossStreets(String cross_streets) {
        this.cross_streets = cross_streets;
    }

    public List<String> getDisplayAddress() {
        return display_address;
    }

    public void setDisplayAddress(ArrayList<String> display_address) {
        this.display_address = display_address;
    }

    public Double getGeoAccuracy() {
        return geo_accuracy;
    }

    public void setGeoAccuracy(Double geo_accuracy) {
        this.geo_accuracy = geo_accuracy;
    }

    public List<String> getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(ArrayList<String> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    public String getPostalCode() {
        return postal_code;
    }

    public void setPostalCode(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getStateCode() {
        return state_code;
    }

    public void setStateCode(String state_code) {
        this.state_code = state_code;
    }

}
