package com.example.mubeen.colorflashlight;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Ambulance extends AppCompatActivity {
    LinearLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);
        screen = (LinearLayout) findViewById(R.id.screen);

        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                screen.setAlpha((Float) animation.getAnimatedValue());
            }
        });

        animator.setDuration(150);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(-1);
        animator.start();

    }

    @Override
    public void onBackPressed() {

        Intent intent=new Intent(Ambulance.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
