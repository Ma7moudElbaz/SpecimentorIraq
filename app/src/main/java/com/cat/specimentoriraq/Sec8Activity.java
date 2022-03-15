package com.cat.specimentoriraq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.github.islamkhsh.CardSliderViewPager;

import java.util.ArrayList;

public class Sec8Activity extends AppCompatActivity {

    ImageView back;
    CardSliderViewPager slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec8);
        back = findViewById(R.id.back);
        back.setOnClickListener(v -> onBackPressed());

        ArrayList<Slider_item> slider_items = new ArrayList<>();
        slider_items.add(new Slider_item(R.drawable.sec8_slider_1,false));
        slider_items.add(new Slider_item(R.drawable.sec8_slider_2,true));
        slider_items.add(new Slider_item(R.drawable.sec8_slider_3,false));
        slider_items.add(new Slider_item(R.drawable.sec8_slider_4,true));

        slider = findViewById(R.id.slider);
        slider.setAdapter(new Slider_adapter(getBaseContext(),slider_items,8));


    }
}