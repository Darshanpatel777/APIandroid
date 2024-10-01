package com.example.apiandroid;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

public class MyPageAdpter  extends PagerAdapter {

    Main_item_view mainItemView;
    Modalclass nm;

    public MyPageAdpter(Main_item_view mainItemView, Modalclass nm) {
        this.mainItemView = mainItemView;
        this.nm = nm;
    }


    @Override
    public int getCount() {
        return nm.getImages().size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object ;
    }

    @SuppressLint("MissingInflatedId")
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ImageView next;

        View pg = LayoutInflater.from(mainItemView).inflate(R.layout.newimage,container,false);

        next = pg.findViewById(R.id.next);
        Glide.with(mainItemView).load(nm.getImages().get(position)).into(next);
        container.addView(pg);

        return pg;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);
    }
}
