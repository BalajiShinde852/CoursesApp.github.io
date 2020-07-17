package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb4);
        String names[]={"B.E. in Biotechnology",
                "B.Tech (Industrial Biotechnology)",
                "B.Science in Biotechnology",
                "B.Sc. in Biotechnology and Bioinformatics",
                " Diploma in Biotechnology",
                "Associate in Science in Biotechnology",
                "BSc in Molecular Biology",
                "Bachelor of Science in Advanced Zoology and Biotechnology"};
        ListView ls=findViewById(R.id.lvb4);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}