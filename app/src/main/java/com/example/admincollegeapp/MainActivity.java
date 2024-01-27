package com.example.admincollegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
CardView uploadNotice, addGalleryImage, addEbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNotice);
        addGalleryImage = findViewById(R.id.addGalleryImage);
        addEbook = findViewById(R.id.addEbook);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.addNotice) {
            Intent intent = new Intent(MainActivity.this, UploadNotice.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.addGalleryImage) {
              Intent i= new Intent(MainActivity.this, UploadImage.class);
            startActivity(i);
        }
        if (v.getId() == R.id.addEbook) {
            Intent is= new Intent(MainActivity.this, UploadPdfActivity.class);
            startActivity(is);
        }
    }
}