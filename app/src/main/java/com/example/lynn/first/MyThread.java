package com.example.lynn.first;

import android.graphics.drawable.GradientDrawable;

import static com.example.lynn.first.MainActivity.color;
import static com.example.lynn.first.MainActivity.displayArea;
import static com.example.lynn.first.MainActivity.number;

import static com.example.lynn.first.MainActivity.*;

public class MyThread implements Runnable {
    private Thread thread;
    private boolean keepGoing;

    public MyThread() {
        thread = new Thread(this);

        keepGoing = true;

        thread.start();
    }

    private void pause(double seconds) {
        try {
            Thread.sleep((int)(seconds*1000));
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    public void stop() {
        keepGoing = false;
    }

    @Override
    public void run() {
        while (keepGoing) {
            double delay = 2;

            try {
                delay = Double.parseDouble(MainActivity.delay.getText().toString());
            } catch (Exception e) {

            }

            pause(delay);

            int numberOfColors = 2;

            try {
                numberOfColors = Integer.parseInt(number.getText().toString());
            } catch(Exception e) {

            }
            int[] colors = new int[numberOfColors];

            for(int counter=0;counter<colors.length;counter++)
                colors[counter] = color();

            final GradientDrawable drawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP,colors);

            displayArea.post(new Runnable() {

                @Override
                public void run() {
                    displayArea.setBackground(drawable);
                }
            });



        }


    }
}
