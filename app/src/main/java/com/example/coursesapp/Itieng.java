package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Itieng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itieng);
        ListView ls=findViewById(R.id.itiengsub);
        String names[]={"Tool & Die Maker Engineering",
                "Draughtsman (Mechanical) Engineering",
                "Diesel Mechanic Engineering",
                "Information Technology & E.S.M. Engineering",
                "Draughtsman (Civil) Engineering",
                "Pump Operator",
                "Fitter Engineering",
                "Motor Driving-cum-Mechanic Engineering",
                "Turner Engineering",
                "Mechanic Radio & T.V. Engineering",
                "Mechanic Electronics Engineering",
                "Surveyor Engineering",
                "Foundry Man Engineering",
                "Sheet Metal Worker Engineering",
                "Mechanic Motor Vehicle Engineering",
                "Electrician Engineering",
                "Mech. Instrument Engineering",
                "Refrigeration Engineering",
                "Machinist Engineering"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}