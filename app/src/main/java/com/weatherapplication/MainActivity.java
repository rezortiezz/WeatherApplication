package com.weatherapplication;

import android.os.Bundle;



import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.weatherapplication.databinding.ActivityMainBinding;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;

import parse.Parse;
import query.Query;

public class MainActivity extends AppCompatActivity {

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
                String response = Query.makeQuery(city);

                Intent intent = new Intent(MainActivity.this, WhenGotWeatherInfo.class);
                startActivity(intent);
            }
        });


    }
}