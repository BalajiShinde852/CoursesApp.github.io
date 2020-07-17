package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb1);
       String names[]={"MBBS (Bachelor of Medicine, Bachelor of Surgery)",
               "BHMS (Bachelor of Homeopathic Medicine & Surgery)",
               "BAMS (Bachelor of Ayurveda Medicine & Surgery)",
               "B. Pharm (Bachelor of Pharmacy)",
               "B. Tech. ( Bachelor of Technology in Biotechnology)",
               "BE in Environmental Engineering",
               "BDS (Bachelors of Dental Science)",
               "BPT (Bachelor of Physiotherapy)",
               "B. sc.( Bachelor of Science)",
               "Anthropology",
               "Pharmaceutical Sciences",
               "Orthoptics",
               "Psychology",
               "Nutrition and Dietetics",
               "Clinical Microbiology",
               "Environmental Sciences",
               "Pathology",
               "Food Technology",
               "Fisheries Sciences",
               "Psychology",
               "Marine Biology",
               "Home Science"};
        ListView ls=findViewById(R.id.lvb1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}