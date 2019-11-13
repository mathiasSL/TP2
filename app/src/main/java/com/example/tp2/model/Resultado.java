package com.example.tp2.model;

import androidx.annotation.NonNull;

public class Resultado {

    private Item item;

    public Resultado(Item item) {
        this.item = item;
    }

    public Resultado() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
