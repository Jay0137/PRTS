package com.example.arknightdatabase;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

  /*  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton sanity = findViewById(R.id.Sanity);
        ImageButton character = findViewById(R.id.Characters);

        sanity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SanityActivity.class);
                startActivity(intent);
            }
        });

        character.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CharactersActivity.class);
                startActivity(intent);
            }
        });
    }
*/
}
