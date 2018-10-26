package com.example.fatihpc.materialdesign.Main;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.fatihpc.materialdesign.FloatingActionBar.FloatingActionBarActivity;
import com.example.fatihpc.materialdesign.FloatingLabelAndAuthentication.FloatingLabelActivity;
import com.example.fatihpc.materialdesign.NavigationDrawer.FragmentNavigationDrawer;
import com.example.fatihpc.materialdesign.R;
import com.example.fatihpc.materialdesign.RecyclerViewLandscape.RecyclerViewActivity;
import com.example.fatihpc.materialdesign.TweenAnimations.TweenAnimationsActivity;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        setNavigationDrawer();
    }

    private void setToolbar() {
        toolbar = findViewById( R.id.include2 );
        setSupportActionBar( toolbar );
    }

    private void setNavigationDrawer() {
        DrawerLayout drawerLayout = findViewById( R.id.mainActivityNavigationDrawerLayout );

        FragmentNavigationDrawer fragmentNavigationDrawer = (FragmentNavigationDrawer) getFragmentManager().
                findFragmentById(R.id.mainActivityNavigationDrawerFragment);

        fragmentNavigationDrawer.setNavigationBar( drawerLayout , toolbar );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu_main , menu );
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if ( item.getItemId() == R.id.recyclerView ) {
            Intent intent = new Intent( this , RecyclerViewActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.tweenAnimations  ) {
            Intent intent = new Intent( this , TweenAnimationsActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.floatingActionBar ) {
            Intent intent = new Intent( this , FloatingActionBarActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.floatingLabelAndAuthentication ) {
            Intent intent = new Intent( this , FloatingLabelActivity.class );
            startActivity( intent );
        }

        return super.onOptionsItemSelected(item);
    }
}
