package com.weatherapplication;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import query.CityToCoord;

public class MainActivity extends AppCompatActivity {
    public String q;
    String city;

    EditText cityEnter;
    Button getButton;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityEnter = (EditText) findViewById(R.id.CityEnter);
        getButton = (Button) findViewById(R.id.getButton);
        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city = cityEnter.getText().toString();
                try {
                   q = CityToCoord.getData(city);
                } catch (Exception e) {
                    e.printStackTrace();
                }


                Intent intent = new Intent(MainActivity.this, WhenGotWeatherInfo.class);
                intent.putExtra("data", q);
                startActivity(intent);
            }
        });


    }
}