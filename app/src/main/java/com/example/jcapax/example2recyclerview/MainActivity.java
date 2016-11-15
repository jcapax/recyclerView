package com.example.jcapax.example2recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> list = new ArrayList<Persona>();

        list.add(new Persona("juan", "sucre", 35));
        list.add(new Persona("carlos", "israel", 38));
        list.add(new Persona("corcho", "moscu", 39));
        list.add(new Persona("chabe", "new york", 3));
        list.add(new Persona("diego", "los angeles", 10));
        list.add(new Persona("ivan", "washington", 10));
        list.add(new Persona("maia", "miami", 3));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);

        Adpatador adpatador = new Adpatador(list);

        recyclerView.setAdapter(adpatador);


    }
}
