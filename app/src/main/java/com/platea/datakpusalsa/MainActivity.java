package com.platea.datakpusalsa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.platea.datakpusalsa.model.database.Wilayah;

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


        //startActivity(new Intent(this, WilayahActivity.class));
    }
}
