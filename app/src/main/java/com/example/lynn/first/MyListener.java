package com.example.lynn.first;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

import static com.example.lynn.first.MainActivity.*;

public class MyListener implements View.OnClickListener {

    public int color() {
        int red = (int)(256*Math.random());
        int green = (int)(256*Math.random());
        int blue = (int)(256*Math.random());

        return(Color.argb(255,red,green,blue));
    }
    @Override
    public void onClick(View view) {
        int numberOfColors = 2;

        try {
            numberOfColors = Integer.parseInt(number.getText().toString());
        } catch(Exception e) {

        }
        int[] colors = new int[numberOfColors];

        for(int counter=0;counter<colors.length;counter++)
            colors[counter] = color();

        GradientDrawable drawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP,colors);

        myView.setBackground(drawable);

    }
}
