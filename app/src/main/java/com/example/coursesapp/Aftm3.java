package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftm3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftm3);
        String names[]={"B.Sc. Nautical Science",
                "B.E. Marine Engineering",
                "B.E. Naval Architecture and Offshore Engineering",
                "B.E. Petroleum Engineering",
                "B.E. Mechanical Engineering",
                "B.E. Harbour & Ocean Engineering",
                "B.E. Civil Engineering",
                "B.E. Electrical & Electronics Engineering",
                "B.Sc. Marine Catering",
                "Electro Technical Officer Course"};
        ListView ls=findViewById(R.id.lvm3);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}