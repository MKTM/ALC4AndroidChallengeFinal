package com.example.alc4android;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

//app created for API level 24 and above
// written by Kennedy T.M Moranga for AlC 4.0 phase 1 android challenge


public class MainActivity extends AppCompatActivity {

//create a variable for each button
    private Button about_button;
    private Button profile_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//initialize the buttons and set click listener
        about_button = findViewById(R.id.about_button);
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityB();
            }

        });

        profile_button = findViewById(R.id.profile_button);
        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityC();
            }
        });

    }
    //method to open the various activities
    public void openActivityB() {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
    public void openActivityC(){
        Intent intent1 = new Intent(this, ActivityC.class);
        startActivity(intent1);
    }
}
