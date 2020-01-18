package com.example.newnewnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity_Starting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_starting);

        Button doctormember = (Button)findViewById(R.id.doctormember);
        Button guardianmember = (Button)findViewById(R.id.guardianmember);

        doctormember.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent1 = new Intent(Login_Activity_Starting.this, Login_Activity_Doctor.class);
                Login_Activity_Starting.this.startActivity(registerIntent1);
            }
        });

        guardianmember.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent2 = new Intent(Login_Activity_Starting.this, Login_Activity_Guardian.class);
                Login_Activity_Starting.this.startActivity(registerIntent2);
            }
        });
    }
}
