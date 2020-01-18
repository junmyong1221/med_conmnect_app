package com.example.newnewnew;

import android.graphics.drawable.Drawable;

public class Patient_Info {
    private Drawable iconDrawable;
    private String name;
    private String relationship;
    private String phonenumber;
    private String age;
    private String gender;


    public Drawable getIcon(){
        return iconDrawable;
    }
    public String getname(){
        return name;
    }
    public String getrelationship(){
        return relationship;
    }
    public String getphonenumber(){
        return phonenumber;
    }
    public String getage(){
        return age;
    }
    public String getgender(){
        return gender;
    }


    public void setIcon(Drawable icon){
        this.iconDrawable = icon;
    };
    public void setname(String name){
        this.name = name;
    }
    public void setrelationship(String relationship){
        this.relationship = relationship;
    }
    public void setphonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    public void setage(String age){
        this.age = age;
    }
    public void setgender(String gender){
        this.gender = gender;
    }
}
