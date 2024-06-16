package com.example.arknightdatabase.classes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arknightdatabase.characters.CharacterClickListener;
import com.example.arknightdatabase.characters.Characters;
import com.example.arknightdatabase.R;

public class Vanguard extends AppCompatActivity implements CharacterClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vanguard_list);

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
                onTexasClick();
            }
        });

        poncirus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPoncirusClick();
            }
        });

        muelsyse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMuelsyseClick();
            }
        });

        ines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onInesClick();
            }
        });

        puzzle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPuzzleClick();
            }
        });

        vigil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onVigilClick();
            }
        });
    }

    @Override
    public void onTexasClick() {
        Intent intent = new Intent(Vanguard.this, Characters.class);
        intent.putExtra("name", "Texas");
        startActivity(intent);
    }

    @Override
    public void onPoncirusClick() {
        Intent intent = new Intent(Vanguard.this, Characters.class);
        intent.putExtra("name", "Poncirus");
        startActivity(intent);
    }

    @Override
    public void onMuelsyseClick() {
        Intent intent = new Intent(Vanguard.this, Character.class);
        intent.putExtra("name", "Muelsyse");
        startActivity(intent);
    }

    @Override
    public void onInesClick() {
        Intent intent = new Intent(Vanguard.this, Character.class);
        intent.putExtra("name", "Ines");
        startActivity(intent);
    }

    @Override
    public void onPuzzleClick() {
        Intent intent = new Intent(Vanguard.this, Character.class);
        intent.putExtra("name", "Puzzle");
        startActivity(intent);
    }

    @Override
    public void onVigilClick() {
        Intent intent = new Intent(Vanguard.this, Character.class);
        intent.putExtra("name", "Vigil");
        startActivity(intent);
    }
}
