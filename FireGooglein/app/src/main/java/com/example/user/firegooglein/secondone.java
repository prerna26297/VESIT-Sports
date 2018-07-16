package com.example.user.firegooglein;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class secondone extends AppCompatActivity {
Button button;
FirebaseAuth mAuth;
FirebaseAuth.AuthStateListener mAuthListener;
@Override
protected void onStart()
{
    super.onStart();
    mAuth.addAuthStateListener(mAuthListener);

}

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondone);
    button = (Button) findViewById(R.id.button2);
    mAuth= FirebaseAuth.getInstance();
    mAuthListener=new FirebaseAuth.AuthStateListener() {
        @Override
        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
            if(firebaseAuth.getCurrentUser()== null)
            {
                startActivity(new Intent(secondone.this,MainActivity.class));
            }
        }
    };
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mAuth.signOut();
        }
    });


    }
}
