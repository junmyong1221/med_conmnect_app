package com.example.newnewnew;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Fragment_PatientInfo_listadapter extends BaseAdapter {
    private ArrayList<Patient_Info> listViewItemList = new ArrayList<Patient_Info>();

    public Fragment_PatientInfo_listadapter(){
    }

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fragment_patientinfo_listitem, parent, false);
        }

        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.iconitem);
        TextView patientRelationship = (TextView) convertView.findViewById(R.id.dataItem01);
        TextView patientName = (TextView) convertView.findViewById(R.id.dataItem02);
        TextView patientAge = (TextView) convertView.findViewById(R.id.dataItem03);

        Patient_Info listViewItem = listViewItemList.get(position);

        iconImageView.setImageDrawable(listViewItem.getIcon());
        patientRelationship.setText(listViewItem.getrelationship());
        patientName.setText(listViewItem.getname());
        patientAge.setText(listViewItem.getage());

        return convertView;
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    public Object getItem(int position){
        return listViewItemList.get(position);
    }

    public void addItem(Drawable icon, String relationship, String name, String age){
        Patient_Info item = new Patient_Info();

        item.setIcon(icon);
        item.setrelationship(relationship);
        item.setname(name);
        item.setage(age);

        listViewItemList.add(item);
    }
}
