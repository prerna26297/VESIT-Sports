package com.example.acer.vesitsports;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static   EditText username, password;
    //TextView attempt;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        LoginButton();
    }

    public void LoginButton() {


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (    username.getText().toString().equals("D6") && password.getText().toString().equals("D6@6")
                        || username.getText().toString().equals("D7") && password.getText().toString().equals("D7@7")
                        || username.getText().toString().equals("D7C") && password.getText().toString().equals("D7C@7C")
                        || username.getText().toString().equals("D8") && password.getText().toString().equals("D8@8")
                        || username.getText().toString().equals("D9") && password.getText().toString().equals("D9@9")
                        || username.getText().toString().equals("D9C") && password.getText().toString().equals("D9C@9C")
                        || username.getText().toString().equals("D10") && password.getText().toString().equals("D10@1")
                        || username.getText().toString().equals("D11") && password.getText().toString().equals("D11@2")
                        || username.getText().toString().equals("D12") && password.getText().toString().equals("D12@3")
                           || username.getText().toString().equals("D12C") && password.getText().toString().equals("D12C@3C")
                        || username.getText().toString().equals("D13") && password.getText().toString().equals("D13@4")
                        || username.getText().toString().equals("D14") && password.getText().toString().equals("D14@5")
                        || username.getText().toString().equals("D14C") && password.getText().toString().equals("D14C@5C")
                        || username.getText().toString().equals("D15") && password.getText().toString().equals("D15@6")
                        || username.getText().toString().equals("D16") && password.getText().toString().equals("D16@7")
                        || username.getText().toString().equals("D17") && password.getText().toString().equals("D17@8")
                        || username.getText().toString().equals("D17C") && password.getText().toString().equals("D17C@8C")
                        || username.getText().toString().equals("D18") && password.getText().toString().equals("D18@9")
                        || username.getText().toString().equals("D19") && password.getText().toString().equals("D19@10")
                        || username.getText().toString().equals("D19C") && password.getText().toString().equals("D19C@10C")
                        || username.getText().toString().equals("D20") && password.getText().toString().equals("D20@2")
                        || username.getText().toString().equals("MCA2A") && password.getText().toString().equals("MCA2A@1")
                        || username.getText().toString().equals("MCA2B") && password.getText().toString().equals("MCA2B@2")
                        || username.getText().toString().equals("MCA3A") && password.getText().toString().equals("MCA3A@1")
                        || username.getText().toString().equals("MCA3B") && password.getText().toString().equals("MCA3B@2")) {

                    Toast.makeText(getApplicationContext(), "Login successful",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, User.class);
                    MainActivity.this.startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Incorrect credentials",
                            Toast.LENGTH_SHORT).show();

                }
            }

        });

    }

}

