package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dipnoneng extends AppCompatActivity {
    CardView cv1,cv2,cv3,cv4,cv5,cv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipnoneng);
        cv1=(CardView)findViewById(R.id.c1);
        cv2=(CardView)findViewById(R.id.c2);
        cv3=(CardView)findViewById(R.id.c3);
        cv4=(CardView)findViewById(R.id.c4);
        cv5=(CardView)findViewById(R.id.c5);
        cv6=(CardView)findViewById(R.id.c6);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Dipnoneng.this,Noneng1.class);
                startActivity(i1);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Dipnoneng.this,Noneng2.class);
                startActivity(i2);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Dipnoneng.this,Noneng3.class);
                startActivity(i3);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Dipnoneng.this,Noneng4.class);
                startActivity(i4);
            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(Dipnoneng.this,Noneng5.class);
                startActivity(i5);
            }
        });
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(Dipnoneng.this,Noneng6.class);
                startActivity(i6);
            }
        });
    }
}