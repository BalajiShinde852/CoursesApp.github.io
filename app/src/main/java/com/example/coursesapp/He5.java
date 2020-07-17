package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class He5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_he5);
        ListView ls=findViewById(R.id.lvhe5);
        String names[]={"Performing Arts",
                "Foreign Languages",
                "Literature",
                "Library Science",
                "Railway Tech.",
                "Music / Dance",
                "Jyothsiam",
                "Human Rights",
                "Pre-Primary Teacher’s",
                "Early Childhood Ed.",
                "Rural Development",
                "Food & Nutrition",
                "Air Ticketing"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}