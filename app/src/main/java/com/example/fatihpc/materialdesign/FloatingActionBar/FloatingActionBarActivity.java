package com.example.fatihpc.materialdesign.FloatingActionBar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fatihpc.materialdesign.R;

public class FloatingActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_bar);
    }

    public void floatingActionBarPressed(View view) {
        Toast.makeText( this , "Floating ActionBar Is Pressed" , Toast.LENGTH_SHORT ).show();
    }

    public void showSimpleSnackBarButton(View view) {
        Snackbar.make( view , "This is a simple snackBar" , Snackbar.LENGTH_SHORT ).show();
    }

    public void showSnackBarWithAction(View view) {

        Snackbar snackbar = Snackbar.make( view , "Error" , Snackbar.LENGTH_SHORT );
        snackbar.setAction("Try Again", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make( view , "Success" , Snackbar.LENGTH_SHORT ).show();
            }
        });

        snackbar.show();
    }

}