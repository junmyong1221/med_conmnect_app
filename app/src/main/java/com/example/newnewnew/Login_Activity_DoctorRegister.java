package com.example.newnewnew;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity_DoctorRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_doctorregister);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText hosptalnameText = (EditText) findViewById(R.id.hospitalnameText);
        EditText licensenumberText = (EditText) findViewById(R.id.licensenumberText);
        Button registerbutton = (Button) findViewById(R.id.registerButton);


    }
}
