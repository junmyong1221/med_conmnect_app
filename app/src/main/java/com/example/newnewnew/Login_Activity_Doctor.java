package com.example.newnewnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity_Doctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_doctor);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        Button loginButton = (Button)findViewById(R.id.loginButton);
        Button doctorregisterButton = (Button)findViewById(R.id.doctorregister);

        doctorregisterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(Login_Activity_Doctor.this, Login_Activity_DoctorRegister.class);
                Login_Activity_Doctor.this.startActivity(registerIntent);
            }
        });


        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(true){
                    Intent registerIntent = new Intent(Login_Activity_Doctor.this, MainActivity.class);
                    Login_Activity_Doctor.this.startActivity(registerIntent);
                }
            }
        });



    }
}
