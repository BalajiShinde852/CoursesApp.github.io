package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb9);
        String names[]={"B. Sc in Food Preservation and Processing",
                "B. Sc in Food Processing",
                "B. Sc in Food Processing and Technology",
                "B. Sc in Food Storage, Preservation and Food Tech",
                "B. Sc in Food Technology (Bio-Chemical Engineering)",
                "Diploma in Fish Processing Technology",
                "Diploma in Sugar Technology"};
        ListView ls=findViewById(R.id.lvb9);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}