package com.weatherapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WhenGotWeatherInfo extends AppCompatActivity {

    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_when_got_weather_info);

        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            data = extras.getString("data");
        }

        //TextView mainInf = (TextView) findViewById(R.id.MainWeather);
        //mainInf.setText(data);

    }
}