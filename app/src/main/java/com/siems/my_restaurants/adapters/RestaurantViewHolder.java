package com.siems.my_restaurants.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.siems.my_restaurants.R;
import com.siems.my_restaurants.models.Restaurant;
import com.siems.my_restaurants.ui.RestaurantDetailActivity;
import com.siems.my_restaurants.util.ItemTouchHelperViewHolder;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RestaurantViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {
    private static final int MAX_WIDTH = 200;
    private static final int MAX_HEIGHT = 200;

    @Bind(R.id.restaurantImageView) ImageView mRestaurantImageView;
    @Bind(R.id.restaurantNameTextView) TextView mNameTextView;
    @Bind(R.id.categoryTextView) TextView mCategoryTextView;
    @Bind(R.id.ratingTextView) TextView mRatingTextView;

    private Context mContext;
    private List<Restaurant> mRestaurants = new ArrayList<>();

    public RestaurantViewHolder(View itemView, List<Restaurant> restaurants) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mContext = itemView.getContext();
        mRestaurants = restaurants;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int itemPosition = getLayoutPosition();
                Intent intent = new Intent(mContext, RestaurantDetailActivity.class);
                intent.putExtra("position", itemPosition + "");
                intent.putExtra("restaurants", Parcels.wrap(mRestaurants));
                mContext.startActivity(intent);
            }
        });
    }

    public void bindRestaurant(Restaurant restaurant) {
        Picasso.with(mContext)
                .load(restaurant.getLargeImageUrl())
                .resize(MAX_WIDTH, MAX_HEIGHT)
                .centerCrop()
                .into(mRestaurantImageView);

        mNameTextView.setText(restaurant.getName());
        mCategoryTextView.setText(restaurant.getCategoriesAsString());
        mRatingTextView.setText("Rating: " + restaurant.getRating() + "/5");
    }

    @Override
    public void onItemSelected() {
        //add animation
    }

    @Override
    public void onItemClear() {
        //add animation
    }
}
