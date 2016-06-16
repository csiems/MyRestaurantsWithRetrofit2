package com.siems.my_restaurants.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.siems.my_restaurants.models.Restaurant;
import com.siems.my_restaurants.util.ItemTouchHelperAdapter;
import com.siems.my_restaurants.util.OnStartDragListener;

public class FirebaseRestaurantListAdapter extends FirebaseRecyclerAdapter<Restaurant, FirebaseRestaurantViewHolder> implements ItemTouchHelperAdapter {
    private Context mContext;

    public FirebaseRestaurantListAdapter(Class modelClass, int modelLayout, Class viewHolderClass, DatabaseReference ref) {
        super(modelClass, modelLayout, viewHolderClass, ref);

    }


    @Override
    protected void populateViewHolder(FirebaseRestaurantViewHolder viewHolder, Restaurant model, int position) {

    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        return false;
    }

    @Override
    public void onItemDismiss(int position) {

    }
}
