package com.allanakshay.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class Data_Input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__input);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button button = (Button)findViewById(R.id.Data_button);
        final EditText text = (EditText) findViewById(R.id.Data_edit);
        final TimePicker time = (TimePicker) findViewById(R.id.Data_time);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item(String.valueOf(time.getHour()) + ":" + String.valueOf(time.getMinute()), text.getText().toString());
                Home_Page.item_array.add(item);
                Home_Page.adapter.notifyDataSetChanged();
                finish();
            }
        });

    }

}
