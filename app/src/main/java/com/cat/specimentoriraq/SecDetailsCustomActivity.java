package com.cat.specimentoriraq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class SecDetailsCustomActivity extends AppCompatActivity {

    ImageView back,imgTitle, imgContent, imgMore;
    int currentSliderPosition = 1;
    int sliderLength,sectionNo;
    boolean hasReadMore;
    RadioGroup radioGroup;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_details_custom);
        initFields();
        back.setOnClickListener(v -> onBackPressed());

        imgMore.setOnClickListener(v -> {
            Intent i = new Intent(getBaseContext(), ReadMoreActivity.class);
            i.putExtra("sec_no", sectionNo);
            startActivity(i);
        });
        setSliderImage(currentSliderPosition);
        imgContent.setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                if (currentSliderPosition != 1) {
                    currentSliderPosition--;
                    setSliderImage(currentSliderPosition);
                    ((RadioButton)radioGroup.getChildAt(currentSliderPosition-1)).setChecked(true);
                }
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                if (currentSliderPosition != sliderLength) {
                    currentSliderPosition++;
                    setSliderImage(currentSliderPosition);
                    ((RadioButton)radioGroup.getChildAt(currentSliderPosition-1)).setChecked(true);
                }
            }
        });

    }

    private void initFields() {
        sectionNo=getIntent().getIntExtra("sec_no",0);
        sliderLength=getIntent().getIntExtra("slider_length",0);
        hasReadMore=getIntent().getBooleanExtra("hasReadMore",false);
        back = findViewById(R.id.back);
        imgTitle = findViewById(R.id.imgTitle);
        imgContent = findViewById(R.id.imgContent);
        imgMore = findViewById(R.id.imgMore);
        radioGroup = findViewById(R.id.radioGroup);
        addRadioButtons(sliderLength);
        setTitleImage();
    }


    private void setTitleImage() {
        String variableValue = "sec"+sectionNo+"_title";
        imgTitle.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));
    }


    private void setSliderImage(int currentSliderPosition) {
        String variableValue = "sec"+sectionNo+"_slider_" + currentSliderPosition;
        imgContent.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));

        if (currentSliderPosition == sliderLength && hasReadMore){
            imgMore.setVisibility(View.VISIBLE);
        }else {
            imgMore.setVisibility(View.GONE);
        }
    }

    public void addRadioButtons(int number) {
        radioGroup.setOrientation(LinearLayout.HORIZONTAL);
        //
        for (int i = 1; i <= number; i++) {
            RadioButton rdbtn = new RadioButton(this);
            rdbtn.setId(View.generateViewId());
            rdbtn.setButtonDrawable(R.drawable.radio);
            rdbtn.setText("     ");
            radioGroup.addView(rdbtn);
        }


        ((RadioButton)radioGroup.getChildAt(0)).setChecked(true);
    }


}