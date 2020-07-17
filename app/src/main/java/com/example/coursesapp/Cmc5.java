package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cmc5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmc5);
        ListView ls= findViewById(R.id.lvmc5);
        String names[]={"CA-CPT",
                "ICWA / CS",
                "Certified Financial Analyst (CFA)",
                "Certified Financial Planner (CFP)",
                "Event Management",
                "Insurance",
                "Banking",
                "Actuarial studies",
                "Marketing",
                "Multi media",
                "Anamation",
                "Tourism",
                "Accounting Packages (Tally)",
                "Performing Arts",
                "Foreign Languages",
                "Literature",
                "Library Science",
                "Railway Tech.",
                "Music / Dance",
                "Jyothsiam",
                "Human Rights",
                "Pre-Primary Teacher’s",
                "Early Childhood Ed",
                "Rural Development",
                "Food & Nutrition",
                "Air Ticketing"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}