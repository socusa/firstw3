package com.example.lynn.first;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static Button button;
    public static EditText number;
    public static EditText delay;
    public static int width;
    public static int height;
    public static View displayArea;
    public static MyThread myThread;

    public static int color() {
        int red = (int)(256*Math.random());
        int green = (int)(256*Math.random());
        int blue = (int)(256*Math.random());

        return(Color.argb(255,red,green,blue));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView = new MyView(this));
    }

    protected void onDestroy() {
        super.onDestroy();

        if (myThread != null)
            myThread.stop();
    }
}
