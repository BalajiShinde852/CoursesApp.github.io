package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb6);
        String names[]={"B. Sc. (Hons) Geology",
                "B. Science in Geology",
                "PG Diploma in Geology (Ground water)",
                "PG Diploma in Environmental Geology",
                "PG Diploma in Engineering Geology"};
        ListView ls=findViewById(R.id.lvb6);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}