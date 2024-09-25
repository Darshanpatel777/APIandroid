package com.example.apiandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Myclass extends BaseAdapter {


    String[] array;
    MainActivity mainActivity;



    public Myclass(MainActivity mainActivity, String[] array) {

        this.array = array;
        this.mainActivity = mainActivity;
    }


    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return (long) position ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(mainActivity).inflate(R.layout.detail,parent,false);



        TextView txx;
        txx = convertView.findViewById(R.id.txt);
        txx.setText(array[position]);


        return convertView;
    }
}
