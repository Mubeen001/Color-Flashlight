package com.example.mubeen.colorflashlight;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView main=(TextView)findViewById(R.id.textGrid);
        Typeface custom=Typeface.createFromAsset(getAssets(), "DriftType-Regular.ttf");
        main.setTypeface(custom);

        findViewById(R.id.flash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Flash.class);
                startActivity(intent);
                finish();
            }
        });
        findViewById(R.id.screen_light).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Screen_light.class);
                startActivity(intent);
                finish();
            }
        });
        findViewById(R.id.police_light).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Police_light.class);
                startActivity(intent);
                finish();
            }
        });
        findViewById(R.id.ambulance).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ambulance.class);
                startActivity(intent);
                finish();
            }
        });
        findViewById(R.id.candle_light).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Candle_light.class);
                startActivity(intent);
                finish();
            }
        });
        findViewById(R.id.spiral).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Spiral.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
