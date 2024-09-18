package com.example.apiandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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

public class MainActivity extends AppCompatActivity {

    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub = findViewById(R.id.sub);


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RequestQueue que = Volley.newRequestQueue(MainActivity.this);
                StringRequest rs = new StringRequest(Request.Method.GET, "https://dummyjson.com/products", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        try {
                                JSONObject alldata = new JSONObject(response);
                                JSONArray product = alldata.getJSONArray("products");

                            for (int i = 0; i < product.length(); i++)
                            {

                                JSONObject singleProduct = product.getJSONObject(i);

                                String title = singleProduct.getString("title");
                                String description = singleProduct.getString("description");
                                String category = singleProduct.getString("category");


                                Log.d("====r====", " title " + i + title);
                                Log.d("====d====", "onResponse: description" + i + description);
                                Log.d("====c====", "onResponse: category" + i + category);
                            }
                        } catch (JSONException e) {

                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        Log.e("====r====", "onErrorResponse: " + error.getLocalizedMessage());

                    }
                });

                que.add(rs);
            }
        });


    }
}