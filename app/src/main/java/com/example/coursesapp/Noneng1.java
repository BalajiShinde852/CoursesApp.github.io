package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Noneng1 extends AppCompatActivity {
    ListView ls;
    String[] names ={" Diploma in Hospital Assistance", "  Diploma in Rural Healthcare", "  Pathology Lab Technician", "  Diploma in Paramedic Nursing", "  Certificate of Nursing Assistants", "  Diploma in Physiotherapy", "  Diploma in X-Ray Technology", "  Diploma in ECG Technology", "  Diploma in Radiology", "  Diploma in Dental Mechanics", "  Diploma in Pharmacy", "  Diploma in Dental Mechanics", "   Diploma in Dental Hygienist","Ophthalmic Technician", "Physiotherapy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noneng1);
        ListView ls=findViewById(R.id.non1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}