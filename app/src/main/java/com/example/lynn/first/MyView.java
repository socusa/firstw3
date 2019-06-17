package com.example.lynn.first;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import static com.example.lynn.first.MainActivity.*;

public class MyView extends LinearLayout {
    public MyView(Context context) {
        super(context);

        button = new Button(context);

        button.setOnClickListener(listener);

        addView(button);

        number = new EditText(context);

        addView(number);
    }
}
