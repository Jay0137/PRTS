package com.example.arknightdatabase.Menu.Operators;

import android.content.Context;
import android.content.Intent;

import androidx.core.content.ContextCompat;

import com.example.arknightdatabase.classes.Caster;
import com.example.arknightdatabase.classes.Defender;
import com.example.arknightdatabase.classes.Guard;
import com.example.arknightdatabase.classes.Medic;
import com.example.arknightdatabase.classes.Sniper;
import com.example.arknightdatabase.classes.Specialist;
import com.example.arknightdatabase.classes.Supporter;
import com.example.arknightdatabase.classes.Vanguard;

public class OperatorClassesClickHandler implements OperatorClassesClickListener {

    private Context context;

    public OperatorClassesClickHandler(Context context) {
        this.context = context;
    }

    @Override
    public void onVanguardClick() {
        Intent intent = new Intent(context, Vanguard.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onGuardClick() {
        Intent intent = new Intent(context, Guard.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onSniperClick() {
        Intent intent = new Intent(context, Sniper.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onCasterClick() {
        Intent intent = new Intent(context, Caster.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onMedicClick() {
        Intent intent = new Intent(context, Medic.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onDefenderClick() {
        Intent intent = new Intent(context, Defender.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onSupporterClick() {
        Intent intent = new Intent(context, Supporter.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onSpecialistClick() {
        Intent intent = new Intent(context, Specialist.class);
        ContextCompat.startActivity(context, intent, null);
    }
}
