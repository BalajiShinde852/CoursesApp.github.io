package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftm4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftm4);
        String names[]={"Architectural Design",
                "Art and Design","Building Information Modeling",
                "Building Technology",
                "Community Design",
                "Computer-Aided Design",
                "Engineering",
                "Environment/Sustainability",
                "Graphic Design",
                "Housing"};
        ListView ls=findViewById(R.id.lvm4);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}