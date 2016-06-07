package com.siems.my_restaurants.models;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Restaurant {
    public String index;
    public List<ArrayList<String>> categories = new ArrayList<>();
    public String display_phone;
    public String id;
    public String image_url;
    public Boolean is_claimed;
    public Boolean is_closed;
    public Location location;
    public String mobile_url;
    public String name;
    public String phone;
    public Double rating;
    public String rating_img_url;
    public String rating_img_url_large;
    public String rating_img_url_small;
    public Integer review_count;
    public String snippet_image_url;
    public String snippet_text;
    public String url;

    public Restaurant() {
        //empty bean constructor
    }

    public Restaurant(ArrayList<ArrayList<String>> categories, String display_phone, String id, String image_url, Boolean is_claimed, Boolean is_closed, Location location, String mobile_url, String name, String phone, Double rating, String rating_img_url, String rating_img_url_large, String rating_img_url_small, Integer review_count, String snippet_image_url, String snippet_text, String url) {
        this.index = "not_specified";
        this.categories = categories;
        this.display_phone = display_phone;
        this.id = id;
        this.image_url = image_url;
        this.is_claimed = is_claimed;
        this.is_closed = is_closed;
        this.location = location;
        this.mobile_url = mobile_url;
        this.name = name;
        this.phone = phone;
        this.rating = rating;
        this.rating_img_url = rating_img_url;
        this.rating_img_url_large = rating_img_url_large;
        this.rating_img_url_small = rating_img_url_small;
        this.review_count = review_count;
        this.snippet_image_url = snippet_image_url;
        this.snippet_text = snippet_text;
        this.url = url;
    }


    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public List<ArrayList<String>> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<ArrayList<String>> categories) {
        this.categories = categories;
    }

    public String getDisplayPhone() {
        return display_phone;
    }

    public void setDisplayPhone(String display_phone) {
        this.display_phone = display_phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }

    public Boolean getIsClaimed() {
        return is_claimed;
    }

    public void setIsClaimed(Boolean is_claimed) {
        this.is_claimed = is_claimed;
    }

    public Boolean getIsClosed() {
        return is_closed;
    }

    public void setIsClosed(Boolean is_closed) {
        this.is_closed = is_closed;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMobileUrl() {
        return mobile_url;
    }

    public void setMobileUrl(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getRatingImgUrl() {
        return rating_img_url;
    }

    public void setRatingImgUrl(String rating_img_url) {
        this.rating_img_url = rating_img_url;
    }

    public String getRatingImgUrlLarge() {
        return rating_img_url_large;
    }

    public void setRatingImgUrlLarge(String rating_img_url_large) {
        this.rating_img_url_large = rating_img_url_large;
    }

    public String getRatingImgUrlSmall() {
        return rating_img_url_small;
    }

    public void setRatingImgUrlSmall(String rating_img_url_small) {
        this.rating_img_url_small = rating_img_url_small;
    }

    public Integer getReviewCount() {
        return review_count;
    }

    public void setReviewCount(Integer review_count) {
        this.review_count = review_count;
    }

    public String getSnippetImageUrl() {
        return snippet_image_url;
    }

    public void setSnippetImageUrl(String snippet_image_url) {
        this.snippet_image_url = snippet_image_url;
    }

    public String getSnippetText() {
        return snippet_text;
    }

    public void setSnippetText(String snippet_text) {
        this.snippet_text = snippet_text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLargeImageUrl(String imageUrl) {
        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 6).concat("o.jpg");
        return largeImageUrl;
    }

}