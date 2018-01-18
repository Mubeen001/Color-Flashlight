package com.example.mubeen.colorflashlight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Candle_light extends AppCompatActivity {
    GifImageView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candle_light);

        gifView = (GifImageView) findViewById(R.id.candle);


        try {
            InputStream inputStream = getAssets().open("candela.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifView.setBytes(bytes);
            gifView.startAnimation();


        } catch (IOException e) {

        }
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Candle_light.this,MainActivity.class);
        startActivity(intent);
        finish();
        gifView.stopAnimation();
    }
}
