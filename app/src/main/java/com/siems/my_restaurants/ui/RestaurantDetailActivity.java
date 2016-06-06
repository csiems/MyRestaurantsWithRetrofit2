package com.siems.my_restaurants.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.siems.my_restaurants.R;
import com.siems.my_restaurants.adapters.RestaurantPagerAdapter;
import com.siems.my_restaurants.models.Restaurant;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RestaurantDetailActivity extends AppCompatActivity {
    @Bind(R.id.viewPager) ViewPager mViewPager;
    private RestaurantPagerAdapter adapterViewPager;
    ArrayList<Restaurant> mRestaurants = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);
        ButterKnife.bind(this);
        mRestaurants = Parcels.unwrap(getIntent().getParcelableExtra("restaurants"));
        int startingPosition = Integer.parseInt(getIntent().getStringExtra("position"));
        adapterViewPager = new RestaurantPagerAdapter(getSupportFragmentManager(), mRestaurants);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}
