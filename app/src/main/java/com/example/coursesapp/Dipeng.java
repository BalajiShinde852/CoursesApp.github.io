package com.example.coursesapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Dipeng extends AppCompatActivity {

    ListView l1;
    String dipe[] = {"Diploma in mechanical engineering", "  Diploma in Civil engineering","  Diploma in Electrical engineering", "  Diploma in Computer Science and engineering", "  Diploma in Electrical and Electronics engineering", "  Diploma in Automobile engineering", "  Diploma in Computer engineering", "  Diploma in Information Technology", "  Diploma in Electronics engineering", "  Diploma in Production engineering", "  Diploma in Chemical engineering", "  Diploma in mining engineering", "  Diploma in Architecture engineering", "  Diploma in mechatronics engineering", "  Diploma in Biomedical engineering", "  Diploma in Petroleum engineering", "  Diploma in Computer Programming", "  Graduate Certificate in Marketing Management", "  Diploma in Business Administration", "  Diploma in Animation, Art & Design", "  Diploma in Hospitality Management", "  Diploma in Accounting", "  Diploma of Early Childhood Education & Care", "  Diploma in Instrumentation Technology", "  Diploma in Food Technology","  Diploma in Aeronautical Engineering","  Diploma in Architectural Assistantship", "  Diploma in Rubber Technology", "  Electrical Wiring & Servicing of Electrical Appliances", "  Rural Engineering Technician", "  Water Supply & Sanitary Engineering", "  DTP & Printing Technology", "   Art Teacher Diploma", "   Commercial Art Diploma", "   Diploma in Stenography", "   Diploma in 3D Animation", "   Diploma in Beauty Care", "   Diploma in Cosmetology", "   Diploma in Cyber Security", "   Diploma in Agriculture", "   Diploma in Hotel Management and Catering Technology", "   Diploma in Commercial Practice", "   Diploma in Dental Mechanics", "   Diploma in Plastics Technology", "   Diploma in Ceramic Technology", "   Diploma in Engineering", "   Diploma in Fire Safety Engineering", "   Diploma in Fashion Technology", "   IC Engineering", "   Food Processing and Technology", "   Power Engineering", "   Environmental Engineering", "   Naval Architecture"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipeng);
        l1=findViewById(R.id.lveng);
        MyAdapter adapter=new MyAdapter(this,dipe);
        l1.setAdapter(adapter);
    }
    class MyAdapter extends ArrayAdapter<String>
    {
        Context context;
        String[] dipcourse;
        MyAdapter(Context c, String[] dip)
        {
            super(c,R.layout.roweng,R.id.dieng,dip);
            this.context=c;
            this.dipcourse=dip;
        }

        @RequiresApi(api = Build.VERSION_CODES.M)
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View roweng = layoutInflater.inflate(R.layout.roweng,parent,false);
            TextView t=roweng.findViewById(R.id.dieng);
            t.setTextColor(getColor(R.color.black));
            t.setText(dipcourse[position]);
            return roweng;
        }

    }
}