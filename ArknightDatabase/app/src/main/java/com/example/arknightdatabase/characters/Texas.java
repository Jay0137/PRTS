package com.example.arknightdatabase.characters;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arknightdatabase.R;

public class Texas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view);

        ImageView charactersView = findViewById(R.id.charactersView);
        // You can now use charactersView to set image resource, etc.
        charactersView.setImageResource(R.mipmap.bt);
    }
}
