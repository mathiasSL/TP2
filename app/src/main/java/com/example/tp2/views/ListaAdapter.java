package com.example.tp2.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tp2.R;
import com.example.tp2.model.Item;

import java.util.List;

public class ListaAdapter extends ArrayAdapter<Item> {

    private Context context;
    private List<Item> lista;
    private LayoutInflater li;

    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li=li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;
        if(itemView == null)
        {
            itemView=li.inflate(R.layout.item,parent,false);
        }


        Item item = lista.get(position);

        TextView id = itemView.findViewById(R.id.tvId);
        id.setText(item.get_id());

        TextView name = itemView.findViewById(R.id.tvName);
        name.setText(item.getName());

        return itemView;
    }
}
