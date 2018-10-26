package com.example.fatihpc.materialdesign.TweenAnimations;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.fatihpc.materialdesign.NavigationDrawer.FragmentNavigationDrawer;
import com.example.fatihpc.materialdesign.R;

public class TweenAnimationsActivity extends AppCompatActivity implements Animation.AnimationListener {

    // properties
    private Toolbar toolbar;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animations);

        setToolbar();
        setNavigationDrawer();
        imageView = findViewById( R.id.ball );
    }

    private void setToolbar() {
        toolbar = findViewById( R.id.include3 );
        setSupportActionBar( toolbar );
    }


    private void setNavigationDrawer() {
        DrawerLayout drawerLayout = findViewById( R.id.tweenAnimationsActivityDrawerLayout );

        FragmentNavigationDrawer fragmentNavigationDrawer = (FragmentNavigationDrawer) getFragmentManager().
                findFragmentById(R.id.tweenAnimationsActivityNavigationDrawerFragment);

        fragmentNavigationDrawer.setNavigationBar( drawerLayout , toolbar );
    }


    public void fadeAnimation(View view){
        Animation fadeAnimation = AnimationUtils.loadAnimation( this , R.anim.anim_alpha );
        fadeAnimation.setAnimationListener( this );
        imageView.startAnimation( fadeAnimation );
    }

    public void translationAnimation(View view){
        Animation translationAnimation = AnimationUtils.loadAnimation( this , R.anim.anim_translation );
        translationAnimation.setAnimationListener( this );
        imageView.startAnimation( translationAnimation );
    }

    public void rotationAnimation(View view){
        Animation rotationAnimation = AnimationUtils.loadAnimation( this , R.anim.anim_rotation );
        rotationAnimation.setAnimationListener( this );
        imageView.startAnimation( rotationAnimation );
    }

    public void scaleAnimation(View view){
        Animation scaleAnimation = AnimationUtils.loadAnimation( this , R.anim.anim_scale );
        scaleAnimation.setAnimationListener( this );
        imageView.startAnimation( scaleAnimation );
    }

    @Override
    public void onAnimationStart(Animation animation) {
        Toast.makeText( this , "Animation started." , Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText( this , "Animation ended." , Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText( this , "Animation repeated." , Toast.LENGTH_SHORT ).show();
    }
}