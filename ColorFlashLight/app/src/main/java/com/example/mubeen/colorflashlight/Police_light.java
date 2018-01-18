package com.example.mubeen.colorflashlight;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Police_light extends AppCompatActivity {
    RelativeLayout uppr, lower;
    MediaPlayer sound;
    Button bsound;
    boolean check = false, isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_light);
        bsound = (Button) findViewById(R.id.sound);
        uppr = (RelativeLayout) findViewById(R.id.uppr);
        lower = (RelativeLayout) findViewById(R.id.lower);
        bsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check == false) {
                    sound = MediaPlayer.create(Police_light.this, R.raw.police_siren);
                    sound.setLooping(true);
                    sound.start();
                    check = true;
                    isPlaying = true;
                    bsound.setBackgroundResource(R.mipmap.on);

                } else {
                    bsound.setBackgroundResource(R.mipmap.off);
                    sound.stop();
                    check = false;
                    isPlaying = false;
                }
            }
        });

        uppr();
        lower();
    }

    public void uppr() {


        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                uppr.setAlpha((Float) animation.getAnimatedValue());
            }
        });

        animator.setDuration(230);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(-1);
        animator.start();
    }

    public void lower() {


        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                lower.setAlpha((Float) animation.getAnimatedValue());
            }
        });

        animator.setDuration(200);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(-1);
        animator.start();
    }

    @Override
    public void onBackPressed() {
        if (isPlaying == false) {
            Intent intent = new Intent(Police_light.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else if (isPlaying == true) {

            sound.stop();
            Intent intent = new Intent(Police_light.this, MainActivity.class);
            startActivity(intent);
            finish();
        }


    }
}
