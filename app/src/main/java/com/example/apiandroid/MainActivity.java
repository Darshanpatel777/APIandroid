package com.example.apiandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button sub;

    GridView list;


    String array[]= {"shirt","t-shirts","jeans","shoes","Wallets","Belts","Sunglasses"};

    int imagearray[] = {R.drawable.clothes,R.drawable.clothes,R.drawable.clothes,R.drawable.clothes,R.drawable.clothes,R.drawable.clothes,R.drawable.clothes};
    ArrayList<Modalclass> allData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        sub = findViewById(R.id.sub);

        list = findViewById(R.id.list);

        Myclass dp = new  Myclass( MainActivity.this,array,imagearray);
        list.setAdapter(dp);


//       sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                RequestQueue que = Volley.newRequestQueue(MainActivity.this);
//                String url = "https://dummyjson.com/products";
//                StringRequest rs = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        allData.clear();
//                        try {
//                            JSONObject alldata = new JSONObject(response);
//                            JSONArray product = alldata.getJSONArray("products");
//
//                            for (int i = 0; i < product.length(); i++)
//                            {
//
//                                JSONObject singleProduct = product.getJSONObject(i);
//
//                                Integer id = singleProduct.getInt("id");
//                                String title = singleProduct.getString("title");
//                                String description = singleProduct.getString("description");
//                                String category = singleProduct.getString("category");
//                                double price = singleProduct.getDouble("price");
//                                double discountPercentage = singleProduct.getDouble("discountPercentage");
//                                double rating = singleProduct.getDouble("rating");
//                                Integer stock = singleProduct.getInt("stock");
//
//                                JSONArray jsonTags = singleProduct.getJSONArray("tags");
//                                String[] tags = new String[jsonTags.length()];
//                                for (int t = 0; t < jsonTags.length(); t++)
//                                {
//                                    tags[t] = jsonTags.getString(t);
//                                }
//
//
//                                String brand = singleProduct.getString("brand");
//
//                                JSONArray jsonReview = singleProduct.getJSONArray("reviews");
//                                ArrayList<HashMap<String, Object>> reviews = new ArrayList<>();
//                                for (int k = 0; k < jsonReview.length(); k++)
//                                {
//                                    JSONObject reviewMap = jsonReview.getJSONObject(k);
//
//                                    HashMap<String, Object> hash = new HashMap<>();
//
//                                    hash.put("rating", reviewMap.getInt("rating"));
//                                    hash.put("comment", reviewMap.getString("comment"));
//                                    hash.put("date", reviewMap.getString("date"));
//                                    hash.put("reviewerName", reviewMap.getString("reviewerName"));
//                                    hash.put("reviewerEmail", reviewMap.getString("reviewerEmail"));
//                                    reviews.add(hash);
//
//                                }
//
//                                JSONArray jsonImages = singleProduct.getJSONArray("images");
//                                ArrayList<String> images = new ArrayList<>();
//                                for (int k = 0; k < jsonImages.length(); k++)
//                                {
//                                    images.add(jsonImages.getString(k));
//                                }
//
//                                String thumbnail = singleProduct.getString("thumbnail");
//
//                                Modalclass modalclass = new Modalclass(id, title, description, category, price,
//                                        discountPercentage, rating, stock, tags, brand, reviews, images, thumbnail);
//
//                                allData.add(modalclass);
//                             }
//                        } catch (JSONException e) {
//
//                        }
//
//                        Log.d("====r====", "onResponse" + Arrays.toString(allData.get(0).getTags()));
//
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Log.e("====r====", "onErrorResponse: " + error.getLocalizedMessage());
//
//                    }
//                });
//
//                que.add(rs);
//            }
//        });


    }
}