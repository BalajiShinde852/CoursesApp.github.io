package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class After10 extends AppCompatActivity {
    CardView Inter,Diploma,Iti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after10);
        Inter=(CardView)findViewById(R.id.inter);
        Diploma=(CardView)findViewById(R.id.diploma);
        Iti=(CardView)findViewById(R.id.iti);
        Inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(After10.this,Inter.class);
                startActivity(i1);
            }
        });
        Diploma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(After10.this,Diploma.class);
                startActivity(i2);
            }
        });
        Iti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(After10.this,Iti.class);
                startActivity(i3);
            }
        });
    }
}