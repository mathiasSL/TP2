package com.example.tp2.model;

import androidx.annotation.NonNull;

public class Item {

    private String _id;
    private String name;
    private String province;
    private Weather clima;

    public Item(String _id, String name, String province, Weather clima) {
        this._id = _id;
        this.name = name;
        this.province = province;
        this.clima = clima;
    }

    public Item() {

    }

    public Weather getClima() {
        return clima;
    }

    public void setClima(Weather clima) {
        this.clima = clima;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
