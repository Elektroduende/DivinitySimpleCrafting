package com.tumblr.svandesigns.divinitysimplecrafting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class gifactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifactivity);


        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new
                            Intent(gifactivity.this, ScrollFragment.class);
                    startActivity(intent);
                }
            }
        };
        timer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
