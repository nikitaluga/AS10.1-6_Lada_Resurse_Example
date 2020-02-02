package com.example.ladaresurceexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }

    public void onChooseCarActivity(View view) {
        Spinner spinnerCar = findViewById(R.id.spinner);
        String chooseCar = String.valueOf(spinnerCar.getSelectedItem());
        if (chooseCar.equals("Granta")){
            Intent intentGranta = new Intent(this,LadaGrantaActivity.class);
            startActivity(intentGranta);
        } else if (chooseCar.equals("Priora")){
            Intent intentPriora = new Intent(this, LadaPrioraActivity.class);
            startActivity(intentPriora);
        } else if (chooseCar.equals("Vesta")){
            Intent intentVesta = new Intent(this, LadaVestaActivity.class);
            startActivity(intentVesta);
        }
    }
}
