package com.example.arknightdatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    private MainMenuClickHandler clickHandler;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        // Initialize the click handler with the current context
        clickHandler = new MainMenuClickHandler(this);

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
                clickHandler.onSanityClick();
            }
        });

        operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onOperatorsClick();
            }
        });

        materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               clickHandler.onMaterialsClick();
            }
        });

        outfits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              clickHandler.onOutfitsClick();
            }
        });

        factions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onFactionsClick();
            }
        });

        enemies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onEnemiesClick();
            }
        });

        recruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onRecruitClick();
            }
        });

        headhunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onHeadhuntClick();
            }
        });
    }
}
