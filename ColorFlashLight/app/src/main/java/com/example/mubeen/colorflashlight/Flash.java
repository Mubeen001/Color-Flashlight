package com.example.mubeen.colorflashlight;

import android.content.Intent;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Flash extends AppCompatActivity {

    private ImageButton btnSwitch;
    private android.hardware.Camera camera;
    private boolean isFlashOn=false;
    private boolean hasFlash;
ImageView bswitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        bswitch=(ImageView)findViewById(R.id.bswitch) ;
        camera= android.hardware.Camera.open();
        bswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
               if (!isFlashOn){
                android.hardware.Camera.Parameters parameters=camera.getParameters();
                parameters.setFlashMode(android.hardware.Camera.Parameters.FLASH_MODE_TORCH);
                camera.setParameters(parameters);
                camera.startPreview();
                isFlashOn=true;
                   bswitch.setImageResource(R.drawable.on);
               }
               else {
                   android.hardware.Camera.Parameters parameters=camera.getParameters();
                   parameters.setFlashMode(android.hardware.Camera.Parameters.FLASH_MODE_OFF);
                   camera.setParameters(parameters);
                   camera.startPreview();
                   isFlashOn=false;
                   bswitch.setImageResource(R.drawable.off);
               }
                }catch (Exception e){

                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        android.hardware.Camera.Parameters parameters=camera.getParameters();
        parameters.setFlashMode(android.hardware.Camera.Parameters.FLASH_MODE_OFF);
        camera.setParameters(parameters);
        camera.startPreview();
        Intent intent=new Intent(Flash.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
