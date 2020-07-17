package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Noneng3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noneng3);
        ListView ls=findViewById(R.id.non3);
        String names[]={"Certificate in Animation",
                "Certificate Course in Functional/Spoken English",
                "Certification in Mobile Repairing course",
                "Diploma in Commercial Practise",
                "Diploma in Cosmetology",
                "Diploma in Stenography",
                "Diploma in Leather Technology",
                "Diploma in Mechanical Engineering",
                "Diploma in 3D Animation",
                " Diploma in Finearts",
                " Craftmaship course in Food Production",
                " Certificate in Diesel Mechanics  ",
                "   HOME SCIENCE COURSES :",
                "      Commercial Garment Designing & Making" ,
                "      Fashion Garment Making ",
                "      Hotel operations"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}