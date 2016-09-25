package com.agggh.pictionary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class GameActivity extends AppCompatActivity {

    int activeColor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        GridView gridview = (GridView) findViewById(R.id.artist_palette);
        gridview.setAdapter(new PaletteItemAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                PaletteItem item = (PaletteItem) v;
                activeColor = item.getColorVal();
                Toast.makeText(GameActivity.this, "" + activeColor,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}

