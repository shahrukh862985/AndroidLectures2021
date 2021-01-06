package com.aptech.androidlectures;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> employees;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        employees = new ArrayList<>();
        employees.add("Asad");
        employees.add("Asim");
        employees.add("Ali");
        employees.add("Wajahat");
        employees.add("asif");
        employees.add("Amir");
        employees.add("Adil");
        employees.add("Asad");
        employees.add("Asim");
        employees.add("Ali");
        employees.add("Wajahat");
        employees.add("asif");
        employees.add("Amir");
        employees.add("Adil");
        employees.add("Asad");
        employees.add("Asim");
        employees.add("Ali");
        employees.add("Wajahat");
        employees.add("asif");
        employees.add("Amir");
        employees.add("Adil");
        employees.add("Asad");
        employees.add("Asim");
        employees.add("Ali");
        employees.add("Wajahat");
        employees.add("asif");
        employees.add("Amir");
        employees.add("Adil");

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,employees);
        listView.setAdapter(adapter);
    }
}
