package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftm6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftm6);
        String names[]={"B.A. English",
                "B.A. in Political Science",
                "B.A. LLB",
                "Bachelor of Journalism & Mass Communication (BJMC) ",
                "B.A Geography"};
        ListView ls=findViewById(R.id.lvm6);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}