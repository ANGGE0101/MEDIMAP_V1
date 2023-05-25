package com.example.my_design_angge;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.view.View;

public class CreateLoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_login);

        // Find the button in your layout
        Button createButton = findViewById(R.id.button);

        // Set a click listener for the button
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When clicked, start CreateActivity
                Intent intent = new Intent(CreateLoginActivity.this, CreateActivity.class);
                startActivity(intent);
            }
        });

        // Find the second button in your layout
        Button loginButton = findViewById(R.id.button2);

        // Set a click listener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When clicked, start LoginActivity
                Intent intent = new Intent(CreateLoginActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
