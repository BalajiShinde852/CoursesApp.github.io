package com.example.coursesapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Inter extends AppCompatActivity {
    private CardView afMpc,afBpc,afCec,afHec,afMec,afMBpc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter);

        afMpc = (CardView) findViewById(R.id.afmpc);
        afBpc = (CardView) findViewById(R.id.afbipc);
        afCec = (CardView) findViewById(R.id.afcec);
        afMec = (CardView) findViewById(R.id.afmec);
        afMBpc = (CardView) findViewById(R.id.afMBipc);
        afHec = (CardView) findViewById(R.id.afhec);

        afMpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inter.this,Afmpc.class);
                startActivity(i);
            }
        });


        afBpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inter.this,Afbipc.class);
                startActivity(i);
            }
        });

        afCec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inter.this,After12.class);
                startActivity(i);
            }
        });

        afHec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inter.this,Afhec.class);
                startActivity(i);
            }
        });

        afMec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inter.this,Afmec.class);
                startActivity(i);
            }
        });


        afMBpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inter.this,After12.class);
                startActivity(i);
            }
        });

    }
}