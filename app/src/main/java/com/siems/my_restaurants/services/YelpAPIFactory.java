package com.siems.my_restaurants.services;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;

/**
 * Util class to create YelpAPI as the stub to use Yelp API. This is the entry point to use this clientlib.
 * <p>
 * Example:<br />
 * YelpAPIFactory apiFactory = new YelpAPIFactory(consumerKey, consumerSecret, token, tokenSecret);<br />
 * YelpAPI yelpAPI = apiFactory.createAPI();<br />
 * Business business = yelpAPI.getBusiness(businessId).execute();
 * </p>
 */
public class YelpAPIFactory {

    private static final String YELP_API_BASE_URL = "https://api.yelp.com";

    private OkHttpClient httpClient;

    public YelpAPIFactory(String consumerKey, String consumerSecret, String token, String tokenSecret) {
        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(consumerKey, consumerSecret);
        consumer.setTokenWithSecret(token, tokenSecret);

        this.httpClient = new OkHttpClient.Builder()
                .addInterceptor(new SigningInterceptor(consumer))
                .build();
    }

    public YelpAPI createAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getAPIBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .client(this.httpClient)
                .build();

        return retrofit.create(YelpAPI.class);
    }

    public String getAPIBaseUrl() {
        return YELP_API_BASE_URL;
    }
}

