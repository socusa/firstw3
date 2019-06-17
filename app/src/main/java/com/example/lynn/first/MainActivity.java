package com.example.lynn.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static Button button;
    public static EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView = new MyView(this));
    }
}
