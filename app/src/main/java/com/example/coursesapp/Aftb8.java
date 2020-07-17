package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb8);
        String names[]={"Diploma in Industrial Microbiology",
                "Diploma in Clinical Microbiology",
                "Diploma in Clinical Pathology",
                "B.Science (Hons) in Microbiology",
                "B.Science in Microbiology",
                "BSc Dairy Manufacturing",
                "BSc Microbial, Cellular, and Molecular Biology"};
        ListView ls=findViewById(R.id.lvb8);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}