package com.example.odysscompta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SellActivity extends AppCompatActivity {
    private int croisSimp;
    private int croisSimp_pr;
    private final int croisSimp_un = 200; 
    private int croisChoc;
    private int croisChoc_pr;
    private final int croisChoc_un = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
    }
}