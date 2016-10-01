package com.example.farrukhmalik.report_card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView;
        ArrayList<StudentsRecord> list;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        list = new ArrayList<StudentsRecord>();
        list.add(new StudentsRecord("Farrukh Malik", "1st", "0311-8118082", "A+", R.drawable.a));
        list.add(new StudentsRecord("Farrukh Malik", "2nd", "0311-8118082", "A", R.drawable.c));
        list.add(new StudentsRecord("Farrukh Malik", "3rd", "0311-8118082", "B+", R.drawable.e));
        list.add(new StudentsRecord("Farrukh Malik", "4th", "0311-8118082", "B", R.drawable.f));
        list.add(new StudentsRecord("Farrukh Malik", "5th", "0311-8118082", "B", R.drawable.g));
        list.add(new StudentsRecord("Farrukh Malik", "6th", "0311-8118082", "C", R.drawable.a));
        list.add(new StudentsRecord("Farrukh Malik", "7th", "0311-8118082", "Fail", R.drawable.c));
        list.add(new StudentsRecord("Farrukh Malik", "8th", "0311-8118082", "Fail", R.drawable.e));
        CustomAdapter adaptor = new CustomAdapter(this, list);
        listView.setAdapter(adaptor);
    }
}
