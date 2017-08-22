package com.example.user.listviewwithviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> myList = new ArrayList<String>();
    private TextView myRowtext;
    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long answer = 0;
        long start = 389343;
        for(int i = 0; i<5000; i++){

            answer= start * (i+1);
            myList.add(""+answer);
            start = start +350;
        }

        myListView = (ListView) findViewById(R.id.listViva);

        TheAdapter adapterView = new TheAdapter(MainActivity.this,R.layout.row_layout,myList);

        myListView.setAdapter(adapterView);


    }
}
