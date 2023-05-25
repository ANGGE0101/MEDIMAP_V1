package com.example.my_design_angge;

import static com.example.my_design_angge.R.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import com.example.my_design_angge.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, CreateLoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000); // 2000 milliseconds = 2 seconds
    }
}


