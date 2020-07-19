package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftm1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftm1);

        ListView ls = findViewById(R.id.lvm1);
        String names[] = {"1 B.E. (Aeronautical Engineering)",
                "2 B.E. (Aerospace Engineering)",
                "3 B.E. (Agricultural and Irrigation Engineering)",
                "4 B.E. (Agricultural Engineering)",
                "5 B.E. (Aircraft Maintenance Engineering)",
                "6 B.E. (Applied Electronics & Instrumentation)",
                "7 B.E. (Architecture Engineering)",
                "8 B.E. (Automobile Engineering)",
                "9 B.E. (Bioinformatics)",
                "10 B.E. (Biomedical Engineering)",
                "11 B.E. (Biotechnology)",
                "12 B.E. (Ceramic Technology)",
                "13 B.E. (Ceramics & Cement Technology)",
                "14 B.E. (Chemical Engineering)",
                "15 B.E. (Civil Engineering)",
                "16 B.E. (Computer Engineering)",
                "17 B.E. (Computer Science and Engineering)",
                "18 B.E. (Computer Science)",
                "19 B.E. (Construction Technology)",
                "20 B.E. (Electrical and Electronics Engineering)",
                "22 B.E. (Electronics & Telecom Engineering)",
                "23 B.E. (Electronics and Communication Engineering)",
                "24 B.E. (Electronics and Instrumentation Engineering)",
                "25 B.E. (Electronics Engineering)",
                "26 B.E. (Environmental Engineering)",
                "27 B.E. (Fashion Technology)",
                "28 B.E. (Food Technology)",
                "29 B.E. (Genetic Engineering)",
                "30 B.E. (Geo Informatics)",
                "31 B.E. (Hons.) Chemical Engineering",
                "32 B.E. (Hons.) Civil Engineering",
                "33 B.E. (Hons.) Computer Science",
                "34 B.E. (Hons.) Electrical and Electronics Engineering",
                "35 B.E. (Hons.) Electronics and Instrumentation Engineering",
                "36 B.E. (Hons.) Mechanical Engineering",
                "37 B.E. (Industrial & Production Engineering)",
                "38 B.E. (Industrial Engineering & Management)",
                "39 B.E. (Industrial Engineering)",
                "40 B.E. (Information Science & Engineering)",
                "41 B.E. (Information Technology)",
                "42 B.E. (Instrumentation & Control Engineering)",
                "43 B.E. (Instrumentation Engineering)",
                "44 B.E. (Irrigation and Water Management)",
                "45 B.E. (Manufacturing Engineering)",
                "46 B.E. (Marine Electrical and Electronics Engineering)",
                "47 B.E. (Marine Engineering)",
                "48 B.E. (Material Science and Engineering)",
                "49 B.E. (Mechanical Engineering)",
                "50 B.E. (Mechatronics Engineering)",
                "51 B.E. (Medical Electronics)",
                "52 B.E. (Metallurgical Engineering)",
                "53 B.E. (Mining Engineering)",
                "54 B.E. (Naval Architecture and Offshore Engineering)",
                "55 B.E. (Petrochemical Engineering)",
                "56 B.E. (Petroleum Engineering)",
                "57 B.E. (Plastic Technology)",
                "58 B.E. (Polymer Engineering)",
                "59 B.E. (Power Electronics)",
                "60 B.E. (Printing Technology)",
                "61 B.E. (Production & Industrial Engineering)",
                "62 B.E. (Production Engineering)",
                "63 B.E. (Robotics)",
                "64 B.E. (Rubber Technology)",
                "65 B.E. (Software Engineering)",
                        "66 B.E. (Space Technology)",
                "67 B.E. (Telecommunication Engineering)",
                "68 B.E. (Textile Technology)",
                "69 B.E. (Transportation Engineering)",
                "70 B.E. (Welding Technology)",
                "71 B.E.(Hons.) Manufacturing Engineering"};
              ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);
    }
}