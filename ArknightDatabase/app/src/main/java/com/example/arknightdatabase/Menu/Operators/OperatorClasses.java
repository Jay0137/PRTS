package com.example.arknightdatabase.Menu.Operators;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arknightdatabase.MainMenuClickHandler;
import com.example.arknightdatabase.R;
import com.example.arknightdatabase.classes.Guard;
import com.example.arknightdatabase.classes.Vanguard;
import com.example.arknightdatabase.classes.Sniper;
import com.example.arknightdatabase.classes.Caster;
import com.example.arknightdatabase.classes.Medic;
import com.example.arknightdatabase.classes.Defender;
import com.example.arknightdatabase.classes.Supporter;
import com.example.arknightdatabase.classes.Specialist;

public class OperatorClasses extends AppCompatActivity {

    private OperatorClassesClickHandler clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classes);

        clickHandler = new OperatorClassesClickHandler(this);

        // Hide the status bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        // Optional: If you want to hide the ActionBar as well
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView back = findViewById(R.id.backButton);
        ImageButton vanguard = findViewById(R.id.Vanguard);
        ImageButton guard = findViewById(R.id.Guard);
        ImageButton sniper = findViewById(R.id.Sniper);
        ImageButton caster = findViewById(R.id.Caster);
        ImageButton medic = findViewById(R.id.Medic);
        ImageButton defender = findViewById(R.id.Defender);
        ImageButton supporter = findViewById(R.id.Supporter);
        ImageButton specialist = findViewById(R.id.Specialist);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

        vanguard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onVanguardClick();
            }
        });

        guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onGuardClick();
            }
        });

        sniper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onSniperClick();
            }
        });

        caster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onCasterClick();
            }
        });

        medic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onMedicClick();
            }
        });

        defender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onDefenderClick();
            }
        });

        supporter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onSupporterClick();
            }
        });

        specialist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler.onSpecialistClick();
                }
        });
    }
}
