package com.siems.my_restaurants.models;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Business {
    public String index;

    public ArrayList<ArrayList<String>> categories = new ArrayList<>();

    @SerializedName("display_phone")
    public String displayPhone;

    public String id;

    @SerializedName("image_url")
    public String imageUrl;

    @SerializedName("is_claimed")
    public Boolean isClaimed;

    @SerializedName("is_closed")
    public Boolean isClosed;

    public Location location;

    @SerializedName("mobile_url")
    public String mobileUrl;

    public String name;

    public String phone;

    public Double rating;

    @SerializedName("rating_img_url")
    public String ratingImgUrl;

    @SerializedName("ratingImgUrl_large")
    public String ratingImgUrlLarge;

    @SerializedName("ratingImgUrl_small")
    public String ratingImgUrlSmall;

    @SerializedName("review_count")
    public Integer reviewCount;

    @SerializedName("snippet_imageUrl")
    public String snippetImageUrl;

    @SerializedName("snippet_text")
    public String snippetText;

    public String url;

    public Business() {
        //empty bean constructor
    }

    public Business(ArrayList<ArrayList<String>> categories, String display_phone, String id, String imageUrl, Boolean isClaimed, Boolean isClosed, Location location, String mobileUrl, String name, String phone, Double rating, String ratingImgUrl, String ratingImgUrlLarge, String ratingImgUrlSmall, Integer reviewCount, String snippetImageUrl, String snippetText, String url) {
        this.index = "not_specified";
        this.categories = categories;
        this.displayPhone = display_phone;
        this.id = id;
        this.imageUrl = getLargeImageUrl(imageUrl);
        this.isClaimed = isClaimed;
        this.isClosed = isClosed;
        this.location = location;
        this.mobileUrl = mobileUrl;
        this.name = name;
        this.phone = phone;
        this.rating = rating;
        this.ratingImgUrl = ratingImgUrl;
        this.ratingImgUrlLarge = ratingImgUrlLarge;
        this.ratingImgUrlSmall = ratingImgUrlSmall;
        this.reviewCount = reviewCount;
        this.snippetImageUrl = snippetImageUrl;
        this.snippetText = snippetText;
        this.url = url;
    }

    public String getIndex() {
        return index;
    }

    public ArrayList<ArrayList<String>> getCategories() {
        return categories;
    }

    public String getDisplayPhone() {
        return displayPhone;
    }

    public String getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Boolean getIsClaimed() {
        return isClaimed;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public Location getLocation() {
        return location;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Double getRating() {
        return rating;
    }

    public String getRatingImgUrl() {
        return ratingImgUrl;
    }

    public String getRatingImgUrlLarge() {
        return ratingImgUrlLarge;
    }

    public String getRatingImgUrlSmall() {
        return ratingImgUrlSmall;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public String getSnippetImageUrl() {
        return snippetImageUrl;
    }

    public String getSnippetText() {
        return snippetText;
    }

    public String getUrl() {
        return url;
    }

    public String getLargeImageUrl(String imageUrl) {
        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 6).concat("o.jpg");
        return largeImageUrl;
    }

}
