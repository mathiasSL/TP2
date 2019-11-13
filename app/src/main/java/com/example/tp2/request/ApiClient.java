package com.example.tp2.request;

import android.util.Log;

import com.example.tp2.model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class ApiClient {

    private static final String PATH="https://ws.smn.gob.ar/map_items/";
    private static MyApiInterface myApiInterface;

    public static MyApiInterface getMyApiClient()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.d("Mensaje",retrofit.baseUrl().toString());
        myApiInterface=retrofit.create(MyApiInterface.class);
        return myApiInterface;
    }

    public interface MyApiInterface{

        @GET("weather")
        Call<List<Item>> leer();
    }
}
