package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cmc1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmc1);
        ListView ls=findViewById(R.id.lvmc1);
        String names[]={"B.Com.(Bachelor of Commerce , General)",
                "B.Com.(Bachelor of Commerce, Computers)" ,
                "B.Com.(Bachelor of Commerce, Honors)",
                " B.Com.(Bachelor of Commerce, Vocational)",
                " B.B.A.(Bachelor of Business Administration)",
                " B.B.M.(Bachelor of Business Management)",
                " HM&CT.(Bachelor of Hotel Management& Catering Technology)",
                " B.HRM.(Bachelor of Human Resource Management",
                " B.Sc.(Bachelor of Science, Mathematics)",
                "B.A.(Bachelor of Arts, Mathematics)",
                " B.A.(Bachelor of Arts in Economics)",
                " B.A.(Bachelor of Commerce, General)",
                " Bachelor of Computer Applications (BCA)",
                " Master of Business Administration (MBA)",
                " Master of Commerce (M.Com)",
                " Master of Arts (Economics)"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}