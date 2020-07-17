package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Noneng5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noneng5);
        ListView ls=findViewById(R.id.non5);
        String names[]={"Crop Production and Management",
                "   Dairying",
                "   Fisheries",
                "  Sericulture"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}