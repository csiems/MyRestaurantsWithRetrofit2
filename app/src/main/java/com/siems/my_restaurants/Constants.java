package com.siems.my_restaurants;

public class Constants {
    /* Yelp constants */
    public static final String YELP_CONSUMER_KEY = BuildConfig.YELP_CONSUMER_KEY;
    public static final String YELP_CONSUMER_SECRET = BuildConfig.YELP_CONSUMER_SECRET;
    public static final String YELP_TOKEN = BuildConfig.YELP_TOKEN;
    public static final String YELP_TOKEN_SECRET = BuildConfig.YELP_TOKEN_SECRET;
    public static final String YELP_BASE_URL = "https://api.yelp.com/v2/search?term=food";
    public static final String YELP_LOCATION_QUERY_PARAMETER = "location";

    /*Shared Preferences constants*/
    public static final String PREFERENCES_LOCATION_KEY = "location";
    public static final String PREFERENCES_UID_KEY = "uid";

    /*Firebase constants*/
    public static final String FIREBASE_CHILD_SEARCHED_LOCATION = "searchedLocation";
    public static final String FIREBASE_CHILD_RESTAURANTS = "restaurants";
    public static final String FIREBASE_CHILD_USERS = "users";
    public static final String KEY_UID = "UID";
    public static final String KEY_USER_EMAIL = "email";

}
