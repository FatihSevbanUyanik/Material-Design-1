package com.example.fatihpc.materialdesign.NavigationDrawer;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fatihpc.materialdesign.R;

public class FragmentNavigationDrawer extends Fragment {

    private ActionBarDrawerToggle actionBarDrawerToggle;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate( R.layout.fragment_navigation_drawer, container , false );
        return view;
    }

    public void setNavigationBar( DrawerLayout drawerLayout , Toolbar toolbar ){

        actionBarDrawerToggle = new ActionBarDrawerToggle( getActivity() ,
                drawerLayout , toolbar , R.string.drawer_opened , R.string.drawer_closed );

        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
                actionBarDrawerToggle.onDrawerSlide( drawerView , slideOffset );
            }
            @Override
            public void onDrawerOpened(@NonNull View drawerView) {}
            @Override
            public void onDrawerClosed(@NonNull View drawerView) {}
            @Override
            public void onDrawerStateChanged(int newState) {}
        });

        drawerLayout.post(new Runnable() {
            @Override
            public void run() {
                actionBarDrawerToggle.syncState();
            }
        });

        RecyclerView navigationDrawerRecycleView = view.findViewById( R.id.navigationDrawerRecyclerView );
        NavigationDrawerListAdapter navigationDrawerListAdapter =
                new NavigationDrawerListAdapter( getContext() , NavigationDrawerListData.getData() );
        navigationDrawerRecycleView.setAdapter( navigationDrawerListAdapter );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        navigationDrawerRecycleView.setLayoutManager(linearLayoutManager);

    }


}