package com.platea.datakpusalsa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.gson.GsonBuilder;
import com.platea.datakpusalsa.interfaces.DataKPU;
import com.platea.datakpusalsa.model.database.Wilayah;
import com.platea.datakpusalsa.model.retrofit.RWilayah;

import java.lang.reflect.Modifier;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(MainActivity.class.getSimpleName());

        Wilayah wilayah = new Wilayah();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.kpu.go.id")
                .addConverterFactory(GsonConverterFactory.create(
                        new GsonBuilder()
                                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
                                .serializeNulls()
                                .create()
                ))
                .build();

        DataKPU service = retrofit.create(DataKPU.class);

        final Call<RWilayah> listWilayah = service.wilayah_browse("3");

        listWilayah.enqueue(new Callback<RWilayah>() {
            @Override
            public void onResponse(Call<RWilayah> call, Response<RWilayah> response) {
                Log.i(TAG, "onResponse: " + response.body().getData().get(0).nama);
            }

            @Override
            public void onFailure(Call<RWilayah> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getMessage());
            }
        });

        findViewById(R.id.buttonMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WilayahActivity.class));
            }
        });

        //startActivity(new Intent(this, WilayahActivity.class));
    }
}
