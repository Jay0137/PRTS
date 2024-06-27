package com.example.arknightdatabase.Operators;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.arknightdatabase.BaseActivity;
import com.example.arknightdatabase.R;

public class OperatorClasses extends BaseActivity {

    private OperatorClassesClickHandler clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classes);

        clickHandler = new OperatorClassesClickHandler(this);


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
