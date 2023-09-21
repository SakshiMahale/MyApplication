package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.graphics.drawable.ColorDrawable;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#0F9D58"));
        actionBar.setBackgroundDrawable(colorDrawable);

        Toast.makeText(MainActivity.this, "Circular Image View " + "without using any library", Toast.LENGTH_LONG).show();
    }
}