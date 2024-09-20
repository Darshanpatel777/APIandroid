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
    int[] imagearray;



    public Myclass(MainActivity mainActivity, String[] array, int[] imagearray) {

        this.array = array;
        this.mainActivity = mainActivity;
        this.imagearray = imagearray;
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


        ImageView img;
        img = convertView.findViewById(R.id.img);
        img.setBackgroundResource(imagearray[position]);

        TextView txx;
        txx = convertView.findViewById(R.id.txx);
        txx.setText(array[position]);


        return convertView;
    }
}
