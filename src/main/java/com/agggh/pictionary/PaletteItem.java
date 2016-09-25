package com.agggh.pictionary;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.View;


public class PaletteItem extends View {

    int displayColor;
    private Rect rectangle;
    private Paint paint;

    public PaletteItem(Context context, int color){
        super(context);
        int x = 0;
        int y = 0;
        int sideLength = 1000;
        displayColor = color;
        rectangle = new Rect(x, y, sideLength, sideLength);
        paint = new Paint();
        paint.setColor(color);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(rectangle, paint);
    }

    public int getColorVal(){
        return displayColor;
    }
}
