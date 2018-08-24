package com.ricardogwill.upbuttonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void openB(View view) {
        Intent openBIntent = new Intent(getApplicationContext(), ActivityB.class);
        startActivity(openBIntent);
    }
}
