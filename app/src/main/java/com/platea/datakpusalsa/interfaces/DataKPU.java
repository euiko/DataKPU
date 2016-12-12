package com.platea.datakpusalsa.interfaces;

import com.platea.datakpusalsa.model.retrofit.RWilayah;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by euiko on 12/12/16.
 */

public interface DataKPU {
    @GET("open/v1/api.php?cmd=wilayah_browse&")
    Call<RWilayah> wilayah_browse(@Query("wilayah_id") String idWil);
}
