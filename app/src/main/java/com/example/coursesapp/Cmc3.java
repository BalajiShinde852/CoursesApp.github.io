package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cmc3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmc3);
        ListView ls=findViewById(R.id.lvmc3);
        String names[]={"BFA (Bachelor of Fine Arts, Applied/Paint/Photo/Sclp,)",
                "BFT (Bachelor of Fashion Technology)",
                "B.Des. (Bachelor of Design in Fashion Designing)",
                "B.Des. (Bachelor of Design in Leather Designing)",
                "B.Des. (Bachelor of Design in Accessory Design)",
                "B.Des. (Bachelor of Design in Textile Designing)",
                "B.Des. (Bachelor of Design in Knitwear Design)",
                "B.Des. (Bachelor of Design in Fashion Communication)",
                "BA (Bachelor of Arts,  Others)",
                "B.Music(Bachelor of Music)",
                "BSW  (Bachelor of Social work)",
                "BAL  (Bachelor of Arts in Languages)"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}