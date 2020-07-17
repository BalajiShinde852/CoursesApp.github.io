package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cmc6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmc6);
        ListView ls=findViewById(R.id.lvmc6);
        String names[]={"Bachelor of Fine Arts (BFA)",
                "Bachelor’s degree in Fashion Design/ Interior Design",
                "BSc. in Social Sciences",
                "Bachelor of Arts (in language and literature)",
                "Bachelor in Journalism",
                "Bachelor in Mass Communication"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}