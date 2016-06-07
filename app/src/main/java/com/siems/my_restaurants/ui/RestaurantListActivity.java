package com.siems.my_restaurants.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.siems.my_restaurants.BuildConfig;
import com.siems.my_restaurants.R;
import com.siems.my_restaurants.adapters.RestaurantListAdapter;
import com.siems.my_restaurants.models.SearchResponse;
import com.siems.my_restaurants.services.YelpAPI;
import com.siems.my_restaurants.services.YelpAPIFactory;
import com.siems.my_restaurants.models.Restaurant;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class RestaurantListActivity extends AppCompatActivity {

    private SharedPreferences mSharedPreferences;
    private String mRecentAddress;
    final String YELP_CONSUMER_KEY = BuildConfig.YELP_CONSUMER_KEY;
    final String YELP_CONSUMER_SECRET = BuildConfig.YELP_CONSUMER_SECRET;
    final String YELP_TOKEN = BuildConfig.YELP_TOKEN;
    final String YELP_TOKEN_SECRET = BuildConfig.YELP_TOKEN_SECRET;

    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;
    private RestaurantListAdapter mAdapter;
    public ArrayList<Restaurant> mRestaurants = new ArrayList<>();
    public static final String TAG = RestaurantListActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        ButterKnife.bind(this);

        Intent intent = getIntent();

//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        mRecentAddress = mSharedPreferences.getString(Constants.PREFERENCES_LOCATION_KEY, null);
//
//        if (mRecentAddress != null) {
//            getRestaurants(mRecentAddress);
//        }

        String location = intent.getStringExtra("location");
        getRestaurants(location);
    }

    private void getRestaurants(String location) {
        String term = "food";
        YelpAPIFactory apiFactory = new YelpAPIFactory(YELP_CONSUMER_KEY, YELP_CONSUMER_SECRET, YELP_TOKEN, YELP_TOKEN_SECRET);
        YelpAPI yelpAPI = apiFactory.createAPI();
        Call<SearchResponse> call = yelpAPI.search(term, location);
        Callback<SearchResponse> callback = new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                SearchResponse searchResponse = response.body();
                try {
                    mRestaurants = new ArrayList(searchResponse.getRestaurants());
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }

                RestaurantListActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter = new RestaurantListAdapter(getApplicationContext(), mRestaurants);
                        mRecyclerView.setAdapter(mAdapter);
                        RecyclerView.LayoutManager layoutManager =
                                new LinearLayoutManager(RestaurantListActivity.this);
                        mRecyclerView.setLayoutManager(layoutManager);
                        mRecyclerView.setHasFixedSize(true);
                    }
                });
            }
            @Override
            public void onFailure(retrofit2.Call<SearchResponse> call, Throwable t) {
                Log.d(TAG, t.toString());
            }
        };
        call.enqueue(callback);

    }
}