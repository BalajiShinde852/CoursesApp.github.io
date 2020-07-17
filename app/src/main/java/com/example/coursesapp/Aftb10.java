package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb10);
        String names[]={"Diploma in Homeopathy",
                "Diploma in Acute Prescribing with Homeopathy",
                "Diploma in Ayurvedic Pharmacy",
                "Diploma in Homeopathy and Health Sciences",
                "Geology Degree/Certificate Programs",
                "BSc (Hons) Geology with Physical Geography",
                "BSc (Hons) Astrophysics and Geology",
                "BE and BSc – Studies in Environmental Earth Sciences and Biology",
                "BSc Geology",
                "Allied Health Courses",
                "Occupational Therapists",
                "Audiology",
                "Anesthesia Technology",
                "Neuroscience Technology",
                "Speech and Language Therapy",
                "Imaging Technology",
                "Radiology",
                "Respiratory Therapy",
                "Prosthetics and Orthotics"};
        ListView ls=findViewById(R.id.lvb10);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}