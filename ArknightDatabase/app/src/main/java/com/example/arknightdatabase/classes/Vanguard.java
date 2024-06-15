package com.example.arknightdatabase.classes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arknightdatabase.MainMenu;
import com.example.arknightdatabase.Materials;
import com.example.arknightdatabase.R;

public class Vanguard extends AppCompatActivity {

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


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

        texas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vanguard.this, Character.class);
                intent.putExtra("name", "Texas");
                startActivity(intent);

            }
        });
    }
}