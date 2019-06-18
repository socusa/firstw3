package com.example.lynn.first;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.lynn.first.MainActivity.*;

public class MyView extends RelativeLayout {
    public MyView(Context context) {
        super(context);

        Point sizeOfScreen = Util.sizeOfScreen(context);

        width = sizeOfScreen.x;
        height = sizeOfScreen.y;

        button = new Button(context);

        button.setOnClickListener(listener);

        addView(button);

        TextView textView = new TextView(context);

        textView.setText("Number of Colors");

        addView(textView);

        number = new EditText(context);

        addView(number);

        TextView textView1 = new TextView(context);

        textView1.setText("Delay");

        addView(textView1);

        displayArea = new View(context);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width,3*height/4);

        layoutParams.leftMargin = 0;
        layoutParams.topMargin = height/4;

        displayArea.setLayoutParams(layoutParams);

        addView(displayArea);
    }
}
