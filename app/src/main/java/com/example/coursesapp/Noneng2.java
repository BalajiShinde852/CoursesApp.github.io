package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Noneng2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noneng2);
        ListView ls=findViewById(R.id.non2);
        String names[]={ "     Diploma in Business Management", "     Diploma in Food Technology ", "     Diploma in Food and Beverage Production", "     Diploma in Hotel Stores Management", "     Diploma in Hospitality Management", "     Diploma in Front Office and Reception Management", "     IT and Computer Technology"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}