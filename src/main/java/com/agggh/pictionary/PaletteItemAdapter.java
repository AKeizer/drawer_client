package com.agggh.pictionary;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;


public class PaletteItemAdapter extends BaseAdapter {

    private Context mContext;
    private PaletteItem[] items;
    private int[] colors;

    public PaletteItemAdapter(Context c) {
        mContext = c;
        items = new PaletteItem[5];
        colors = new int[]{Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.YELLOW};
//        for (int i = 0; i < 5; i++) {
//            items[i] = new PaletteItem(mContext, colors[i]);
//        }
    }

    public int getCount() {
        return 5;
    }

    public PaletteItem getItem(int position) {
        return items[position];
    }

    public long getItemId(int pos) {
        return pos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        PaletteItem paletteItem;
        if (convertView == null) {
            paletteItem = new PaletteItem(mContext, colors[position]);
            paletteItem.setLayoutParams(new GridView.LayoutParams(85, 85));
            paletteItem.setPadding(8, 8, 8, 8);
        }
        else {
            paletteItem = (PaletteItem) convertView;
        }
        items[position] = paletteItem;
        return paletteItem;
    }

}
