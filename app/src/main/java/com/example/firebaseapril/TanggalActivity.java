package com.example.firebaseapril;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.sql.Struct;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TanggalActivity extends AppCompatActivity {
    private TextView textClock, textDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanggal);
        textClock = findViewById(R.id.clock);
        textDate = findViewById(R.id.date);

//        jam bergerak
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                @SuppressLint("SimpleDateFormat")
                DateFormat clockFormat = new SimpleDateFormat("HH:mm:ss");

                @SuppressLint("SimpleDateFormat")
                DateFormat dateFormat = new SimpleDateFormat("EEE, dd MMMM yyyy");

                        textClock.setText(clockFormat.format(new Date()));
                        textDate.setText(dateFormat.format(new Date()));

                handler.postDelayed(this, 1000);

            }
        });



    }


}