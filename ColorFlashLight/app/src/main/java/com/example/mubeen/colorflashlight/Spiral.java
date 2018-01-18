package com.example.mubeen.colorflashlight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Spiral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiral);

    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Spiral.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
