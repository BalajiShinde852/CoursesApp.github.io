package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb2);
        String names[]={"B.Sc. in Forensic Sciences",
                "B.Sc. in Forensic Sciences",
                "B.Sc. in Life Science, Chemistry, Forensic Science",
                "Diploma in F/Sciences (Ballistics and Fingerprints)",
                "Diploma in Forensic Science (Cyber Crimes)",
                "Diploma in Forensic Science (Computer Forensics)" ,
                "Diploma in Criminology and Forensic Science for Police personnel",
                "BSc Psychology with Forensic Psychology",
                "BSc in Digital Forensics and Information Assurance",
                "Bachelor of Applied Science in Forensic Studies",
                "MSc Forensic Science "};
        ListView ls=findViewById(R.id.lvb2);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}