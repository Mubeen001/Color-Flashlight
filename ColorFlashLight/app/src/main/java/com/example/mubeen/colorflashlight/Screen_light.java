package com.example.mubeen.colorflashlight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Screen_light extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_light);
        final ToggleButton screen=(ToggleButton)findViewById(R.id.screen);
        final LinearLayout lscreen=(LinearLayout)findViewById(R.id.lscreen);
        screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen.isChecked()){

                    lscreen.setBackgroundResource(R.color.white);
                }
                else {
                    lscreen.setBackgroundResource(R.color.black);

                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Screen_light.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
