package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class After12 extends AppCompatActivity {
    CardView c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after12);

        c1=findViewById(R.id.afmpc);
        c2=findViewById(R.id.afbipc);
        c3=findViewById(R.id.afmec);
        c4=findViewById(R.id.afhec);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent (After12.this,Afmpc.class);
                startActivity(i1);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent (After12.this,Afbipc.class);
                startActivity(i2);
            }
        });
        
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent (After12.this,Afmec.class);
                startActivity(i3);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent (After12.this,Afhec.class);
                startActivity(i4);
            }
        });
    }
}