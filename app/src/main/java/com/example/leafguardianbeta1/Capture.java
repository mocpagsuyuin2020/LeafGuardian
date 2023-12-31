package com.example.leafguardianbeta1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Capture extends AppCompatActivity {

    ImageButton imagebtnBack;
    Button btncapture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);

        imagebtnBack = findViewById(R.id.imagebtnBack);
        btncapture = findViewById(R.id.btncapture);

        imagebtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capture.this, CaptureOrUpload.class);
                startActivity(intent);
            }
        });

        btncapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capture.this, Home.class);
                startActivity(intent);
            }
        });
    }
}