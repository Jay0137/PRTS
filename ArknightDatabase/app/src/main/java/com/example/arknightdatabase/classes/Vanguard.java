package com.example.arknightdatabase.classes;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arknightdatabase.characters.CharacterClickHandler;
import com.example.arknightdatabase.R;

public class Vanguard extends AppCompatActivity {

    private CharacterClickHandler clickHandler;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vanguard_list);

        // Initialize the click handler with the current context
        clickHandler = new CharacterClickHandler(this);

        // Hide the status bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        // Optional: If you want to hide the ActionBar as well
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView back = findViewById(R.id.backButton);
        ImageButton texas = findViewById(R.id.Texas);
        ImageButton poncirus = findViewById(R.id.Poncirus);
        ImageButton muelsyse = findViewById(R.id.Muelsyse);
        ImageButton ines = findViewById(R.id.Ines);
        ImageButton puzzle = findViewById(R.id.Puzzle);
        ImageButton vigil = findViewById(R.id.Vigil);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        texas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onTexasClick();
            }
        });

        poncirus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onPoncirusClick();
            }
        });

        muelsyse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onMuelsyseClick();
            }
        });

        ines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onInesClick();
            }
        });

        puzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onPuzzleClick();
            }
        });

        vigil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onVigilClick();
            }
        });
    }
}
