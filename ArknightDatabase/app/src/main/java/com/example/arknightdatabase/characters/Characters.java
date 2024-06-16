package com.example.arknightdatabase.characters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arknightdatabase.R;

public class Characters extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_info);

        // Hide the status bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        // Optional: If you want to hide the ActionBar as well
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView back = findViewById(R.id.backButton);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

        // Retrieve the intent that started this activity
        Intent intent = getIntent();
        if (intent != null) {
            // Get the string passed with the key "name"
            String name = intent.getStringExtra("name");

            // Use the name variable as needed
            // For example, you can set it to a TextView
            TextView nameTextView = findViewById(R.id.charactersName);
            nameTextView.setText(name);
        }

    }
}
