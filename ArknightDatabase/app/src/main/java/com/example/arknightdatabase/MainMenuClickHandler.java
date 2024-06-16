package com.example.arknightdatabase;

import android.content.Context;
import android.content.Intent;

import androidx.core.content.ContextCompat;

import com.example.arknightdatabase.Menu.Enemies;
import com.example.arknightdatabase.Menu.Factions;
import com.example.arknightdatabase.Menu.Headhunt;
import com.example.arknightdatabase.Menu.Materials;
import com.example.arknightdatabase.Menu.Operators.OperatorClasses;
import com.example.arknightdatabase.Menu.Outfits;
import com.example.arknightdatabase.Menu.Recruit;
import com.example.arknightdatabase.Menu.Sanity;

public class MainMenuClickHandler implements MainMenuClickListener {

    private Context context;

    public MainMenuClickHandler(Context context) {
        this.context = context;
    }

    @Override
    public void onSanityClick() {
        Intent intent = new Intent(context, Sanity.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onOperatorsClick() {
        Intent intent = new Intent(context, OperatorClasses.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onMaterialsClick() {
        Intent intent = new Intent(context, Materials.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onOutfitsClick() {
        Intent intent = new Intent(context, Outfits.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onFactionsClick() {
        Intent intent = new Intent(context, Factions.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onEnemiesClick() {
        Intent intent = new Intent(context, Enemies.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onRecruitClick() {
        Intent intent = new Intent(context, Recruit.class);
        ContextCompat.startActivity(context, intent, null);
    }

    @Override
    public void onHeadhuntClick() {
        Intent intent = new Intent(context, Headhunt.class);
        ContextCompat.startActivity(context, intent, null);
    }
}
