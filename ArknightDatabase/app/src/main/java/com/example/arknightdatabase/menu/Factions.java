package com.example.arknightdatabase.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.arknightdatabase.BaseActivity;
import com.example.arknightdatabase.R;

public class Factions extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factions);


        ImageView back = findViewById(R.id.backButton);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

    }

}
