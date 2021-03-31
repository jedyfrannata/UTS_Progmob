package com.example.granat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvgranat;
    private ArrayList<Granat> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvgranat = findViewById(R.id.rv_granat);
        rvgranat.setHasFixedSize(true);

        list.addAll(DataGranat.getListdata());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvgranat.setLayoutManager(new LinearLayoutManager(this));
        ListGranatAdapter listMakananAdapter = new ListGranatAdapter(list);
        rvgranat.setAdapter(listMakananAdapter);
    }
}
