package com.ricardogwill.upbuttonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openA(View view) {
        Intent openAIntent = new Intent(getApplicationContext(), ActivityA.class);
        startActivity(openAIntent);
    }
}
