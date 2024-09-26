package com.example.apiandroid;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<Myrecycle> {


    MainActivity mainActivity;
    ArrayList<Modalclass> allData;

    public MyAdapter(MainActivity mainActivity, ArrayList<Modalclass> allData) {
        this.mainActivity = mainActivity;
        this.allData = allData;
    }

    @NonNull
    @Override
    public Myrecycle onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vv = LayoutInflater.from(mainActivity).inflate(R.layout.detail, parent, false);
        Myrecycle myrecycle = new Myrecycle(vv);

        return myrecycle;
    }

    @Override
    public void onBindViewHolder(@NonNull Myrecycle holder, int position) {


        Log.d("======", "onBindViewHolder: "+position);

        Modalclass modal = allData.get(position);

        holder.txt.setText(modal.getTitle());
        holder.price.setText("₹" +String.valueOf(modal.getPrice()));
        holder.discount.setText("  " +String.valueOf(modal.getDiscountPercentage() + " %off "));

        int k = (int) (100 - modal.getDiscountPercentage());
        int t= (int) (modal.getPrice()*100);
        holder.rate.setText(String.valueOf(" "+t/k));
        holder.rating.setText(String.valueOf(modal.getRating()+" ★ "));



    }

    @Override
    public int getItemCount() {

        return allData.size();
    }
}
class Myrecycle extends RecyclerView.ViewHolder {

    TextView txt;
    TextView price;
    TextView rate;
    TextView discount;
    TextView rating;



    public Myrecycle(@NonNull View itemView) {
        super(itemView);


        txt = itemView.findViewById(R.id.txt);
        price = itemView.findViewById(R.id.price);
        rate = itemView.findViewById(R.id.rate);
        discount = itemView.findViewById(R.id.discount);
        rating = itemView.findViewById(R.id.rating);




    }
}