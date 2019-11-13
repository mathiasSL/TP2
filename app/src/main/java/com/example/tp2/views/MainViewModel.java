package com.example.tp2.views;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tp2.model.Item;
import com.example.tp2.request.ApiClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<Item>> lista;
    private List<Item> resultado;
    List<Item> listaAux;
    String res;

    public LiveData<List<Item>> getLista() {
        if (lista == null)
        {
            lista=new MutableLiveData<>();
        }
        return lista;
    }

    public void buscarVM(String busca){
        Call<List<Item>> datos = ApiClient.getMyApiClient().leer();
        res = busca;
        datos.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                if(response.isSuccessful())
                {

                    resultado = response.body();
                    listaAux = new ArrayList<Item>();

                    for(Item x:resultado)
                    {
                        if(x.getName().equals(res))
                        {
                            listaAux.add(x);
                        }
                    }
                    lista.postValue(listaAux);
                }
            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                Log.d("ID:",t.getMessage());
            }
        });
    }

    public List<Item> getResultado() {
        return resultado;
    }
}
