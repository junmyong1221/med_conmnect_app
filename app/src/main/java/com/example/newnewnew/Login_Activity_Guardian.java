package com.example.newnewnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity_Guardian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_guardian);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        Button loginButton = (Button)findViewById(R.id.loginButton);
        Button guardianregisterButton = (Button)findViewById(R.id.guardianregister);


        guardianregisterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(Login_Activity_Guardian.this, Login_Activity_GuardianRegister.class);
                Login_Activity_Guardian.this.startActivity(registerIntent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(true){
                    Intent registerIntent = new Intent(Login_Activity_Guardian.this, MainActivity.class);
                    Login_Activity_Guardian.this.startActivity(registerIntent);
                }
            }
        });
    }
}
