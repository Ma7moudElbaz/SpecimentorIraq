package com.cat.specimentoriraq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.github.islamkhsh.CardSliderViewPager;

import java.util.ArrayList;

public class SecDetailsActivity extends AppCompatActivity {

    ImageView back,title;
    CardSliderViewPager slider;
    ArrayList<Slider_item> slider_items;
    int secNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_details);
        initFields();
        back.setOnClickListener(v -> onBackPressed());
    }

    private void initFields() {
        secNo = getIntent().getIntExtra("sec_no",0);
        back = findViewById(R.id.back);
        title = findViewById(R.id.title);
        slider =  findViewById(R.id.slider);
        slider_items= new ArrayList<>();

        if (secNo!=0){
            setTitleImage();
            setSliderItems(secNo);
        }
    }

    private void setTitleImage() {
        String variableValue = "sec"+secNo+"_title";
        title.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));
    }

    private void setSliderItems(int secNo) {
        switch (secNo){
            case 1:
                slider_items.add(new Slider_item(R.drawable.sec1_slider_1,false));
                break;
            case 2:
                slider_items.add(new Slider_item(R.drawable.sec2_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec2_slider_2,false));
                slider_items.add(new Slider_item(R.drawable.sec2_slider_3,false));
                break;
            case 3:
                slider_items.add(new Slider_item(R.drawable.sec3_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec3_slider_2,false));
                slider_items.add(new Slider_item(R.drawable.sec3_slider_3,false));
                break;
            case 4:
                slider_items.add(new Slider_item(R.drawable.sec4_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec4_slider_2,false));
                break;
            case 5:
                slider_items.add(new Slider_item(R.drawable.sec5_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec5_slider_2,false));
                break;
            case 6:
                slider_items.add(new Slider_item(R.drawable.sec6_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec6_slider_2,true));
                break;
            case 7:
                slider_items.add(new Slider_item(R.drawable.sec7_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec7_slider_2,true));
                break;
            case 8:
                slider_items.add(new Slider_item(R.drawable.sec8_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec8_slider_2,false));
                slider_items.add(new Slider_item(R.drawable.sec8_slider_3,false));
                slider_items.add(new Slider_item(R.drawable.sec8_slider_4,true));
                break;
            case 9:
                slider_items.add(new Slider_item(R.drawable.sec9_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec9_slider_2,false));
                slider_items.add(new Slider_item(R.drawable.sec9_slider_3,false));
                slider_items.add(new Slider_item(R.drawable.sec9_slider_4,true));
                break;
            case 10:
                slider_items.add(new Slider_item(R.drawable.sec10_slider_1,false));
                slider_items.add(new Slider_item(R.drawable.sec10_slider_2,true));
                break;
            case 11:
                slider_items.add(new Slider_item(R.drawable.sec11_slider_1,true));
                break;
            case 12:
                slider_items.add(new Slider_item(R.drawable.sec12_slider_1,false));
                break;
        }

        slider.setAdapter(new Slider_adapter(getBaseContext(),slider_items,secNo));
    }
}