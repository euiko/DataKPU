package com.platea.datakpusalsa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.platea.datakpusalsa.adapter.RecyclerViewRecyclerAdapter;
import com.platea.datakpusalsa.model.ItemModel;
import com.platea.datakpusalsa.util.DividerItemDecoration;
import com.platea.expandablelayout.Utils;

import java.util.ArrayList;
import java.util.List;

public class WilayahActivity extends AppCompatActivity {

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, WilayahActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_list_wilayah);
        getSupportActionBar().setTitle(WilayahActivity.class.getSimpleName());

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_list_wilayah);
        recyclerView.addItemDecoration(new DividerItemDecoration(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<ItemModel> data = new ArrayList<>();
        data.add(new ItemModel(
                "0 ACCELERATE_DECELERATE_INTERPOLATOR",
                R.color.material_red_500,
                R.color.material_red_300,
                Utils.createInterpolator(Utils.ACCELERATE_DECELERATE_INTERPOLATOR)));
        data.add(new ItemModel(
                "1 ACCELERATE_INTERPOLATOR",
                R.color.material_pink_500,
                R.color.material_pink_300,
                Utils.createInterpolator(Utils.ACCELERATE_INTERPOLATOR)));
        data.add(new ItemModel(
                "2 BOUNCE_INTERPOLATOR",
                R.color.material_purple_500,
                R.color.material_purple_300,
                Utils.createInterpolator(Utils.BOUNCE_INTERPOLATOR)));
        data.add(new ItemModel(
                "3 DECELERATE_INTERPOLATOR",
                R.color.material_deep_purple_500,
                R.color.material_deep_purple_300,
                Utils.createInterpolator(Utils.DECELERATE_INTERPOLATOR)));
        data.add(new ItemModel(
                "4 FAST_OUT_LINEAR_IN_INTERPOLATOR",
                R.color.material_indigo_500,
                R.color.material_indigo_300,
                Utils.createInterpolator(Utils.FAST_OUT_LINEAR_IN_INTERPOLATOR)));
        data.add(new ItemModel(
                "5 FAST_OUT_SLOW_IN_INTERPOLATOR",
                R.color.material_blue_500,
                R.color.material_blue_300,
                Utils.createInterpolator(Utils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
        data.add(new ItemModel(
                "6 LINEAR_INTERPOLATOR",
                R.color.material_light_blue_500,
                R.color.material_light_blue_300,
                Utils.createInterpolator(Utils.LINEAR_INTERPOLATOR)));
        data.add(new ItemModel(
                "7 LINEAR_OUT_SLOW_IN_INTERPOLATOR",
                R.color.material_cyan_500,
                R.color.material_cyan_300,
                Utils.createInterpolator(Utils.LINEAR_OUT_SLOW_IN_INTERPOLATOR)));
        recyclerView.setAdapter(new RecyclerViewRecyclerAdapter(data));
    }
}
