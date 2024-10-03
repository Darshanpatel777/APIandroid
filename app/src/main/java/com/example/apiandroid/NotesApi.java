package com.example.apiandroid;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class NotesApi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_notes_api);

        RequestQueue que = Volley.newRequestQueue(NotesApi.this);
//        String url = "https://service.apikeeda.com/api/v1/notes";
//
//        StringRequest rs = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Log.d("======", "onResponse: " + response);
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("======", "onErrorResponse: ", error);
//            }
//        }) {
//
//            @Override
//            public Map<String, String> getHeaders() throws AuthFailureError {
//
//                HashMap<String, String> header = new HashMap<>();
//                header.put("x-apikeeda-key", "p1727874311879vqw342375297yx");
//
//                return header;
//            }
//
//            @Nullable
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                HashMap<String, String> params = new HashMap<>();
//                params.put("title", "new");
//                params.put("date", "2024-02-29T11:22:15.945Z");
//                params.put("description", "new_description");
//
//                return params;
//            }
//        };
//        que.add(rs);

        String url = "https://service.apikeeda.com/api/v1/notes";

        StringRequest rs = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("======", "onResponse: getdata " + response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("======", "onErrorResponse: ", error);
            }
        }) {

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {

                HashMap<String, String> header = new HashMap<>();
                header.put("x-apikeeda-key", "p1727874311879vqw342375297yx");

                return header;
            }

        };
        que.add(rs);

    }
}