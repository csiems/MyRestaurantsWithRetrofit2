package com.siems.my_restaurants.models;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class SearchResponse {

    public List<Restaurant> businesses = new ArrayList<>();
    public Integer total;

    public SearchResponse() {}

    public SearchResponse(ArrayList<Restaurant> businesses, Integer total) {
        this.businesses = businesses;
        this.total = total;
    }

    public List<Restaurant> getRestaurants() {
        return businesses;
    }

    public void setRestaurants(ArrayList<Restaurant> businesses) {
        this.businesses = businesses;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}

