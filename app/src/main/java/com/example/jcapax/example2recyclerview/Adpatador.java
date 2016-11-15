package com.example.jcapax.example2recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jcapax on 14/11/16.
 */

public class Adpatador extends RecyclerView.Adapter<Adpatador.PersonaViewHolder>{

    List<Persona> list;

    public Adpatador(List<Persona> list) {
        this.list = list;
    }

    @Override
    public PersonaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                                inflate(R.layout.row_item, parent, false);
        PersonaViewHolder holder = new PersonaViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(PersonaViewHolder holder, int position) {
        holder.nombre.setText(list.get(position).getNombre());
        holder.ciudad.setText(list.get(position).getCiudad());
        holder.edad.setText(Integer.toString(list.get(position).getEdad()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder{

        TextView nombre;
        TextView ciudad;
        TextView edad;

        public PersonaViewHolder(View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.txtNombrePersona);
            ciudad = (TextView) itemView.findViewById(R.id.txtCiudad);
            edad   = (TextView) itemView.findViewById(R.id.txtEdad);
        }
    }
}
