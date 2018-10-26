package com.example.fatihpc.materialdesign.RecyclerViewLandscape;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.fatihpc.materialdesign.NavigationDrawer.FragmentNavigationDrawer;
import com.example.fatihpc.materialdesign.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setRecyclerView();
        setToolbar();
        setNavigationDrawer();
    }

    private void setToolbar() {
        toolbar = findViewById( R.id.include );
        setSupportActionBar( toolbar );
    }

    private void setNavigationDrawer() {
        DrawerLayout drawerLayout = findViewById( R.id.recyclerViewActivityDrawerLayout );

        FragmentNavigationDrawer fragmentNavigationDrawer = (FragmentNavigationDrawer) getFragmentManager().
                findFragmentById(R.id.recyclerViewActivityNavigationDrawerFragment);

        fragmentNavigationDrawer.setNavigationBar( drawerLayout , toolbar );
    }

    private void setRecyclerView()
    {
        RecyclerView recyclerView = findViewById( R.id.landscapeRecyclerView );
        LandscapeAdapter landscapeAdapter = new LandscapeAdapter
                ( this , LandscapeListData.getData() );

        recyclerView.setAdapter( landscapeAdapter );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

}