package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class He3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_he3);
        ListView ls=findViewById(R.id.lvhe3);
        String names[]={"BHM &CT (Bachelor of Hotel Management & Catering Tech.)",
                "BHRM (Bachelor of Human Resource Management)",
                "BCA (Bachelor of Computer Applications)",
                "BBA (Bachelor of Business Administration)",
                "BBA(Hons) (Bachelor of Business Administration- Honors in Tourism)",
                "BBM (Bachelor of Business Management)",
                "BFA (Bachelor of Fine Arts, Applied/Paint/Photo/Sclp,)",
                "BFT (Bachelor of Fashion Technology)",
                "B.Des. (Bachelor of Design in Fashion Designing)",
                "B.Des. (Bachelor of Design in Leather Designing)",
                "B.Des. (Bachelor of Design in Accessory Design)",
                "B.Des. (Bachelor of Design in Textile Designing)",
                "B.Des. (Bachelor of Design in Knitwear Design)",
                "B.Des. (Bachelor of Design in Fashion Communication)",
                "B.Music (Bachelor of Music)"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}