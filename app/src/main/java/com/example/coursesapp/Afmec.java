package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Afmec extends AppCompatActivity {

    CardView c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afmec);
        c1=findViewById(R.id.mc1);
        c2=findViewById(R.id.mc2);
        c3=findViewById(R.id.mc3);
        c4=findViewById(R.id.mc4);
        c5=findViewById(R.id.mc5);
        c6=findViewById(R.id.mc6);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent (Afmec.this,Cmc1.class);
                startActivity(i1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent (Afmec.this,Cmc2.class);
                startActivity(i2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent (Afmec.this,Cmc3.class);
                startActivity(i3);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent (Afmec.this,Cmc4.class);
                startActivity(i4);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent (Afmec.this,Cmc5.class);
                startActivity(i5);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent (Afmec.this,Cmc6.class);
                startActivity(i6);
            }
        });
    }
}