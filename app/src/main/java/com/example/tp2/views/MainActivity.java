package com.example.tp2.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.tp2.R;
import com.example.tp2.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText buscar;
    ListView lista;
    List<Item> l;
    MainViewModel mainViewModel;

    private ArrayList<Item> listaItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
    }

    public void inicializar()
    {
        buscar= findViewById(R.id.etBuscar);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getLista().observe(this, new Observer<List<Item>>(){
            @Override
            public void onChanged(List<Item> s) {
                l = s;
                ArrayAdapter<Item> adapter = new ListaAdapter(getApplicationContext(),R.layout.item, l, getLayoutInflater());
                lista= findViewById(R.id.lvLista);
                lista.setAdapter(adapter);
            }
        });
    }

    public void mostrar(View v)
    {
        mainViewModel.buscarVM(buscar.getText().toString());
        
    }
}

