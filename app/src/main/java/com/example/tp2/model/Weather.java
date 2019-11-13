package com.example.tp2.model;

import androidx.annotation.NonNull;

public class Weather {

    private String description;
    private String tempDesc;

    public Weather(String description, String tempDesc) {
        this.description = description;
        this.tempDesc = tempDesc;
    }

    public Weather() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTempDesc() {
        return tempDesc;
    }

    public void setTempDesc(String tempDesc) {
        this.tempDesc = tempDesc;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
