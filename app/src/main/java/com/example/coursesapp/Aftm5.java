package com.example.coursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aftm5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftm5);
        String names[]={"B.Sc. (PCM)",
                "B.Sc. (Physics)",
                "B.Sc. (Chemistry)",
                "B.Sc. (Maths)",
                "B.Sc. (Zoology)",
                "B.Sc. (Statistics)",
                "B.Sc. (Botany)",
                "B.Sc. (Home Science)",
                "BSc (Agriculture)",
                "BSc (Animation)",
                "B.Sc. (Aquaculture)",
                "B.Sc. (Aviation)",
                "B.Sc. (Biochemistry)",
                "B.Sc. (Bioinformatics)",
                "B.Sc. (Computer Science)",
                "B.Sc. (Dietetics)",
                "B.Sc. (Electronic)",
                "B.Sc. (Fashion Technology)",
                "B.Sc. (Food Technology)",
                "B.Sc. (Forensic Science)",
                "B.Sc. (Forestry)",
                "B.Sc. (Medical Technology)",
                "B.Sc. (Microbiology)",
                "B.Sc. (Multimedia)",
                "B.Sc. (Nautical Science)",
                "B.Sc. (Nursing)",
                "B.Sc. (Nutrition)",
                "B.Sc. (Physiotherapy)",
                "B.Sc. (Psychology)",
                "B.Sc. (Genetics)",
                "B.Sc. (Information Technology)",
                "B.Sc. (Interior Design)",
                "B.Sc.(Horticulture)",
                "B.Sc.(BioTechnology)"};
        ListView ls=findViewById(R.id.lvm5);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        ls.setAdapter(arrayAdapter);

    }
}