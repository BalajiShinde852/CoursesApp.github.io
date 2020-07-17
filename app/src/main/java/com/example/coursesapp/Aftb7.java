package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb7);
       String names[]={"B.E in Man Made Fiber Technology",
               "B.E in Textile Technology",
               "B.E in Textile Chemistry",
               "Diploma in Fabrication Tech and Erection Eng",
               "Diploma in Textile Tech",
               "Diploma in Textile Eng"};
        ListView ls=findViewById(R.id.lvb7);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}