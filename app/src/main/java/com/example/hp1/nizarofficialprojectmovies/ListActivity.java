package com.example.hp1.nizarofficialprojectmovies;


import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.hp1.nizarofficialprojectmovies.R.*;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ArrayList<Movies> items;
    CustomApadter adapter;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_list);

       lvItems = findViewById(id.lvCountries);

       items = new ArrayList<>();

       items.add(new Movies(R.drawable.download,"first"));
       items.add(new Movies(R.drawable.download ,"first"));
       items.add(new Movies(R.drawable.download,"first"));
       items.add(new Movies(R.drawable.download ,"first"));

       adapter = new CustomApadter(this,layout.customrows, items);
       lvItems.setAdapter(adapter);
       lvItems.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

    }
}
