package com.example.acer.vesitsports;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class User extends AppCompatActivity {
    TextView inSphurti, outSphurti, textOnUserScreen;

    //String[] sphurti= {"Indoor Sphurti", "Outdoor Sphurti"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        inSphurti= (TextView)findViewById(R.id.in_sphurti);
        outSphurti= (TextView)findViewById(R.id.out_sphurti);
        textOnUserScreen=(TextView)findViewById(R.id.UserScreenText);
        textOnUserScreen.setTypeface(Typeface.DEFAULT_BOLD);
        //textOnUserScreen.setTextSize(15);
        textOnUserScreen.setText("Sports council conducts the following events every year :");
        Sports();


    }

    public void Sports()
    {
        inSphurti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(User.this, Indoor.class);
                User.this.startActivity(intent1);

            }
        });

        outSphurti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(User.this, Outdoor.class);
                User.this.startActivity(intent2);

            }
        });

    }
}
