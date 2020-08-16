package com.example.orange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        location =(Button)findViewById(R.id.locationbtn);



    }

    @Override
    public void onClick(View v) {
        if(v==location)
            startActivity(new Intent(this, LocationActivity.class));
    }

    }

