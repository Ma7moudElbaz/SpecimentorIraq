package com.cat.specimentoriraq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AbbreviationsActivity extends AppCompatActivity {

    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbreviations);
        back = findViewById(R.id.back);
        back.setOnClickListener(v -> onBackPressed());
    }
}