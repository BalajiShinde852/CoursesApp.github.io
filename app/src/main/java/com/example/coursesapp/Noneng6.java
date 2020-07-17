package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Noneng6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noneng6);
        ListView ls=findViewById(R.id.non6);
        String names[]={"Accounting and Taxation",
                "    Marketing & Salesmanship",
                "    Office Assistant ship",
                "    Banking & Financial Services",
                "    Insurance and Marketing"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}