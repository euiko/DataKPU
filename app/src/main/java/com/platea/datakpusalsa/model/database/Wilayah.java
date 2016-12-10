package com.platea.datakpusalsa.model.database;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by euiko on 12/9/16.
 */

@Table(name = "wilayah", id = "wId")
public class Wilayah extends Model {
    @Column(name = "wilayah_id")
    public int wilayah_id;
    @Column(name = "nama")
    public String nama;
    @Column(name = "parent")
    public int parent;
    @Column(name = "daerah")
    public int daerah;
    @Column(name = "tingkat")
    public int tingkat;
    @Column(name = "singkatan")
    public String singkatan;

    public Wilayah() {
        super();
    }

    public Wilayah(int wilayah_id, String nama, int parent, int daerah, int tingkat, String singkatan) {
        super();
        this.wilayah_id = wilayah_id;
        this.nama = nama;
        this.parent = parent;
        this.daerah = daerah;
        this.tingkat = tingkat;
        this.singkatan = singkatan;
    }

    public List<Wilayah> getAll() {
        return new Select().from(Wilayah.class).execute();
    }

    public List<Wilayah> getAllAtNama(String nama) {
        return new Select().from(Wilayah.class).where("nama = ?", nama).execute();
    }

    public List<Wilayah> getAllAtTingkat(int tingkat) {
        return new Select().from(Wilayah.class).where("tingkat = ?", tingkat).execute();
    }

    public void insertWilayah(int wilayah_id, String nama, int parent, int daerah, int tingkat, String singkatan) {
        this.wilayah_id = wilayah_id;
        this.nama = nama;
        this.parent = parent;
        this.daerah = daerah;
        this.tingkat = tingkat;
        this.singkatan = singkatan;
        this.save();
    }
}