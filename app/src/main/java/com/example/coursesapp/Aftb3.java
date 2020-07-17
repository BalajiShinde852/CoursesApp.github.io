package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb3);
        String names[]={"B. Science in Aquaculture (Fishery Microbiology)",
                "B.Sc. in Advanced Zoology and Biotechnology",
                "B.Sc. in Zoology",
                "B.Science (Hons) in Zoology",
                "in Zoology and Animal Biotechnology",
                "BSc(Hons) Marine Biology and Oceanography",
                "BSc (Hons) Marine Vertebrate and Zoology",
                "BSc (Hons) in Aquaculture",
                "Bachelor in Fisheries and Wildlife Sciences"};
        ListView ls=findViewById(R.id.lvb3);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}