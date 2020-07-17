package com.example.coursesapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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

    ListView ls;
    String[] inter12={"MPC","BiPC","MEC","CEC","HEC","M/BiPC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter);
        ls=(ListView)findViewById(R.id.lvinter);
        MyAdapter adapter=new MyAdapter( this,inter12);
        ls.setAdapter(adapter);
    }
    class MyAdapter extends ArrayAdapter<String>
    {
        Context context;
        String rinter[];
        MyAdapter(Context c,String course[])
        {
            super(c,R.layout.interrow,R.id.intercourse,course);
            this.context=c;
            this.rinter=course;

        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View interrow=layoutInflater.inflate(R.layout.interrow,parent,false);
            TextView t=interrow.findViewById(R.id.intercourse);
            t.setText(rinter[position]);
            return interrow;
        }
    }
}