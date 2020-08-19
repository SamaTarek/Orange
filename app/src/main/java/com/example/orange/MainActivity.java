package com.example.orange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.orange.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private Button location;
    private Button login;
    private Button sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        location = (Button) findViewById(R.id.locationbtn);
        login = (Button) findViewById(R.id.button1);
        sign_up = (Button) findViewById(R.id.button2);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLocActiv();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActiv();
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignActiv();
            }
        });


    }

    //@Override
    //public void onClick(View v) {
    public void openLocActiv() {
        Intent intent = new Intent(this, LocationActivity.class);
        startActivity(intent);
    }
    public void openLoginActiv() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void openSignActiv()
    {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

}

