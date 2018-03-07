package com.allanakshay.test;



/**
 * Created by Allan Akshay on 07-03-2018.
 */

public class Item {
    String time;
    String text;

    Item(String time, String text)
    {
        this.time = time;
        this.text = text;
    }

    String getText()
    {return text;}

    String getTime()
    {return time;}
}
