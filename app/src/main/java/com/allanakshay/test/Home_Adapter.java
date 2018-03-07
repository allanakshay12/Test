package com.allanakshay.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Allan Akshay on 07-03-2018.
 */

public class Home_Adapter extends BaseAdapter implements ListAdapter {

    ArrayList<Item> items;
    Context context;

    Home_Adapter(ArrayList<Item> items, Context context)
    {
        this.items = items;
        this.context = context;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        if(view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_list,null);
        }
        TextView item = (TextView)view.findViewById(R.id.lv_item);
        TextView time = (TextView)view.findViewById(R.id.lv_time);
        item.setText(items.get(i).getText());
        time.setText(items.get(i).getTime());
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.remove(i);
                notifyDataSetChanged();


            }
        });
        return view;
    }
}
