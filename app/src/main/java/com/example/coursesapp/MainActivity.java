package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView afterX,afterX11,cvExams,cvPG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         afterX = (CardView) findViewById(R.id.after_X);
         afterX11 = (CardView) findViewById(R.id.after_X11);
         cvExams = (CardView) findViewById(R.id.cv_Exams);
         cvPG = (CardView) findViewById(R.id.cv_PG);

        afterX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent (MainActivity.this,After10.class);
                startActivity(i1);
            }
        });

        afterX11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent (MainActivity.this,After12.class);
                startActivity(i2);
            }
        });

        cvExams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent (MainActivity.this, CvExams.class);
                startActivity(i3);
            }
        });

        cvPG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent (MainActivity.this,CvPG.class);
                startActivity(i4);
            }
        });

    }
}