package com.allanakshay.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Home_Page extends AppCompatActivity {
    TextView name;
    static ArrayList<Item> item_array = new ArrayList<Item>();
    ListView listView;
    static Home_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        name = (TextView) findViewById(R.id.Home_text);
        name.setText("Hello "+ getIntent().getStringExtra("Name")+ "!");
        listView = (ListView) findViewById(R.id.Home_lv);
        adapter = new Home_Adapter(item_array, this);
        listView.setAdapter(adapter);
        final Intent intent = new Intent(this, Data_Input.class);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
