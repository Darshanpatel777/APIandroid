package com.example.apiandroid;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

public class Main_item_view extends AppCompatActivity {


    TextView detail,txt2,price2,rate2,discount2,rating2;
    ViewPager img2;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_item_view);

        Modalclass nm = (Modalclass) getIntent().getSerializableExtra("data");

        detail = findViewById(R.id.detail);
        txt2 = findViewById(R.id.txt2);
        price2 = findViewById(R.id.price2);
        rate2 = findViewById(R.id.rate2);
        discount2 = findViewById(R.id.discount2);
        rating2 = findViewById(R.id.rating2);
        img2 = findViewById(R.id.img2);


       detail.setText(nm.getTitle());
       txt2.setText(nm.getDescription());
       price2.setText(String.valueOf(nm.getPrice()));


        discount2.setText("  " + nm.getDiscountPercentage() + " %off ");
        int k = (int) (100 -nm.getDiscountPercentage());
        int t = (int) (nm.getPrice() * 100);
        rate2.setText(String.valueOf( t / k));

        rate2.setPaintFlags(rate2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        rating2.setText(String.valueOf(nm.getRating() + " ★ "));


        MyPageAdpter pg = new MyPageAdpter(this,nm);
        img2.setAdapter(pg);





    }
}