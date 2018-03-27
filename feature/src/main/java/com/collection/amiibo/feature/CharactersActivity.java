package com.collection.amiibo.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CharactersActivity extends AppCompatActivity {


    private final String image_titles[]={
            "img1"
    };




    private final Integer imagge_ids[]={
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_darkpit,
            R.drawable.inte,
            R.drawable.sb_donkeykong,
            R.drawable.inte,
            R.drawable.sb_duckhunt,
            R.drawable.sb_falco,
            R.drawable.sb_fox,
            R.drawable.inte,
            R.drawable.sb_greninja,
            R.drawable.sb_ike,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_kirby,
            R.drawable.inte,
            R.drawable.sb_littlemac,
            R.drawable.inte,
            R.drawable.sb_lucas,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_marth,
            R.drawable.inte,
            R.drawable.sb_metaknight,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_mrgameandwatch,
            R.drawable.sb_ness,
            R.drawable.inte,
            R.drawable.sb_palutena,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_pit,
            R.drawable.inte,
            R.drawable.sb_rob,
            R.drawable.sb_robjapan,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_ryu,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_shulk,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_wario,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.inte,
            R.drawable.sb_bayonetta,
            R.drawable.sb_bayonettaplayer2,
            R.drawable.sb_cloud,
            R.drawable.sb_cloudplayer2,
            R.drawable.sb_corrin,
            R.drawable.sb_corrinplayer2,

            R.drawable.sm30th_mariomodern8bit,

            R.drawable.loz_link8bit,

            R.drawable.sp_inklingboyblue,
            R.drawable.sp_inklingboygreen,
            R.drawable.sp_inklinggirlpink,
            R.drawable.sp_inklingpurple,

            R.drawable.od_bowserweddingoutfit,
            R.drawable.od_marioweddingoutfit,
            R.drawable.od_peachweddingoutfit,

            R.drawable.ac_cyrus,
            R.drawable.ac_reese,
            R.drawable.ac_rover,
            R.drawable.fe_alm,
            R.drawable.fe_celica,
            R.drawable.fe_chrom,
            R.drawable.fe_tiki,
            R.drawable.loz_bokoblin,
            R.drawable.loz_guardian,
            R.drawable.loz_linkarcher,
            R.drawable.loz_linkrider,
            R.drawable.loz_linkskywardsword,
            R.drawable.loz_linktwilightprincess,
            R.drawable.loz_majorasmask,
            R.drawable.loz_wolflink,
            R.drawable.loz_zeldabreathofthewild,
            R.drawable.mt_metroid,
            R.drawable.mt_samusaran,
            R.drawable.pk_pikmin,
            R.drawable.sm_bowser,
            R.drawable.sm_princesspeach,
            R.drawable.sm_superwaluigi,
            R.drawable.sm_yoshi,
            R.drawable.sp_inklinggirlorange,
            R.drawable.sp_inklingorange,
            R.drawable.yww_lightblueyarnyoshi


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        RecyclerView recyclerView = findViewById(R.id.gallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),4);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Cell> cells = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), cells);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Cell> prepareData() {
        ArrayList<Cell> theimage = new ArrayList<>();
        for (int i = 0; i < imagge_ids.length; i++) {
            Cell cell = new Cell();
            cell.setTitle(image_titles[0]);
            cell.setImg(imagge_ids[i]);
            theimage.add(cell);
        }
        return theimage;
    }
}
