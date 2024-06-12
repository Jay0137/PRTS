package com.example.arknightdatabase;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SanityActivity extends AppCompatActivity {
    private int CurrentSanity;
    private int TotalSanity;
    // Total value of sanity the user has to make the input
    private int Countdown = 360;
    // standard time to recover 1 of sanity
    private int SanityRestore = 0;
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    // user input for current sanity
    public void setSanity(int input) {
        CurrentSanity = input;
    }
    // user input for total sanity
    public void setTotalSanity(int input) {
        TotalSanity = input;
    }
    public void differenceSanity() {


        if (CurrentSanity != TotalSanity) {
            SanityRestore = CurrentSanity - TotalSanity;
        }

        if (SanityRestore > 1) {
            int timer = SanityRestore * Countdown;
            while (timer <= 60) {
                seconds++;

                if (seconds == 60) {
                    minutes++;
                    seconds = 0;
                    timer = timer - 60;
                } if (minutes == 60) {
                    minutes = 0;
                    hours++;
                }
            }
            
            System.out.println("Time to recover " + SanityRestore + ": " + hours + ":" + minutes + ":" + seconds);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sanity_layout);

    }
}
