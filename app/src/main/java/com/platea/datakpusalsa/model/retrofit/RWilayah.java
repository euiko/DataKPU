package com.platea.datakpusalsa.model.retrofit;

import com.platea.datakpusalsa.model.database.Wilayah;

import java.util.List;

/**
 * Created by euiko on 12/12/16.
 */

public class RWilayah {
    private String comm;
    private String wilayah;
    private String records;
    private List<Wilayah> data;

    private RWilayah() {
        super();
    }

    private RWilayah(String comm, String wilayah, String records, List<Wilayah> data) {
        super();
        this.comm = comm;
        this.wilayah = wilayah;
        this.records = records;
        this.data = data;
    }

    public List<Wilayah> getData() {
        return data;
    }

    public void setData(List<Wilayah> data) {
        this.data = data;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
}
