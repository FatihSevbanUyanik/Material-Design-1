package com.example.fatihpc.materialdesign.FloatingLabelAndAuthentication;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.fatihpc.materialdesign.R;

public class FloatingLabelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_label);
    }

    public void authenticate(View view) {
        if ( authenticateUsername() && authenticatePassword() )
            Snackbar.make( view , "Authenticated" , Snackbar.LENGTH_SHORT ).show();
    }

    private boolean authenticateUsername()
    {
        TextInputLayout userNameInputLayout = findViewById( R.id.userNameInputLayout );
        EditText userNameEditText = findViewById( R.id.userNameEditText );
        String username = userNameEditText.getText().toString();

        if ( username.isEmpty() ){
            userNameInputLayout.setError( "Please enter Username" );
            return false;
        }

        else {
            userNameInputLayout.setErrorEnabled( false );
            return true;
        }
    }

    private boolean authenticatePassword()
    {
        TextInputLayout passwordInputLayout = findViewById( R.id.passwordInputLayout );
        EditText passwordEditText = findViewById( R.id.passwordEditText );
        String password = passwordEditText.getText().toString();

        if ( password.length() < 8 ) {
            passwordInputLayout.setError("Password should be bigger than 8 letters.");
            return false;
        }

        else {
            passwordInputLayout.setErrorEnabled( false );
            return true;
        }
    }

}