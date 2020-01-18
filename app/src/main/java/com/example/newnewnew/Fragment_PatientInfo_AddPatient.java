package com.example.newnewnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Fragment_PatientInfo_AddPatient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_patientinfo_addpatient);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        radioGroup.check(R.id.checkmale);

        Button savedata = (Button) findViewById(R.id.btn_add);
        savedata.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();

                EditText patientname = (EditText)findViewById(R.id.patient_name);
                EditText patientrelationship = (EditText)findViewById(R.id.patient_relationship);
                EditText patientphonenumber = (EditText)findViewById(R.id.patient_phonenumber);
                EditText patientage = (EditText)findViewById(R.id.patient_age);

                String gender;
                RadioButton maleoption = (RadioButton)findViewById(R.id.checkmale);
                RadioButton femaleoption = (RadioButton)findViewById(R.id.checkfemale);
                if(maleoption.isChecked()){
                    gender = "Male";
                }
                else{
                    gender = "Female";
                }
                intent.putExtra("patient_name", patientname.getText().toString());
                intent.putExtra("patient_relationship", patientrelationship.getText().toString());
                intent.putExtra("patient_phonenumber", patientphonenumber.getText().toString());
                intent.putExtra("patient_age", patientage.getText().toString());
                intent.putExtra("patient_gender", gender);
                setResult(1, intent);
                finish();
            }
        });
    }
}
