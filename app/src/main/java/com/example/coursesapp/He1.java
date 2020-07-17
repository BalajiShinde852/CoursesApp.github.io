package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class He1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_he1);
        ListView ls=findViewById(R.id.lvhe1);
        String names[]={"History",
                "Economics",
                "Political Science",
                "Public Administration",
                "Sociology",
                "Social Work",
                "Psychology",
                "Journalism",
                "Tourism",
                "Languages",
                "Literature",
                "Philosophy",
                "Multimedia",
                "Criminology",
                "Geography",
                "Archaeology",
                "Anthropology",
                "Astrology",
                "Statistics",
                "Islamic Studies",
                "Computr Applications",
                "Marketing",
                "Media",
                "Oriental Languages",
                "Mass Communication",
                "Modern Languages",
                "Classical Languages",
                "Astrology",
                "Music & Dance"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}