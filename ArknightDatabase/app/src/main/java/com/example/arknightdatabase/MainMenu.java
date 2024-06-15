package com.example.arknightdatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        // Hide the status bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        // Optional: If you want to hide the ActionBar as well
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageButton sanity = findViewById(R.id.Sanity);
        ImageButton operators = findViewById(R.id.Operators);
        ImageButton materials = findViewById(R.id.Materials);
        ImageButton outfits = findViewById(R.id.Outfits);
        ImageButton factions = findViewById(R.id.Factions);
        ImageButton enemies = findViewById(R.id.Enemies);
        ImageButton recruit = findViewById(R.id.Recruit);
        ImageButton headhunt = findViewById(R.id.Headhunt);

        sanity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Sanity.class);
                startActivity(intent);
            }
        });

        operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, OperatorClasses.class);
                startActivity(intent);
            }
        });

        materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Materials.class);
                startActivity(intent);
            }
        });

        outfits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Outfits.class);
                startActivity(intent);
            }
        });

        factions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Factions.class);
                startActivity(intent);
            }
        });

        enemies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Enemies.class);
                startActivity(intent);
            }
        });

        recruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Recruit.class);
                startActivity(intent);
            }
        });

        headhunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Headhunt.class);
                startActivity(intent);
            }
        });
    }
}
