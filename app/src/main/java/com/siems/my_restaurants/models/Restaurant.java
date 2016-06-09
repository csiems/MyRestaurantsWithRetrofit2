package com.siems.my_restaurants.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Restaurant {
    public String index;
    public List<ArrayList<String>> categories = new ArrayList<>();
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
    @SerializedName("rating_img_url_large")
    public String ratingImgUrlLarge;
    @SerializedName("rating_img_url_small")
    public String ratingImgUrlSmall;
    @SerializedName("review_count")
    public Integer reviewCount;
    @SerializedName("snippet_image_url")
    public String snippetImageUrl;
    @SerializedName("snippet_text")
    public String snippetText;
    public String url;

    public Restaurant() {}

    public Restaurant(ArrayList<ArrayList<String>> categories, String displayPhone, String id, String imageUrl, Boolean isClaimed, Boolean isClosed, Location location, String mobileUrl, String name, String phone, Double rating, String ratingImgUrl, String ratingImgUrlLarge, String ratingImgUrlSmall, Integer reviewCount, String snippetImageUrl, String snippetText, String url) {
        this.index = "not_specified";
        this.categories = categories;
        this.displayPhone = displayPhone;
        this.id = id;
        this.imageUrl = imageUrl;
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
        return displayPhone;
    }

    public void setDisplayPhone(String displayPhone) {
        this.displayPhone = displayPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getIsClaimed() {
        return isClaimed;
    }

    public void setIsClaimed(Boolean isClaimed) {
        this.isClaimed = isClaimed;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
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
        return ratingImgUrl;
    }

    public void setRatingImgUrl(String ratingImgUrl) {
        this.ratingImgUrl = ratingImgUrl;
    }

    public String getRatingImgUrlLarge() {
        return ratingImgUrlLarge;
    }

    public void setRatingImgUrlLarge(String ratingImgUrlLarge) {
        this.ratingImgUrlLarge = ratingImgUrlLarge;
    }

    public String getRatingImgUrlSmall() {
        return ratingImgUrlSmall;
    }

    public void setRatingImgUrlSmall(String ratingImgUrlSmall) {
        this.ratingImgUrlSmall = ratingImgUrlSmall;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getSnippetImageUrl() {
        return snippetImageUrl;
    }

    public void setSnippetImageUrl(String snippetImageUrl) {
        this.snippetImageUrl = snippetImageUrl;
    }

    public String getSnippetText() {
        return snippetText;
    }

    public void setSnippetText(String snippetText) {
        this.snippetText = snippetText;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLargeImageUrl() {
        String imageUrl = this.getImageUrl();
        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 6).concat("o.jpg");
        return largeImageUrl;
    }

    public String getCategoriesAsString() {
        ArrayList<String> categoriesList = new ArrayList<>();
        for (ArrayList<String> category : this.getCategories()) {
            categoriesList.add(category.get(0));
        }
        return TextUtils.join(", ", categoriesList);
    }

}