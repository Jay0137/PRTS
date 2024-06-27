package com.example.arknightdatabase.charactersInfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arknightdatabase.BaseActivity;
import com.example.arknightdatabase.R;
import com.example.arknightdatabase.charactersInfo.basicinfodatabase.Height.HeightDbHandler;
import com.example.arknightdatabase.charactersInfo.basicinfodatabase.birthplace.BirthPlaceDbHandler;
import com.example.arknightdatabase.charactersInfo.basicinfodatabase.dateofbirth.DateOfBirthDbHandler;
import com.example.arknightdatabase.charactersInfo.basicinfodatabase.experience.ExperienceDbHandler;
import com.example.arknightdatabase.charactersInfo.basicinfodatabase.genders.GenderDbHandler;
import com.example.arknightdatabase.charactersInfo.basicinfodatabase.infectedstatus.InfectedStatusDbHandler;
import com.example.arknightdatabase.charactersInfo.basicinfodatabase.race.RaceDbHandler;
import com.example.arknightdatabase.charactersInfo.groupdatabase.GroupDbHandler;
import com.example.arknightdatabase.charactersInfo.nationdatabase.NationDbHandler;
import com.example.arknightdatabase.charactersInfo.pfpdatabase.PfpDbHandler;
import com.example.arknightdatabase.charactersInfo.physicalexam.arts.ArtsAdaptabilityHandler;
import com.example.arknightdatabase.charactersInfo.physicalexam.combatskill.CombatSkillHandler;
import com.example.arknightdatabase.charactersInfo.physicalexam.endurance.EnduranceHandler;
import com.example.arknightdatabase.charactersInfo.physicalexam.mobility.MobilityHandler;
import com.example.arknightdatabase.charactersInfo.physicalexam.strength.StrengthHandler;
import com.example.arknightdatabase.charactersInfo.physicalexam.tacticalacumen.TacticalAcumenHandler;

public class ProfileCharacter extends BaseActivity {

    int imageResourceId;
    String name;
    //basic info
    String gender;
    String birthday;
    String height;
    String birthplace;
    String race;
    String combatExperience;
    String infectionStatus;
    //physical examination
    String strength;
    String mobility;
    String endurance;
    String acum;
    String skill;
    String arts;
    //nation and group
    String nation;
    String group;
    String error = "Unknown";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_data);

        // basic info
        GenderDbHandler mf = new GenderDbHandler();
        PfpDbHandler pfp = new PfpDbHandler();
        BirthPlaceDbHandler bpd = new BirthPlaceDbHandler();
        DateOfBirthDbHandler btd = new DateOfBirthDbHandler();
        RaceDbHandler rd = new RaceDbHandler();
        HeightDbHandler hd = new HeightDbHandler();
        ExperienceDbHandler cpd = new ExperienceDbHandler();
        InfectedStatusDbHandler isd = new InfectedStatusDbHandler();

        // physical examination
        StrengthHandler sh = new StrengthHandler();
        MobilityHandler mh = new MobilityHandler();
        EnduranceHandler eh = new EnduranceHandler();
        TacticalAcumenHandler tah = new TacticalAcumenHandler();
        CombatSkillHandler ch = new CombatSkillHandler();
        ArtsAdaptabilityHandler aa = new ArtsAdaptabilityHandler();

        // group and nation
        NationDbHandler nd = new NationDbHandler();
        GroupDbHandler gd = new GroupDbHandler();


        ImageView back = findViewById(R.id.backButton);

        //from database
        ImageView characterImage = findViewById(R.id.characterImage);
        TextView nameTextView = findViewById(R.id.charactersName);
        //basic info
        TextView genderTextView = findViewById(R.id.Gender);
        TextView birthplaceTextView = findViewById(R.id.BirthPlace);
        TextView birthdayTextView = findViewById(R.id.BirthDay);
        TextView raceTextView = findViewById(R.id.Race);
        TextView heightTextView = findViewById(R.id.Height);
        TextView combatExperienceTextView = findViewById(R.id.CombatExperience);
        TextView infectionStatusTextView = findViewById(R.id.InfectionStatus);
        //physical examination
        TextView strengthTextView = findViewById(R.id.Strength);
        TextView mobilityTextView = findViewById(R.id.Mobility);
        TextView enduranceTextView = findViewById(R.id.Endurance);
        TextView tacticalAcumenTextView = findViewById(R.id.TacticalAcumen);
        TextView combatSkillTextView = findViewById(R.id.CombatSkill);
        TextView artsTextView = findViewById(R.id.ArtsAdaptability);
        //group and nation
        TextView nationTextView = findViewById(R.id.Nation);
        TextView groupTextView = findViewById(R.id.Group);



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
                    // basic info
                    gender = mf.getTexasGender();
                    imageResourceId = pfp.getTexasPfp();
                    birthplace = bpd.onTexasBirthPlace();
                    birthday = btd.onTexasBirthday();
                    race = rd.onTexasRace();
                    height = hd.onTexasHeight();
                    combatExperience = cpd.onTexasExperience();
                    infectionStatus = isd.onTexasStatus();
                    //physical examination
                    strength = sh.onTexasStrength();
                    mobility = mh.onTexasMobility();
                    endurance = eh.onTexasEndurance();
                    acum = tah.onTexasAcumen();
                    skill = ch.onTexasSkill();
                    arts = aa.onTexasArts();
                    //nation and group
                    nation = nd.getTexasNation();
                    group = gd.getTexasGroup();


                    break;
                case "Poncirus":
                    gender = mf.getPoncirusGender();
                    imageResourceId = pfp.getPoncirusPfp();

                    break;
                case "Muelsyse":
                    gender = mf.getMuelsyseGender();
                    imageResourceId = pfp.getMuelsysePfp();

                    break;
                default:
                    // Handle cases where name does not match any of the known values
                    gender = "Unknown";
                    imageResourceId = 404;

                    break;
            }

            nameTextView.setText(name);
            // basic info
            genderTextView.setText(gender);
            birthplaceTextView.setText(birthplace);
            birthdayTextView.setText(birthday);
            raceTextView.setText(race);
            heightTextView.setText(height);
            combatExperienceTextView.setText(combatExperience);
            infectionStatusTextView.setText(infectionStatus);
            // physical examination
            strengthTextView.setText(strength);
            mobilityTextView.setText(mobility);
            enduranceTextView.setText(endurance);
            tacticalAcumenTextView.setText(acum);
            combatSkillTextView.setText(skill);
            artsTextView.setText(arts);
            // group and nation
            nationTextView.setText(nation);
            groupTextView.setText(group);
            //image
            characterImage.setImageResource(imageResourceId);
        } else {

            // Handle the case where the intent is null
            nameTextView.setText(error);
            // basic info
            genderTextView.setText(error);
            birthdayTextView.setText(error);
            raceTextView.setText(error);
            heightTextView.setText(error);
            combatExperienceTextView.setText(error);
            infectionStatusTextView.setText(error);
            // physical examination
            strengthTextView.setText(error);
            mobilityTextView.setText(error);
            enduranceTextView.setText(error);
            tacticalAcumenTextView.setText(error);
            combatSkillTextView.setText(error);
            artsTextView.setText(error);
            // group and nation
            nationTextView.setText(error);
            groupTextView.setText(error);
            //image
            imageResourceId = 404;
            characterImage.setImageResource(imageResourceId);
        }

    }
}
