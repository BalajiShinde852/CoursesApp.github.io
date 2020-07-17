package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb11);
        String names[]={"Bachelor of Science in Physics",
                "Bachelor of Science in Chemistry",
                "Bachelor of Science in Biology",
                "BSc Anesthesia",
                "BSc Radiology",
                "Diploma/Certificate Programs",
                "Diploma in Agriculture",
                "Diploma of Horticulture",
                "Diploma in Health Information Management",
                "Diploma in X-Ray Technology",
                "PGDM in Environmental Geology",
                "Diploma in Forensic Sciences-Cyber Crime",
                "Certificate in Forensic Identification",
                "Advanced Diploma in MRI and Spectroscopy",
                "Diploma in Office Administration – Health Services",
                "Graduate Certificate in Cyber Security and Computer Forensics"};
        ListView ls=findViewById(R.id.lvb11);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}