package com.example.arknightdatabase;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Sanity extends BaseActivity {
    private int currentSanity;
    private int totalSanity;
    private final int Countdown = 360; // standard time to recover 1 sanity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sanity_layout);



        EditText totalSanityText = findViewById(R.id.totalSanityText);
        EditText currentSanityText = findViewById(R.id.currentSanityText);
        Button analyzer = findViewById(R.id.analyzerButton);
        TextView resultTextView = findViewById(R.id.resultTextView);
        ImageView back = findViewById(R.id.backButton);

        // Set input filter to limit the EditText fields to 3 digits
        InputFilter[] filters = new InputFilter[]{new InputFilter.LengthFilter(3)};
        totalSanityText.setFilters(filters);
        currentSanityText.setFilters(filters);

        analyzer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentSanityStr = currentSanityText.getText().toString().trim();
                String totalSanityStr = totalSanityText.getText().toString().trim();

                if (currentSanityStr.isEmpty()) {
                    currentSanityStr = "0";
                }
                if (totalSanityStr.isEmpty()) {
                    totalSanityStr = "0";
                }


                currentSanity = Integer.parseInt(currentSanityStr);
                totalSanity = Integer.parseInt(totalSanityStr);

                if (currentSanity >= totalSanity) {
                    resultTextView.setText("Current sanity is the same or above total sanity.");
                } else {
                    String result = analyzeDifference(currentSanity, totalSanity);
                    resultTextView.setText(result);
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });


    }

    private String analyzeDifference(int currentSanity, int totalSanity) {
        int sanityRestore = totalSanity - currentSanity; // Calculate how much sanity to restore
        if (sanityRestore > 0) {
            int totalSeconds = sanityRestore * Countdown;
            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;
            return "Time to recover " + sanityRestore + " sanity: " + hours + "h " + minutes + "m " + seconds + "s";
        } else {
            return "No sanity needs to be restored.";
        }
    }
}
