package com.example.newnewnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    JSONObject obj = new JSONObject();
    JSONArray jArray = new JSONArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addpatient = (Button)findViewById(R.id.addpatient);

        addpatient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(MainActivity.this, Fragment_PatientInfo_AddPatient.class);
                startActivityForResult(registerIntent, 1);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
        if(requestCode == 1){
            if(resultCode == 1){
                ArrayList<Patient_Info> patientlist = new ArrayList<Patient_Info>();
                try {
                    JSONObject sObject = new JSONObject();
                    sObject.put("patientname", intent.getStringExtra("patient_name"));
                    sObject.put("patientrelationship", intent.getStringExtra("patient_relationship"));
                    sObject.put("patientphonenumber", intent.getStringExtra("patient_phonenumber"));
                    sObject.put("patientage", intent.getStringExtra("patient_age"));
                    sObject.put("patientgender", intent.getStringExtra("patient_gender"));
                    jArray.put(sObject);
                    obj.put("item", jArray);


                    //JSON 파싱 과정
                    JSONArray patientarray = obj.getJSONArray("item");
                    for (int i = 0; i < patientarray.length(); i++) {
                        JSONObject patientobject = patientarray.getJSONObject(i);
                        Patient_Info thispatient = new Patient_Info();
                        thispatient.setname(patientobject.getString("patientname"));
                        thispatient.setrelationship(patientobject.getString("patientrelationship"));
                        thispatient.setphonenumber(patientobject.getString("patientphonenumber"));
                        thispatient.setage(patientobject.getString("patientage"));
                        thispatient.setgender(patientobject.getString("patientgender"));
                        patientlist.add(thispatient);
                    }


                }catch(JSONException e){
                    e.printStackTrace();
                }

                ListView listview;
                Fragment_PatientInfo_listadapter adapter;
                adapter = new Fragment_PatientInfo_listadapter();
                listview = (ListView)findViewById(R.id.patientlist);
                listview.setAdapter(adapter);

                System.out.println(patientlist.get(0).getrelationship());
                for(int i = 0; i < patientlist.size(); i++) {
                    adapter.addItem(ContextCompat.getDrawable(this, R.drawable.icon_person), patientlist.get(i).getrelationship(), patientlist.get(i).getname(), patientlist.get(i).getage());
                }

            }
        }
    }
}
