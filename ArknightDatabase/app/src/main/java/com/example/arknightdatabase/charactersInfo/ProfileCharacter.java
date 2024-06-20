package com.example.arknightdatabase.charactersInfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arknightdatabase.BaseActivity;
import com.example.arknightdatabase.R;
import com.example.arknightdatabase.charactersInfo.infoDatabase.BasicInfoDbHandler;
import com.example.arknightdatabase.charactersInfo.medicalreportdb.MedicalReportDbHandler;
import com.example.arknightdatabase.charactersInfo.medicalreportdb.MedicalReportDbListener;
import com.example.arknightdatabase.charactersInfo.pfpdatabase.PfpDbHandler;

public class ProfileCharacter extends BaseActivity {

    String name;
    String basicInfo;
    int imageResourceId;
    String medicalReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_info);

        BasicInfoDbHandler profile = new BasicInfoDbHandler();
        PfpDbHandler pfp = new PfpDbHandler();
        MedicalReportDbHandler mr = new MedicalReportDbHandler();

        ImageView back = findViewById(R.id.backButton);
        TextView nameTextView = findViewById(R.id.charactersName);
        TextView basicinfoTextView = findViewById(R.id.charactersInfo);
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
                    basicInfo = profile.getTexasBasicInfo();
                    imageResourceId = pfp.getTexasPfp();
                    medicalReport = mr.getTexasMedicalReport();

                    break;
                case "Poncirus":
                    basicInfo = profile.getPoncirusBasicInfo();
                    imageResourceId = pfp.getPoncirusPfp();

                    break;
                case "Muelsyse":
                    basicInfo = profile.getMuelsyseBasicInfo();
                    imageResourceId = pfp.getMuelsysePfp();

                    break;
                default:
                    // Handle cases where name does not match any of the known values
                    basicInfo = "Unknown";
                    imageResourceId = 404;

                    break;
            }
            basicinfoTextView.setText(basicInfo);
            characterImage.setImageResource(imageResourceId);
        } else {
            // Handle the case where intent is null
            name = "Unknown";
            nameTextView.setText(name);
            basicInfo = "Unknown";
            basicinfoTextView.setText(basicInfo);
            imageResourceId = 404;
            characterImage.setImageResource(imageResourceId);
        }

    }
}
