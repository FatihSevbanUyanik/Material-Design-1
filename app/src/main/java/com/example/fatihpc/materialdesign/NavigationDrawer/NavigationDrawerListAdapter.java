package com.example.fatihpc.materialdesign.NavigationDrawer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fatihpc.materialdesign.R;
import com.example.fatihpc.materialdesign.RecyclerViewLandscape.LandscapeListData;

import java.util.ArrayList;

public class NavigationDrawerListAdapter extends RecyclerView.Adapter<NavigationDrawerListAdapter.MyViewHolder> {

    // properties
    private ArrayList<NavigationDrawerListData> navigationDrawerListData;
    private LayoutInflater layoutInflater;
    private Context context;

    public NavigationDrawerListAdapter(Context context , ArrayList<NavigationDrawerListData> navigationDrawerListData) {
        this.navigationDrawerListData = navigationDrawerListData;
        this.layoutInflater = LayoutInflater.from( context );
        this.context = context;
    }

    @NonNull
    @Override
    public NavigationDrawerListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.recycler_view_navigation_line_layout , parent , false );
        return new MyViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull NavigationDrawerListAdapter.MyViewHolder holder, final int position) {
        holder.getItemImageView().setImageResource( navigationDrawerListData.get(position).getItemImage() );
        holder.getItemNameTextView().setText( navigationDrawerListData.get(position).getItemName() );

        holder.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( context , "Position " + position , Toast.LENGTH_SHORT ).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return navigationDrawerListData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView itemNameTextView;
        private ImageView itemImageView;
        private View itemView;


        public MyViewHolder(View itemView) {
            super(itemView);
            itemNameTextView = itemView.findViewById( R.id.itemNameTextView );
            itemImageView = itemView.findViewById( R.id.itemImageView );
            this.itemView = itemView;
        }

        public TextView getItemNameTextView() {
            return itemNameTextView;
        }

        public void setItemNameTextView(TextView itemNameTextView) {
            this.itemNameTextView = itemNameTextView;
        }

        public ImageView getItemImageView() {
            return itemImageView;
        }

        public void setItemImageView(ImageView itemImageView) {
            this.itemImageView = itemImageView;
        }

        public View getItemView() {
            return itemView;
        }

        public void setItemView(View itemView) {
            this.itemView = itemView;
        }
    }

}
