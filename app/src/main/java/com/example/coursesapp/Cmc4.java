package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cmc4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmc4);
        ListView ls=findViewById(R.id.lvmc4);
        String names[]={"D.Ed. (Diploma in Education)",
                "DAc  (Diploma in Actuarial Science)",
                "D.Ins. (Diploma in Insurance)",
                "DM   (Diploma in Marketing)",
                "DHM  (Diploma in Hospitality Management)",
                "DFT  (Diploma in Fashion Technology)",
                "DFT  (Diploma in Film Technology)",
                "UGD.Phy-Ed  (Diploma in Physical Education)",
                "DFD  (Diploma in Footwear Design)",
                "DBM  (Diploma in Business Management)",
                "DEM  (Diploma in Export Management)",
                "DSM  (Diploma in Sales Management)",
                "DT   (Diploma in Tourism)",
                "DSM  (Diploma in School Management)",
                "DHM  (Diploma in Hotel Management)",
                "DFiSEngg. (Diploma in Fire Safty)",
                "DCP   (Diploma in Computer Programming)",
                "DHT   (Diploma in Hardware Technology)",
                "D.AirH  (Diploma in Air Hostess)",
                "DJr  (Diploma in Journalism)",
                "DP  (Diploma in Photography)"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}