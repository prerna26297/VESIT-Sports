package com.example.acer.vesitsports;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VOLLEYBALL extends AppCompatActivity {

    TextView register1,bye1,fixtures;
    DatabaseReference rootRef,demoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabbadi);
        register1 = (TextView) findViewById(R.id.Register);
        bye1 = (TextView) findViewById(R.id.bye);
        fixtures = (TextView) findViewById(R.id.f_fix);
        fixtures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VOLLEYBALL.this,fixturevolley.class);
                startActivity(intent);
            }
        });

        //database reference pointing to root of database
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("demo");

        bye1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(VOLLEYBALL.this);

                // Setting Dialog Title
                alertDialog.setTitle("Confirm BYE");

                // Setting Dialog Message
                alertDialog.setMessage("Are you sure you want to give BYE?");

                // Setting Icon to Dialog
                //alertDialog.setIcon(R.drawable.delete);

                // Setting Positive "Yes" Button
                alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which) {

                        // Write your code here to invoke YES event
                        String classId= MainActivity.username.getText().toString();
                        String value= classId + " BYE FOR VOLLEYBALL";
                        //push creates a unique id in database
                        demoRef.push().setValue(value);
                        Toast.makeText(getApplicationContext(), "You have given BYE", Toast.LENGTH_SHORT).show();
                    }
                });

                // Setting Negative "NO" Button
                alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Write your code here to invoke NO event
                        Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });

                // Showing Alert Message
                alertDialog.show();


            }
        });

        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(VOLLEYBALL.this,playvolley.class);
                startActivity(intent2);
            }
        });
    }
}

