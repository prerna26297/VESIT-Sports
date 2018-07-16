package com.example.acer.vesitsports;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Outdoor extends AppCompatActivity {

    TextView football,volleyball,kabbadi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor);
        football=(TextView)findViewById(R.id.football);
        volleyball=(TextView)findViewById(R.id.volleyball);
        kabbadi=(TextView)findViewById(R.id.kabaddi);

        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf=new Intent(Outdoor.this,Football.class);
                startActivity(intentf);
            }
        });

        volleyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentv=new Intent(Outdoor.this,VOLLEYBALL.class);
                startActivity(intentv);
            }
        });


        kabbadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentk=new Intent(Outdoor.this,KABBADI.class);
                startActivity(intentk);
            }
        });



    }
}
