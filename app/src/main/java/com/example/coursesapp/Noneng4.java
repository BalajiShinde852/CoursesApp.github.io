package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Noneng4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noneng4);
        ListView ls=findViewById(R.id.non4);
        String names[]={"Diploma in Computer Application",
                "  Certificate in Social Media Management ",
                "  Diploma in Hardware Maintenance",
                "  Certificate Course in Search Engine Marketing",
                "  Diploma Computer Technician",
                "  Certificate in Search Engine Optimisation",
                "  Certificate in Graphic/Web Designing",
                "  Certificate Course in Programming Language"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}