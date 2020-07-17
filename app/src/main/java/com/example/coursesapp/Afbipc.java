package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Afbipc extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afbipc);
        c1=findViewById(R.id.afb1);
        c2=findViewById(R.id.afb2);
        c3=findViewById(R.id.afb3);
        c4=findViewById(R.id.afb4);
        c5=findViewById(R.id.afb5);
        c6=findViewById(R.id.afb6);
        c7=findViewById(R.id.afb7);
        c8=findViewById(R.id.afb8);
        c9=findViewById(R.id.afb9);
        c10=findViewById(R.id.afb10);
        c11=findViewById(R.id.afb11);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent (Afbipc.this,Aftb1.class);
                startActivity(i1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent (Afbipc.this,Aftb2.class);
                startActivity(i2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent (Afbipc.this,Aftb3.class);
                startActivity(i3);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent (Afbipc.this,Aftb4.class);
                startActivity(i4);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent (Afbipc.this,Aftb5.class);
                startActivity(i5);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent (Afbipc.this,Aftb6.class);
                startActivity(i6);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent (Afbipc.this,Aftb7.class);
                startActivity(i7);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8=new Intent (Afbipc.this,Aftb8.class);
                startActivity(i8);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9=new Intent (Afbipc.this,Aftb9.class);
                startActivity(i9);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i10=new Intent (Afbipc.this,Aftb10.class);
                startActivity(i10);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11=new Intent (Afbipc.this,Aftb11.class);
                startActivity(i11);
            }
        });
    }
}