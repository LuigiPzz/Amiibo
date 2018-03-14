package com.collection.amiibo.feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_characters = findViewById(R.id.characters);
        bt_characters.setOnClickListener(
                        new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Intent ac = new Intent(getApplicationContext(), CharactersActivity.class);
                                startActivity(ac);
                            }
                        }
        );

        Button bt_cards = findViewById(R.id.cards);
        //registra la callback dell'evento del click (codice eseguito al click)
        bt_cards.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent ac = new Intent(getApplicationContext(), CardsActivity.class);
                        startActivity(ac);
                    }
                }
        );
 }

}
