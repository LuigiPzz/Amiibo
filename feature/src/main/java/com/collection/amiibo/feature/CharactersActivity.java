package com.collection.amiibo.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CharactersActivity extends AppCompatActivity {

    private final String image_titles[]={
            "img1",
            "img2",
            "img3",
            "img4",
            "img5",
            "img6",
            "img7",
            "img8"
    };

    private final Integer imagge_ids[]={
            R.drawable.sm_luigistandardedition,
            R.drawable.sm_mariostandardedition,
            R.drawable.sm_supertoad,
            R.drawable.sm_donkeykong,
            R.drawable.sm_superwario,

            R.drawable.od_bowserweddingoutfit,
            R.drawable.od_marioweddingoutfit,
            R.drawable.od_peachweddingoutfit
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        RecyclerView recyclerView = findViewById(R.id.gallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Cell> cells = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), cells);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Cell> prepareData() {
        ArrayList<Cell> theimage = new ArrayList<>();
        for (int i = 0; i < image_titles.length; i++) {
            Cell cell = new Cell();
            cell.setTitle(image_titles[i]);
            cell.setImg(imagge_ids[i]);
            theimage.add(cell);
        }
        return theimage;
    }
}
