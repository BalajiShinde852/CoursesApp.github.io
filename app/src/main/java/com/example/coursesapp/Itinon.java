package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Itinon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinon);
        ListView ls=findViewById(R.id.itinonsub);
        String names[]={" Electrician",
                "Radiology Technician",
                "Insurance Agent",
                "Digital Photographer",
                "Fashion Design & Technology",
                "Sewing Technology",
                "Tool and Die Making",
                "Computer Operator and Programming Artists",
                "Dress Making",
                "Manufacture Foot Wear",
                "Secretarial Practice",
                "Hair & Skin Care",
                "Fruit & Vegetable Processing",
                "Bleaching & Dyeing Calico Print",
                "Letter Press Machine Mender",
                "Commercial Art",
                "Leather Goods Maker",
                "Hand Compositor"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}