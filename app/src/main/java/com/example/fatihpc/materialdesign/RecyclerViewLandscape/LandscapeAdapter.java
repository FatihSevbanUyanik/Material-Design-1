package com.example.fatihpc.materialdesign.RecyclerViewLandscape;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fatihpc.materialdesign.R;

import java.util.ArrayList;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeAdapter.MyViewHolder> {

    private ArrayList<LandscapeListData> landscapes;
    private LayoutInflater layoutInflater;

    public LandscapeAdapter(Context activityContext , ArrayList<LandscapeListData> landscapes) {
        layoutInflater = LayoutInflater.from( activityContext );
        this.landscapes = landscapes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate( R.layout.recycler_view_landscape_line_layout, parent , false );
        return new MyViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position)
    {
        holder.getLandscapeImageView().setImageResource( landscapes.get(position).getLandscapeImag() );
        holder.getLandscapeNameTextView().setText( landscapes.get(position).getLandscapeName() );
        holder.getLandscapeDescTextView().setText( landscapes.get(position).getLandscapeDesc() );

        holder.getAddImageView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addLandScape(position);
            }
        });

        holder.getDeleteImageView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteLandScape(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return landscapes.size();
    }

    private void addLandScape( int position ){
        landscapes.add( position , landscapes.get(position) );
        notifyItemInserted( position );
        notifyItemRangeChanged( position , landscapes.size() );
    }

    private void deleteLandScape( int position ){
        landscapes.remove( position );
        notifyItemRemoved( position );
        notifyItemRangeChanged( position , landscapes.size() );
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView landscapeImageView;
        private ImageView addImageView;
        private ImageView deleteImageView;
        private TextView  landscapeNameTextView;
        private TextView  landscapeDescTextView;

        MyViewHolder(View itemView) {
            super(itemView);
            landscapeImageView = itemView.findViewById( R.id.landscapeImageView );
            addImageView = itemView.findViewById( R.id.addImageView );
            deleteImageView = itemView.findViewById( R.id.deleteImageView );
            landscapeNameTextView = itemView.findViewById( R.id.headingTextView );
            landscapeDescTextView = itemView.findViewById( R.id.descriptionTextView );
        }

        public ImageView getLandscapeImageView() {
            return landscapeImageView;
        }

        public void setLandscapeImageView(ImageView landscapeImageView) {
            this.landscapeImageView = landscapeImageView;
        }

        public ImageView getAddImageView() {
            return addImageView;
        }

        public void setAddImageView(ImageView addImageView) {
            this.addImageView = addImageView;
        }

        public ImageView getDeleteImageView() {
            return deleteImageView;
        }

        public void setDeleteImageView(ImageView deleteImageView) {
            this.deleteImageView = deleteImageView;
        }

        public TextView getLandscapeNameTextView() {
            return landscapeNameTextView;
        }

        public void setLandscapeNameTextView(TextView landscapeNameTextView) {
            this.landscapeNameTextView = landscapeNameTextView;
        }

        public TextView getLandscapeDescTextView() {
            return landscapeDescTextView;
        }

        public void setLandscapeDescTextView(TextView landscapeDescTextView) {
            this.landscapeDescTextView = landscapeDescTextView;
        }
    }

}
