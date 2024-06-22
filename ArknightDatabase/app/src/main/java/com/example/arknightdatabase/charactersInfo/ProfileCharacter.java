package com.example.arknightdatabase.charactersInfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arknightdatabase.BaseActivity;
import com.example.arknightdatabase.R;
import com.example.arknightdatabase.charactersInfo.basicinfodatabase.genders.GenderDbHandler;
import com.example.arknightdatabase.charactersInfo.pfpdatabase.PfpDbHandler;

public class ProfileCharacter extends BaseActivity {

    String name;
    String Gender;
    int imageResourceId;
    String medicalReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_info);

        GenderDbHandler profile = new GenderDbHandler();
        PfpDbHandler pfp = new PfpDbHandler();


        ImageView back = findViewById(R.id.backButton);
        TextView nameTextView = findViewById(R.id.charactersName);
        TextView genderTextView = findViewById(R.id.Gender);
        ImageView characterImage = findViewById(R.id.characterImage);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

        Intent intent = getIntent();
        if (intent != null) {
            name = intent.getStringExtra("name");
            nameTextView.setText(name);
            // Comparing the name with a specific string using switch
            switch (name) {
                case "Texas":
                    Gender = profile.getTexasGender();
                    imageResourceId = pfp.getTexasPfp();
                    medicalReport = mr.getTexasMedicalReport();

                    break;
                case "Poncirus":
                    Gender = profile.getPoncirusGender();
                    imageResourceId = pfp.getPoncirusPfp();

                    break;
                case "Muelsyse":
                    Gender = profile.getMuelsyseGender();
                    imageResourceId = pfp.getMuelsysePfp();

                    break;
                default:
                    // Handle cases where name does not match any of the known values
                    Gender = "Unknown";
                    imageResourceId = 404;

                    break;
            }
            nameTextView.setText(Gender);
            characterImage.setImageResource(imageResourceId);
        } else {
            // Handle the case where intent is null
            name = "Unknown";
            nameTextView.setText(name);
            Gender = "Unknown";
            GenderTextView.setText(Gender);
            imageResourceId = 404;
            characterImage.setImageResource(imageResourceId);
        }

    }
}
