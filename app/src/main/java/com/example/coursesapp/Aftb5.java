package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftb5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftb5);
        String names[]={"B.Sc. (Agriculture Mktg and Business Management)",
                "B.Sc. (Bio-chem and Agricultural Chemistry)",
                "B.Sc. in Crop Physiology",
                " B.Sc. in Entomology",
                "B. Sc in Agronomy",
                "B. Sc in Agricultural Meteorology",
                "B. Sc in Agricultural Biotechnology",
                "B. Sc (Hons) in Agriculture",
                "B. Sc in Agriculture",
                "B.Science in Agricultural Eco and Farm management",
                "B. Sc in Agricultural Statistics",
                "BSc in Horticulture",
                "BSc in Plant Production",
                "BSc in  Animal Production",
                "BSc in Entomology",
                "Bachelors in International Food and Agribusiness",
                "Bachelors in International Rural Innovation and Development",
                "Bachelors in Horticulture and Business Management"};
        ListView ls=findViewById(R.id.lvb5);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}